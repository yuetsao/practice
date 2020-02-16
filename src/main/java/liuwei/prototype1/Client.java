package liuwei.prototype1;

/**
 * @Title: Client
 * @Description: TODO(用一句话描述该文件做什么)
 * @author: caoyue
 * @date: 2020/2/16 14:07
 * @最后修改人: caoyue
 * @最后修改时间: 2020/2/16 14:07
 * @company: shopin.net
 * @version: V1.0
 */

public class Client {
    public static void main(String[] args) throws Exception{
        WeeklyLog log_previous, log_new;
        log_previous = new WeeklyLog();
        Attachment attachment = new Attachment();
        log_previous.setAttachment(attachment);
        log_new = log_previous.deepClone();
        System.out.println("周报是否相同" + (log_new == log_previous));
        System.out.println("附件是否相同" + (log_new.getAttachment() == log_previous.getAttachment()));
    }
}
