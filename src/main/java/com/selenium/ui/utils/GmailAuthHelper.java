package com.selenium.ui.utils;

import com.google.api.client.auth.oauth2.Credential;

import com.google.api.client.googleapis.auth.oauth2.GoogleCredential;
import com.google.api.client.googleapis.javanet.GoogleNetHttpTransport;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.jackson2.JacksonFactory;

public class GmailAuthHelper {

    // Replace these with your app credentials and refresh token from OAuth Playground
    public static final String CLIENT_ID = System.getenv("GMAIL_CLIENT_ID");
    public static final String CLIENT_SECRET = System.getenv("GMAIL_CLIENT_SECRET");
    public static final String REFRESH_TOKEN = System.getenv("GMAIL_REFRESH_TOKEN");
    public static final JsonFactory JSON_FACTORY = JacksonFactory.getDefaultInstance();

/**
 * Returns a Credential object using the refresh token.
 * This will automatically generate a valid access token for Gmail API calls.
 */
public static Credential getCredentials() throws Exception {
        // Build a Credential object using CLIENT_ID, CLIENT_SECRET, and REFRESH_TOKEN
        Credential credential = new GoogleCredential.Builder()
        .setClientSecrets(CLIENT_ID, CLIENT_SECRET)
        .setTransport(GoogleNetHttpTransport.newTrustedTransport())
        .setJsonFactory(JSON_FACTORY)
        .build()
        .setRefreshToken(REFRESH_TOKEN);

        // Force refresh to get a valid access token immediately
        credential.refreshToken();

        System.out.println("✅ Access Token: " + credential.getAccessToken());
        return credential;
        }
        }
