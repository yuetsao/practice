package JVMTest.classLoader;

/**
 * @author caoyue
 * @description 大概描述所属模块和介绍
 * @date 2019-06-22 17:38
 **/
public class MyTest6 {
    public static void main(String[] args) {
        System.out.println("counter1:" + Singleton.counter1);
        System.out.println("counter2:" + Singleton.counter2);
    }

}

class Singleton {
    public static int counter1=1;
    private static Singleton singleton = new Singleton();
    private Singleton () {
        counter1 ++;
        counter2 ++;
    }
    public static int counter2 = 0;
    public static Singleton getInstance() {
        return singleton;
    }
}