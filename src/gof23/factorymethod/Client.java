package gof23.factorymethod;

public class Client {
    public static void main(String[] args) {
        Car audi = new AudiFactory().creatCar();
        Car byd = new BydFactory().creatCar();
        Car benz = new BenzFactory().creatCar();
        audi.run();
        byd.run();
        benz.run();
    }
}
