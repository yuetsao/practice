package gof23.liuwei.abstractFactory;

public class DataBaseLoggerFactory implements LoggerFactory {
    @Override
    public Logger createLogger() {
        Logger logger = new DatabaseLogger();
        return logger;
    }
}
