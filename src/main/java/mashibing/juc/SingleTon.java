package mashibing.juc;

/**
 * Copyright (C),上品折扣
 * FileName: SingleTon
 *
 * @author caoyue
 * @date 2020 2020/11/18 22:37
 * description 其实单例模式就是Bean的思想，封装（成员变量不公开，构造方法不公开）只保留一个获取成员属性的接口，这样就保证单例了
 */
public class SingleTon {
    private static final SingleTon instance = new SingleTon();

    private SingleTon() {
    }
    
    public static SingleTon getInstance() {
        return instance;
    }

    public static void main(String[] args) {
        SingleTon singleTon = SingleTon.getInstance();
        SingleTon singleTon1 = SingleTon.getInstance();
        System.out.println(singleTon==singleTon1);
    }
}
