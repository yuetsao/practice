package XD.JDKNEW;

import java.util.List;

public interface Animal {

    void run();

    void eat();

    default void breath() {
        System.out.println("任何动物都有呼吸。。。。");
    }

    static void test() {
        System.out.println("这个是静态方法");
    }

//    private void defaultPay() {
//    }


}
