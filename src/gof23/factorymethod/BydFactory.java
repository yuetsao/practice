package gof23.factorymethod;

public class BydFactory implements CarFactory {

    @Override
    public Car creatCar() {
        System.out.println("Byd running...");
        return new Byd();
    }
}
