package com.yuetsao.testJVM.loadclass;

/**
 * @ClassName LoadClassByHand
 * @Description 主要是为了测试自己加载一个类
 * @Author caoyue
 * @Date 2021/5/24 9:14 下午
 * @Version V1.0
 **/
public class LoadClassByHand {
    public static void main(String[] args) throws ClassNotFoundException {
        //应用场景？
        //答：spring 中 ， tomcat 中， JRrebel 插件
        Class clazz = LoadClassByHand.class.getClassLoader().loadClass("com.yuetsao.testJVM.loadclass.LoadClassByHand");
        System.out.println(clazz.getClassLoader());
        System.out.println(clazz.getName());
    }
}

