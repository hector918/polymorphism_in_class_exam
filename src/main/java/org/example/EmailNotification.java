package org.example;

public class EmailNotification extends Notification {


    public EmailNotification(String address, String subject){
        super(address, subject);
    }
    @Override
    public void send() {
        System.out.println("Sending to: " + this.getReceiver());
        System.out.println("Email content: " + this.getMessage());
        System.out.println("Connecting to SMTP server...");
        System.out.println("Sending email...");

    }
}
