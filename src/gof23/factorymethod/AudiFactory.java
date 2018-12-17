package gof23.factorymethod;

public class AudiFactory implements CarFactory {
    @Override
    public Car creatCar() {
        System.out.println("Audi running...");
        return new Audi();
    }
}
