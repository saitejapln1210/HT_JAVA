package core_java_5;

public class EmailNotificationService implements NotificationChannel {
    @Override
    public String send(String message) {
        return "Email sent: " + message;
    }
}
