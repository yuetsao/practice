package liuwei.simpleFactory;

/**
 * @Title: ConcreteProductB
 * @Description: TODO(用一句话描述该文件做什么)
 * @author: caoyue
 * @date: 2020/2/13 17:36
 * @最后修改人: caoyue
 * @最后修改时间: 2020/2/13 17:36
 * @company: shopin.net
 * @version: V1.0
 */

public class ConcreteProductB extends Product {
    @Override
    public void methodDiff() {
        System.out.println("我是B产品");
    }
}
