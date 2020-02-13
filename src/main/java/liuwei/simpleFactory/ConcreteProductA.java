package liuwei.simpleFactory;

/**
 * @Title: ConcreteProductA
 * @Description: TODO(用一句话描述该文件做什么)
 * @author: caoyue
 * @date: 2020/2/13 17:21
 * @最后修改人: caoyue
 * @最后修改时间: 2020/2/13 17:21
 * @company: shopin.net
 * @version: V1.0
 */

public class ConcreteProductA extends Product {
    //实现业务方法
    @Override
    public void methodDiff() {
        System.out.println("我是产品A");
    }
    
}
