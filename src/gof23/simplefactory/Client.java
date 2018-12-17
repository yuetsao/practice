package gof23.simplefactory;

public class Client {
    public static void main(String[] args) {
        //这种方式接口和实现类都需要知道
        //类似于小工作坊什么都要会
        Car car1 = new Audi();
        Car car2 = new Byd();
        car1.run();
        car2.run();
    }
}
