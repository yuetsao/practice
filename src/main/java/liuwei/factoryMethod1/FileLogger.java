package liuwei.factoryMethod1;

/**
 * @Title: FileLogger
 * @Description: TODO(用一句话描述该文件做什么)
 * @author: caoyue
 * @date: 2020/2/15 13:18
 * @最后修改人: caoyue
 * @最后修改时间: 2020/2/15 13:18
 * @company: shopin.net
 * @version: V1.0
 */

public class FileLogger implements Logger {
    @Override
    public void writeLog() {
        System.out.println("文件日志记录");
    }
}
