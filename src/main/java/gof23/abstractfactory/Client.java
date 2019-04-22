package gof23.abstractfactory;

public class Client {
    public static void main(String[] args) {
        LuxuryCarFactory luxuryCarFactory = new LuxuryCarFactory();
        Engine e = luxuryCarFactory.creatEngine();
        e.run();
        e.start();
    }
}
