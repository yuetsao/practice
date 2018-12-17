package gof23.simplefactory;

public class Client2 {
    public static void main(String[] args) {
        //整体关系复杂了 但是对于调用者简单了
        Car audi = CarFactory.createCar("Audi");
        Car byd = CarFactory.createCar("Byd");
        audi.run();
        byd.run();
    }
}
