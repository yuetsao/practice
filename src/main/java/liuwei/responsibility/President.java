package liuwei.responsibility;

/**
 * @Title: President
 * @Description: TODO(用一句话描述该文件做什么)
 * @author: caoyue
 * @date: 2020/2/23 18:21
 * @最后修改人: caoyue
 * @最后修改时间: 2020/2/23 18:21
 * @company: shopin.net
 * @version: V1.0
 */

public class President extends Approver {
    public President(String name) {
        super(name);
    }
    @Override
    public void processRequest(PurchaseRequest request) {
        if(request.getAmount() < 500000) {
            System.out.println("董事长" + this.name + "审批采购单" + request.getNumber() + "金额" + request.getAmount() + "元，采购目的" + request.getPurpose());
        }else {
            this.successor.processRequest(request);
        }
    }
}
