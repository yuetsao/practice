package liuwei.factoryMethod1;

/**
 * @Title: DatabaseLoggerFactory
 * @Description: TODO(用一句话描述该文件做什么)
 * @author: caoyue
 * @date: 2020/2/15 13:19
 * @最后修改人: caoyue
 * @最后修改时间: 2020/2/15 13:19
 * @company: shopin.net
 * @version: V1.0
 */

public class DatabaseLoggerFactory implements LoggerFactory {

    @Override
    public Logger createLogger() {
        Logger logger = new DataBaseLogger();
        return logger;
    }
}
