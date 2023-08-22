package Structural.Adapter;

import Structural.Adapter.Gmail.GmailClient;

public class GmailAdapter implements EmailProvider {
    private GmailClient client = new GmailClient();

    @Override
    public void downloadEmails() {
        client.connect();
        client.getEmails();
        client.disconnect();
    }
}