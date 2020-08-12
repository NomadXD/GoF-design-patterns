package chainOfResponsibilty;

public class InfoLogger extends AbstractLogger {


    public InfoLogger(int level) {

        this.level=level;

    }

    @Override
    protected void writeMessage(String message) {

        System.out.println("Info logger: "+message);

    }
}
