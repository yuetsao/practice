package gof23.decorator;

public class Client {
    public static void main(String[] args) {
        Car car = new Car();
        car.move();
        System.out.println("新增飞行的功能");
        FlyCar flyCar = new FlyCar(car);
        flyCar.move();

        System.out.println("新增游动的功能");
        SwimCar swimCar = new SwimCar(car);
        swimCar.move();

        System.out.println("增加两个功能，飞，游");
        SwimCar swimCar1 = new SwimCar(new FlyCar(car));
        swimCar.move();
    }


}
