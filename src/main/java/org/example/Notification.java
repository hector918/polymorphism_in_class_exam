package org.example;

public abstract class Notification {
    private final String receiver, message;

    public Notification(String receiver, String message){
        this.receiver = receiver;
        this.message = message;

    }

    public abstract void send();

    public String getReceiver(){
        return this.receiver;
    }

    public String getMessage(){
        return this.message;
    }

    public void displayInfo() {
        System.out.println("Sending to:" + this.getReceiver());
        System.out.println("Message:" + this.getMessage());
        System.out.println("Sending");
    }
}