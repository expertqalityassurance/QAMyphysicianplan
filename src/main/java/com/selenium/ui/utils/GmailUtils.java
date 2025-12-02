package com.selenium.ui.utils;

import com.google.api.services.gmail.Gmail;
import com.google.api.services.gmail.model.*;
import com.selenium.ui.pageobjects.Register.RegisterPageTravelers;
import org.jsoup.Jsoup;

import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class GmailUtils {
    public static String Emailactual;
    public static String extractedPassword;
    public static String extractedOtp = null;


    // ==========================
    // PASSWORD METHOD
    // ==========================
    public static Map<String, String> getCredentialsFromEmail(String fromAddress, String subjectKeyword) throws Exception {
        String emailBody = getLatestEmailBody(fromAddress, subjectKeyword);

        System.out.println("📧 Email content:\n" + emailBody);

        // Extract password
        Pattern passPattern = Pattern.compile("Your password is\\s+(\\S+)", Pattern.CASE_INSENSITIVE);
        Matcher passMatcher = passPattern.matcher(emailBody);

        Map<String, String> credentials = new HashMap<>();
        String hardcodedEmail = RegisterPageTravelers.Emailactual;
        credentials.put("username", hardcodedEmail);

        if (passMatcher.find()) {
            String password = passMatcher.group(1);
            credentials.put("password", password);
            extractedPassword = password;
            System.out.println("✅ Password extracted: " + password);
        } else {
            System.out.println("⚠️ Password not found in email content.");
        }

        return credentials;
    }

    // ==========================
    // OTP METHOD
    // ==========================
    public static String getOtpFromEmail(String fromAddress, String subjectKeyword) throws Exception {
        String emailBody = getLatestEmailBody(fromAddress, subjectKeyword);

        // Remove HTML tags if present
        emailBody = emailBody.replaceAll("<[^>]*>", " ").trim();

        // Extract OTP in format "OTP: 12345"
        Pattern otpPattern = Pattern.compile("OTP:\\s*(\\d{4,8})");
        Matcher matcher = otpPattern.matcher(emailBody);

        if (matcher.find()) {
            extractedOtp = matcher.group(1);
            System.out.println("✅ OTP extracted: " + extractedOtp);
            return extractedOtp;
        } else {
            throw new Exception("❌ OTP not found in email content.");
        }
    }
    public static String getPasswordFromEmail(String fromAddress, String subjectKeyword) throws Exception {
        String emailBody = getLatestEmailBody(fromAddress, subjectKeyword);

        System.out.println("📧 Email content (password fetch):\n" + emailBody);

        // Flexible regex to match variations like "Password is : Tester@1"
        Pattern passPattern = Pattern.compile("password\\s*is\\s*:?\\s*(\\S+)", Pattern.CASE_INSENSITIVE);
        Matcher passMatcher = passPattern.matcher(emailBody);

        if (passMatcher.find()) {
            extractedPassword = passMatcher.group(1);
            System.out.println("✅ Password extracted again: " + extractedPassword);
            return extractedPassword;
        } else {
            throw new Exception("❌ Password not found in email content.");
        }
    }

    // ==========================
    // COMMON EMAIL FETCH METHOD
    // ==========================
    public static String getLatestEmailBody(String fromAddress, String subjectKeyword) throws Exception {
        Gmail service = getGmailService();

        // Search emails
        ListMessagesResponse messagesResponse = service.users().messages().list("me")
                .setQ("from:" + fromAddress + " subject:" + subjectKeyword)
                .setMaxResults(10L)
                .execute();

        List<Message> messages = messagesResponse.getMessages();
        if (messages == null || messages.isEmpty()) {
            throw new Exception("❌ No matching emails found.");
        }

        // Find the latest email
        Message latestMessage = null;
        long latestTimestamp = 0;
        for (Message msg : messages) {
            Message fullMsg = service.users().messages().get("me", msg.getId()).execute();
            if (fullMsg.getInternalDate() > latestTimestamp) {
                latestTimestamp = fullMsg.getInternalDate();
                latestMessage = fullMsg;
            }
        }

        if (latestMessage == null) {
            throw new Exception("❌ Could not identify latest email.");
        }

        // Extract email body
        String emailBody = "";
        if (latestMessage.getPayload().getParts() != null) {
            for (MessagePart part : latestMessage.getPayload().getParts()) {
                if ("text/plain".equals(part.getMimeType())) {
                    emailBody = new String(Base64.getUrlDecoder().decode(part.getBody().getData()), StandardCharsets.UTF_8);
                    break;
                } else if ("text/html".equals(part.getMimeType())) {
                    String htmlBody = new String(Base64.getUrlDecoder().decode(part.getBody().getData()), StandardCharsets.UTF_8);
                    emailBody = Jsoup.parse(htmlBody).text();
                    break;
                }
            }
        } else {
            emailBody = new String(Base64.getUrlDecoder().decode(latestMessage.getPayload().getBody().getData()), StandardCharsets.UTF_8);
        }

        return emailBody;
    }
    public static Map<String, String> getCredentialsEmpFromEmail(String fromAddress, String subjectKeyword) throws Exception {
        // Now uses keyword filter
        String emailBody = getEmailBodyWithKeyword(fromAddress, subjectKeyword, "Employee Login");

        System.out.println("📧 Raw Email content:\n" + emailBody);

        // ✅ Clean HTML first
        String plainText = emailBody
                .replaceAll("(?i)<br\\s*/?>", "\n") // replace <br/> with newlines
                .replaceAll("<[^>]*>", "")          // strip HTML tags
                .replaceAll("&nbsp;", " ")
                .trim();

        System.out.println("📃 Cleaned Email:\n" + plainText);

        Map<String, String> credentials = new HashMap<>();

        // ✅ Check if "Employee Login" exists
        if (!plainText.contains("Employee Login")) {
            System.out.println("⚠️ Email does not contain 'Employee Login'. Skipping extraction.");
            return credentials; // return empty map if not found
        }

        // ✅ Patterns for username and password
        Pattern userPattern = Pattern.compile("UserName:\\s*([^\\s]+)", Pattern.CASE_INSENSITIVE);
        Pattern passPattern = Pattern.compile("Temporary Password:\\s*(\\S+)", Pattern.CASE_INSENSITIVE);

        Matcher userMatcher = userPattern.matcher(plainText);
        Matcher passMatcher = passPattern.matcher(plainText);

        if (userMatcher.find()) {
            String username = userMatcher.group(1);
            credentials.put("username", username);
            System.out.println("✅ Username extracted: " + username);
        }

        if (passMatcher.find()) {
            String password = passMatcher.group(1);
            credentials.put("password", password);
            extractedPassword = password;
            System.out.println("✅ Password extracted: " + password);
        }

        return credentials;
    }

    public static Map<String, String> getCredentialsBusinessFromEmail(String fromAddress, String subjectKeyword) throws Exception {
        // Now uses keyword filter
        String emailBody = getEmailBodyWithKeyword(fromAddress, subjectKeyword, "Business Login");

        System.out.println("📧 Raw Email content:\n" + emailBody);

        // ✅ Clean HTML first
        String plainText = emailBody
                .replaceAll("(?i)<br\\s*/?>", "\n") // replace <br/> with newlines
                .replaceAll("<[^>]*>", "")          // strip HTML tags
                .replaceAll("&nbsp;", " ")
                .trim();

        System.out.println("📃 Cleaned Email:\n" + plainText);

        Map<String, String> credentials = new HashMap<>();

        // ✅ Check if "Business Login" exists
        if (!plainText.contains("Business Login")) {
            System.out.println("⚠️ Email does not contain 'Business Login'. Skipping extraction.");
            return credentials; // return empty map if not found
        }

        // ✅ Patterns for username and password
        Pattern userPattern = Pattern.compile("UserName:\\s*([^\\s]+)", Pattern.CASE_INSENSITIVE);
        Pattern passPattern = Pattern.compile("Temporary Password:\\s*(\\S+)", Pattern.CASE_INSENSITIVE);

        Matcher userMatcher = userPattern.matcher(plainText);
        Matcher passMatcher = passPattern.matcher(plainText);

        if (userMatcher.find()) {
            String username = userMatcher.group(1);
            credentials.put("username", username);
            System.out.println("✅ Username extracted: " + username);
        }

        if (passMatcher.find()) {
            String password = passMatcher.group(1);
            credentials.put("password", password);
            extractedPassword = password;
            System.out.println("✅ Password extracted: " + password);
        }

        return credentials;
    }


    public static String getEmailBodyWithKeyword(String fromAddress, String subjectKeyword, String bodyKeyword) throws Exception {
        Gmail service = getGmailService();

        // Fetch up to 10 latest emails with the subject
        ListMessagesResponse messagesResponse = service.users().messages().list("me")
                .setQ("from:" + fromAddress + " subject:" + subjectKeyword)
                .setMaxResults(10L)
                .execute();

        List<Message> messages = messagesResponse.getMessages();
        if (messages == null || messages.isEmpty()) {
            throw new Exception("❌ No matching emails found.");
        }

        // Loop through each email until we find one that has our keyword
        for (Message msg : messages) {
            Message fullMsg = service.users().messages().get("me", msg.getId()).execute();

            String emailBody = "";
            if (fullMsg.getPayload().getParts() != null) {
                for (MessagePart part : fullMsg.getPayload().getParts()) {
                    if ("text/plain".equals(part.getMimeType())) {
                        emailBody = new String(Base64.getUrlDecoder().decode(part.getBody().getData()), StandardCharsets.UTF_8);
                    } else if ("text/html".equals(part.getMimeType())) {
                        String htmlBody = new String(Base64.getUrlDecoder().decode(part.getBody().getData()), StandardCharsets.UTF_8);
                        emailBody = Jsoup.parse(htmlBody).text();
                    }
                }
            } else {
                emailBody = new String(Base64.getUrlDecoder().decode(fullMsg.getPayload().getBody().getData()), StandardCharsets.UTF_8);
            }

            if (emailBody.contains(bodyKeyword)) {
                return emailBody; // ✅ Found the correct email
            }
        }

        throw new Exception("❌ No email found containing keyword: " + bodyKeyword);
    }

    private static Gmail getGmailService() throws Exception {
        return new Gmail.Builder(
                GmailAuthHelper.getCredentials().getTransport(),
                GmailAuthHelper.JSON_FACTORY,
                GmailAuthHelper.getCredentials()
        ).setApplicationName("Gmail API Fetch").build();
    }

    public static String extractPasswordFromTravelEmail(String emailBody) {

        if (emailBody == null || emailBody.trim().isEmpty()) {
            return null;
        }

        // Convert HTML → plain text
        String text = Jsoup.parse(emailBody).text();

        // Regex patterns that match different possible email formats
        String[] regexList = {
                "temporary password is\\s*(\\S+)",
                "Your temporary password is\\s*(\\S+)",
                "Your password is\\s*(\\S+)",
                "Password[:\\s]+(\\S+)"
        };

        // Loop through patterns and return first match
        for (String regex : regexList) {
            Matcher matcher = Pattern.compile(regex, Pattern.CASE_INSENSITIVE).matcher(text);
            if (matcher.find()) {
                return matcher.group(1).trim();  // return password
            }
        }

        return null;  // <-- Your missing part
    }


}
