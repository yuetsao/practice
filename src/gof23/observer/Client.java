package gof23.observer;

public class Client {
    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();
        ObserverA a = new ObserverA();
        ObserverA b = new ObserverA();
        ObserverA c = new ObserverA();

        //将这三个观察者添加到subject对象中
        subject.register(a);
        subject.register(b);
        subject.register(c);

        subject.setState(1);

        System.out.println(a.getMyState());
        System.out.println(b.getMyState());
        System.out.println(c.getMyState());
    }
}
