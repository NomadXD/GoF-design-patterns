package chainOfResponsibilty;

public class Main {

    private static AbstractLogger chainOfLoggers(){

        AbstractLogger infoLogger = new InfoLogger(AbstractLogger.INFO);
        AbstractLogger debugLogger = new DebugLogger(AbstractLogger.DEBUG);
        AbstractLogger errorLogger =  new ErrorLogger(AbstractLogger.ERROR);

        infoLogger.setNextLogger(debugLogger);
        debugLogger.setNextLogger(errorLogger);

        return infoLogger;

    }

    public static void main(String[] args) {

        AbstractLogger loggerChain = chainOfLoggers();

        loggerChain.logMessage(AbstractLogger.INFO,"This is from INFO");
        loggerChain.logMessage(AbstractLogger.DEBUG,"This is from debug");
        loggerChain.logMessage(AbstractLogger.ERROR,"This is from error");



    }






}
