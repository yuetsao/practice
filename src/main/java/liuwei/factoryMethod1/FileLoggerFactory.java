package liuwei.factoryMethod1;

/**
 * @Title: FileLoggerFactory
 * @Description: TODO(用一句话描述该文件做什么)
 * @author: caoyue
 * @date: 2020/2/15 13:25
 * @最后修改人: caoyue
 * @最后修改时间: 2020/2/15 13:25
 * @company: shopin.net
 * @version: V1.0
 */

public class FileLoggerFactory implements LoggerFactory {
    @Override
    public Logger createLogger() {
        Logger logger = new FileLogger();
        return logger;
    }
}
