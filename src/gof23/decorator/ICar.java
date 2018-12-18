package gof23.decorator;

public interface ICar {
    void move();
}

//具体构建对象（真实对象）
class Car implements ICar {

    @Override
    public void move() {
        System.out.println("陆地上跑");
    }
}
//装饰器角色
class SuperCar implements ICar {
    protected ICar car;

    public SuperCar(ICar car) {
        super();
        this.car = car;
    }

    @Override
    public void move() {
        car.move();
    }
}

//具体装饰角色
class FlyCar extends SuperCar {
    public FlyCar(ICar car) {
        super(car);
    }
    public void fly() {
        System.out.println("天上飞");
    }
    @Override
    public void move() {
        super.move();
        fly();
    }
}

class SwimCar extends SuperCar {
    public SwimCar(ICar car) {
        super(car);
    }
    public void swim() {
        System.out.println("水上游");
    }
    @Override
    public void move() {
        super.move();
        swim();
    }
}

class AutoCar extends SuperCar {
    public AutoCar(ICar car) {
        super(car);
    }
    public void autoMove() {
        System.out.println("自动跑");
    }
    @Override
    public void move() {
        super.move();
        autoMove();
    }
}
