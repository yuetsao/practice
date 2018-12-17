package gof23.factorymethod;

public class Client {
    //虽然满足了设计模式但是类变多了
    public static void main(String[] args) {
        Car audi = new AudiFactory().creatCar();
        Car byd = new BydFactory().creatCar();
        Car benz = new BenzFactory().creatCar();
        audi.run();
        byd.run();
        benz.run();
    }
}
