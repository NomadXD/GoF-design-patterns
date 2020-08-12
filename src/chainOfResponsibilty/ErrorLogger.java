package chainOfResponsibilty;

public class ErrorLogger extends AbstractLogger {


    public ErrorLogger(int level) {
        this.level=level;
    }

    @Override
    protected void writeMessage(String message) {
        System.out.println("ERROR LOGGER :"+message );
    }
}
