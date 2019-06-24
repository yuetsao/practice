package JVMTest.classLoader;

import java.util.Random;

/**
 * @author caoyue
 * @description 当一个接口在初始化时，并不要求其父接口都完成了初始化
 * 在接口中变量即使不加上final也是final的
 * @date 2019-06-22 17:21
 **/
public class MyTest5 {
    public static void main(String[] args) {
        System.out.println(MyChild5.b);
    }
}

interface MyParent5 {
    public static int a = 5;
}

interface MyChild5 extends MyParent5 {
    public static int b = 6;
    public static final int B = new Random().nextInt(4);
}
