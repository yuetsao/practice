package gof23.javaseobserver;

public class Client {
    public static void main(String[] args) {
        ConcreteSubject concreteSubject = new ConcreteSubject();
        ObserverA a = new ObserverA();
        ObserverA b = new ObserverA();
        ObserverA c = new ObserverA();

        concreteSubject.addObserver(a);
        concreteSubject.addObserver(b);
        concreteSubject.addObserver(c);

        concreteSubject.set(2);

        System.out.println(a.getMyState());
        System.out.println(b.getMyState());
        System.out.println(c.getMyState());
    }
}
