package org.example.Notification;

public class MobileNotification implements NotificationType {
    @Override
    public void sendNotification(String notifAddorPhone, String productName) {

        System.out.println("Product "+ productName + " is available in stocks");
        System.out.println("SMS sent to "+ notifAddorPhone);
    }
}
