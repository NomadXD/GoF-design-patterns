package iterator;

public class NotificationIterator implements Iterator {

    private Notification[] notificationCollection;
    private int current=0;

    public NotificationIterator(Notification[] notificationCollection) {
        this.notificationCollection = notificationCollection;
    }

    @Override
    public boolean hasNext() {

        if(current>=NotificationCollection.getMAXSIZE() || notificationCollection[current]==null){
            return false;
        }else{
            return true;
        }

    }

    @Override
    public Object nextObject() {
        Notification notification = notificationCollection[current];
        current+=1;
        return notification;
    }
}
