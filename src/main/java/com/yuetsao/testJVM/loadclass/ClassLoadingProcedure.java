package com.yuetsao.testJVM.loadclass;

/**
 * @ClassName ClassLoadingProcedure
 * @Description 这个实例是用来验证在 Linking 阶段 Preparation 的过程 然后进入 initializing 阶段
 * @Author caoyue
 * @Date 2021/5/25 1:00 上午
 * @Version V1.0
 **/
public class ClassLoadingProcedure {

    public static void main(String[] args) {
        System.out.println(T.count);
    }
}

class T {
    //第一种情况：
    //1.首先我们 new T(),这时先把我们的 class load 到内存
    //2.进入 Linking 阶段，首先验证 class 文件是否符合JVM的规范
    //3.进入 Preparation 阶段，这时给静态变量赋初始值，也就是 t 为 null， count 为0， 然后 new T（）count++ ， count 为 1
    //4.然后再给 count 赋值，值为2
    //5.然后打印 count 的值，输出为2；
//    public static T t = new T();
//    public static int count =2;

    //第二种情况：
    //1.省略上述的加载阶段；
    //2.首先我们在linking阶段的preparation中给 count 赋初始值 0；给 t 赋值为 null
    //3.然后赋值为2， 然后我们 在 newT的时候调用构造方法 将count 变为3
    //4.然后输出为3
    public static int count =2;
    public static T t = new T();

    private T() {
        count ++;
    }
}
