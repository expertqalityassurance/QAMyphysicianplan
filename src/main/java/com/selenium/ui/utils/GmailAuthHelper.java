package com.selenium.ui.utils;

import com.google.api.client.auth.oauth2.Credential;
import com.google.api.client.googleapis.auth.oauth2.GoogleCredential;
import com.google.api.client.googleapis.javanet.GoogleNetHttpTransport;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.jackson2.JacksonFactory;

import java.io.InputStream;
import java.util.Properties;

public class GmailAuthHelper {

    private static String CLIENT_ID;
    private static String CLIENT_SECRET;
    private static String REFRESH_TOKEN;

    public static final JsonFactory JSON_FACTORY = JacksonFactory.getDefaultInstance();

    static {
        try {
            CLIENT_ID = System.getenv("GMAIL_CLIENT_ID");
            CLIENT_SECRET = System.getenv("GMAIL_CLIENT_SECRET");
            REFRESH_TOKEN = System.getenv("GMAIL_REFRESH_TOKEN");

            // 2️⃣ If any value missing → load from config.properties (Local)
            if (CLIENT_ID == null || CLIENT_SECRET == null || REFRESH_TOKEN == null) {

                Properties props = new Properties();

                InputStream inputStream = GmailAuthHelper.class.getClassLoader()
                        .getResourceAsStream("envconfig.properties");

                if (inputStream == null) {
                    throw new RuntimeException(
                            "config.properties NOT found in classpath. Make sure it exists under src/main/resources/"
                    );
                }

                props.load(inputStream);

                CLIENT_ID = props.getProperty("gmail.client.id");
                CLIENT_SECRET = props.getProperty("gmail.client.secret");
                REFRESH_TOKEN = props.getProperty("gmail.refresh.token");

                System.out.println("Loaded Gmail credentials from config.properties");
            }

        } catch (Exception e) {
            throw new RuntimeException("❌ Unable to load Gmail OAuth credentials!", e);
        }
    }

    public static Credential getCredentials() throws Exception {
        if (CLIENT_ID == null || CLIENT_ID.isEmpty())
            throw new IllegalStateException("CLIENT_ID missing or empty");

        if (CLIENT_SECRET == null || CLIENT_SECRET.isEmpty())
            throw new IllegalStateException("CLIENT_SECRET missing or empty");

        if (REFRESH_TOKEN == null || REFRESH_TOKEN.isEmpty())
            throw new IllegalStateException("REFRESH_TOKEN missing or empty");

        Credential credential = new GoogleCredential.Builder()
                .setClientSecrets(CLIENT_ID, CLIENT_SECRET)
                .setTransport(GoogleNetHttpTransport.newTrustedTransport())
                .setJsonFactory(JSON_FACTORY)
                .build()
                .setRefreshToken(REFRESH_TOKEN);

        credential.refreshToken();
        System.out.println("Access Token Generated Successfully");

        return credential;
    }
}
