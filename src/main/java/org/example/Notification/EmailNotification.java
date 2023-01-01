package org.example.Notification;

public class EmailNotification implements NotificationType {
    @Override
    public void sendNotification(String notifAddorPhone, String productName) {

        String fromAddress = "kernaldev1@gmail.com";
        String host = "localhost";

        System.out.println("Product "+ productName + " is available in stocks");
        System.out.println("Email Notification sent to " + notifAddorPhone);
    }
}
