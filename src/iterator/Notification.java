package iterator;

public class Notification {

    private int notificationId;
    private String notificationText;

    public Notification(int notificationId, String notificationText) {
        this.notificationId = notificationId;
        this.notificationText = notificationText;
    }

    public int getNotificationId() {
        return notificationId;
    }

    public String getNotificationText() {
        return notificationText;
    }
}
