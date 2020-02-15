package liuwei.abstractFactory1;

/**
 * @Title: SpringButton
 * @Description: TODO(用一句话描述该文件做什么)
 * @author: caoyue
 * @date: 2020/2/15 19:50
 * @最后修改人: caoyue
 * @最后修改时间: 2020/2/15 19:50
 * @company: shopin.net
 * @version: V1.0
 */

public class SpringButton implements Button {

    @Override
    public void display() {
        System.out.println("显示浅绿色的按钮");
    }
}
