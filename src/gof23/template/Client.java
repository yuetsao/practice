package gof23.template;

public class Client {
    public static void main(String[] args) {
        BankTemplateMethod templateMethod = new DrawMoney();
        templateMethod.process();
    }
}

class DrawMoney extends BankTemplateMethod {

    //这里重新定义业务方法
    @Override
    public void transact() {
        System.out.println("我要取款----");
    }
}
