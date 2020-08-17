package iterator;

import java.util.ArrayList;

public class NotificationCollection implements Collection {


    private Notification[] notificationCollection;
    private static int MAXSIZE = 10;
    private int current=0;

    public NotificationCollection() {
        this.notificationCollection = new Notification[MAXSIZE];

        addNotification(new Notification(1,"Test Notification one"));
        addNotification(new Notification(2,"Test Notification two"));
        addNotification(new Notification(3,"Test Notification three"));


    }

    public void addNotification(Notification notification){

        if(current>=MAXSIZE){
            System.out.println("Notification bar is full");
        }else{
            notificationCollection[current]=notification;
            current+=1;
        }

    }


    @Override
    public Iterator createIterator() {
        return new NotificationIterator(notificationCollection);
    }

    public static int getMAXSIZE() {
        return MAXSIZE;
    }

    public Notification[] getNotificationCollection() {
        return notificationCollection;
    }
}
