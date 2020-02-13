package liuwei.simpleFactory;

/**
 * @Title: Factory
 * @Description: TODO(用一句话描述该文件做什么)
 * @author: caoyue
 * @date: 2020/2/13 17:34
 * @最后修改人: caoyue
 * @最后修改时间: 2020/2/13 17:34
 * @company: shopin.net
 * @version: V1.0
 */

public class Factory {
    //静态工厂方法
    public static Product getProduct(String arg) {
        Product product = null;
        if(arg.equalsIgnoreCase("A")) {
            product = new ConcreteProductA();
        }else if(arg.equalsIgnoreCase("B")) {
            product = new ConcreteProductB();
        }
        return product;
    }
}
