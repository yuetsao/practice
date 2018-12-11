package thread;

public class SynBlock01 {
    public static void main(String[] args) {
        //账户
        Account account =new Account(1000,"结婚礼金");
//        SynDrawing you = new SynDrawing(account,80,"可悲的你");
//        SynDrawing wife = new SynDrawing(account,90,"happy的她");
//        you.start();
//        wife.start();
    }
}

class SynDrawing extends Thread {
    Account account;
    int totalMoney;
    int drawingMoney;
    public SynDrawing(String name, int totalMoney, int drawingMoney ) {
        super(name);
        this.account = account;
        this.totalMoney = totalMoney;
        this.drawingMoney = drawingMoney;
    }

    @Override
    public void run () {

    }

    public  void test() {
        //提高性能
        if(account.money<=0) {
            return ;
        }
        //同步块
        synchronized(account) {
            if(account.money -drawingMoney<0) {
                return;
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            account.money -=drawingMoney;
            totalMoney +=drawingMoney;
            System.out.println(this.getName()+"-->账户余额为:"+account.money);
            System.out.println(this.getName()+"-->口袋的钱为:"+totalMoney);
        }
    }

}
