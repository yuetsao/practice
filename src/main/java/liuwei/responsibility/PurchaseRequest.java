package liuwei.responsibility;

/**
 * @Title: PurchaseRequest
 * @Description: TODO(用一句话描述该文件做什么)
 * @author: caoyue
 * @date: 2020/2/23 17:56
 * @最后修改人: caoyue
 * @最后修改时间: 2020/2/23 17:56
 * @company: shopin.net
 * @version: V1.0
 */

public class PurchaseRequest {
    private double amount;
    private int number;
    private String purpose;
    
    public PurchaseRequest(double amount, int number, String purpose) {
        this.amount = amount;
        this.number = number;
        this.purpose = purpose;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }
}
