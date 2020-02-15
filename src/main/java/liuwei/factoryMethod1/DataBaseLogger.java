package liuwei.factoryMethod1;

/**
 * @Title: DataBaseLogger
 * @Description: TODO(用一句话描述该文件做什么)
 * @author: caoyue
 * @date: 2020/2/15 13:17
 * @最后修改人: caoyue
 * @最后修改时间: 2020/2/15 13:17
 * @company: shopin.net
 * @version: V1.0
 */

public class DataBaseLogger implements Logger {
    @Override
    public void writeLog() {
        System.out.println("数据库日志记录");
    }
}
