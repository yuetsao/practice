package gof23.adapter;

/**
 * 这个相当于我们的笔记本
 *
 */
public class Client {
    public void test1(Target t) {
        t.handlerReq();
    }

    public static void main(String[] args) {
        Adaptee adaptee = new Adaptee();
        Target target = new Adapter();
        Client client = new Client();
        client.test1(target);
    }
}
