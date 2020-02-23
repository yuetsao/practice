package liuwei.responsibility;

/**
 * @Title: Approver
 * @Description: TODO(用一句话描述该文件做什么)
 * @author: caoyue
 * @date: 2020/2/23 18:00
 * @最后修改人: caoyue
 * @最后修改时间: 2020/2/23 18:00
 * @company: shopin.net
 * @version: V1.0
 */

public abstract class Approver {
    protected Approver successor;
    protected String name;
    
    public Approver(String name) {
        this.name = name;
    }
    
    public void setSuccessor(Approver successor) {
        this.successor = successor;
    }
    
    public abstract void processRequest(PurchaseRequest request);
}
