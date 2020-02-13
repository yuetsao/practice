package liuwei.simpleFactory;

/**
 * @Title: Product
 * @Description: java设计模式第30页
 * 简单工厂模式经典代码
 * @author: caoyue
 * @date: 2020/2/13 17:17
 * @最后修改人: caoyue
 * @最后修改时间: 2020/2/13 17:17
 * @company: shopin.net
 * @version: V1.0
 */

public abstract class Product {
    //所有产品类的公共业务方法
    public void methodSame() {
        //公共方法的实现
        System.out.println("公共业务方法");
    }
    
    //声明抽象业务方法
    public abstract void methodDiff();
}
