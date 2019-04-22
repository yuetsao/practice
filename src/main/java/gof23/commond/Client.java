package gof23.commond;

import java.util.ConcurrentModificationException;

public class Client {
    public static void main(String[] args) {
        Commond commond = new ConcreteCommond(new Receiver());
        Invoke invoke = new Invoke(commond);
        invoke.call();
    }
}
