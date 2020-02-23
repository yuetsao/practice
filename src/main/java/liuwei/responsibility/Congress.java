package liuwei.responsibility;

/**
 * @Title: Congress
 * @Description: TODO(用一句话描述该文件做什么)
 * @author: caoyue
 * @date: 2020/2/23 18:25
 * @最后修改人: caoyue
 * @最后修改时间: 2020/2/23 18:25
 * @company: shopin.net
 * @version: V1.0
 */

public class Congress extends Approver {
    public Congress(String name) {
        super(name);
    }
    @Override
    public void processRequest(PurchaseRequest request) {
        System.out.println("召开董事会审批采购单" + request.getNumber() + "金额" + request.getAmount() + "元， 采购目的" + request.getPurpose());
    }
}
