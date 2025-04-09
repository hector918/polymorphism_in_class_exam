package org.example;

public class SMSNotification extends Notification {

    public SMSNotification(String mobileNo, String messageBody){
        super(mobileNo, messageBody);
    }

    @Override
    public void send() {
        System.out.println("Sending to: " + this.getReceiver());
        System.out.println("SMS content: " + this.getMessage());
        System.out.println("Connecting to SMS gateway...");
        System.out.println("Sending SMS...");
    }
}