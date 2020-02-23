package liuwei.responsibility;

/**
 * @Title: Client
 * @Description: TODO(用一句话描述该文件做什么)
 * @author: caoyue
 * @date: 2020/2/23 18:28
 * @最后修改人: caoyue
 * @最后修改时间: 2020/2/23 18:28
 * @company: shopin.net
 * @version: V1.0
 */

public class Client {
    public static void main(String[] args) {
        Approver wjzhang, gyang, jguo, meeting;
        wjzhang = new Director("张无忌");
        gyang = new VicePresident("杨过");
        jguo = new President("郭靖");
        meeting = new Congress("董事会");
        
        wjzhang.setSuccessor(gyang);
        gyang.setSuccessor(jguo);
        jguo.setSuccessor(meeting);
        
        PurchaseRequest pr1 = new PurchaseRequest(45000,10001, "购买倚天剑");
        wjzhang.processRequest(pr1);
    }
}
