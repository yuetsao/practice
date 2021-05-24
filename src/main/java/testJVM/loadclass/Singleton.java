package testJVM.loadclass;

/**
 * @ClassName Singleton
 * @Description
 * @Author caoyue
 * @Date 2021/5/25 1:27 上午
 * @Version V1.0
 **/
public class Singleton {
    //这里变量为什么要加上volatile？
    //见下面的注释！！
    /**
     *  0 new #2 <testJVM/loadclass/Simple> //这时内存中已经有了
     *  * 3 dup
     *  * 4 invokespecial #3 <testJVM/loadclass/Simple.<init>>
     *  * 7 astore_1 //赋值给simple，这时候 4，7 有可能会发生指令重排序，这样就会使对象有可能处于半初始化状态
     *  * 8 return
     **/
    private static volatile Singleton INSTANCE = null;

    private Singleton () {}

    public static Singleton getInstance() {
        if(INSTANCE == null) {
            synchronized (Singleton.class) {
                if(INSTANCE == null) {
                    //因为如果在new Singleton的时候，这时候对象只是赋了默认值
                    //然后这时候另外一个线程进来了，发现这个INSTANCE已经初始化了，其实是半初始化的状态
                    //然后直接返回了，这时候获取的对象是不正确的，假设对象里面有成员变量，这时候就会出现错误
                    INSTANCE = new Singleton();
                }
            }
        }
        return INSTANCE;
    }
}
