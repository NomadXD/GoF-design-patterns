package iterator;

public class NotificationBar {

    private Notification[] notificationCollection;

    public NotificationBar(Notification[] notificationCollection) {
        this.notificationCollection = notificationCollection;
    }

    public void printNotifications(){

        Iterator iterator = new NotificationIterator(notificationCollection);
        System.out.println("=============================================Notification Bar=========================================");

        while(iterator.hasNext()){
            Notification notification = (Notification)iterator.nextObject();
            System.out.println(notification.getNotificationId()+" : "+notification.getNotificationText());
        }


    }
}
