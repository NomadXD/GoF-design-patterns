package iterator;

public class Main {

    public static void main(String[] args) {

        NotificationCollection notificationCollection = new NotificationCollection();
        NotificationBar notificationBar = new NotificationBar(notificationCollection.getNotificationCollection());
        notificationBar.printNotifications();

    }

}
