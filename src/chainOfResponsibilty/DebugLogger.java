package chainOfResponsibilty;

public class DebugLogger extends AbstractLogger {

    public DebugLogger(int level) {

        this.level=level;

    }

    @Override
    protected void writeMessage(String message) {
        System.out.println("DEBUG LOGGER: "+message);
    }
}
