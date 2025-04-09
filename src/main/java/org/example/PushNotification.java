package org.example;

public class PushNotification extends Notification {
    private final String token;

    public PushNotification(String device, String subject, String token){
        super(device, subject);
        this.token = token;
    }

    @Override
    public void send() {
        System.out.println("Sending to: " + this.getReceiver());
        System.out.println("Push notification content: " + this.getMessage());
        System.out.println("Connecting to push notification service...");
        System.out.println("Sending push notification...");
    }
}
