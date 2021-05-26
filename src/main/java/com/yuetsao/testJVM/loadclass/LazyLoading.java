package com.yuetsao.testJVM.loadclass;

/**
 * @ClassName LazyLoading
 * @Description 懒加载的5种情况测试
 * @Author caoyue
 * @Date 2021/5/24 10:53 下午
 * @Version V1.0
 **/
public class LazyLoading {

    public static void main(String[] args) throws ClassNotFoundException {
//        P p;
//        X x = new X();
//        System.out.println(P.i);
//        System.out.println(P.j);
        Class.forName("com.yuetsao.testJVM.loadclass.LazyLoading$P");
    }

    public static class P {
        final static int i = 8;
        static int j = 9;
        static {
            System.out.println("P");
        }
    }

    public static class X extends P {
        static {
            System.out.println("X");
        }
    }
}
