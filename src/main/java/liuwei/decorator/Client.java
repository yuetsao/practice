package liuwei.decorator;

/**
 * @Title: Client
 * @Description: TODO(用一句话描述该文件做什么)
 * @author: caoyue
 * @date: 2020/2/20 14:49
 * @最后修改人: caoyue
 * @最后修改时间: 2020/2/20 14:49
 * @company: shopin.net
 * @version: V1.0
 */

public class Client {
    public static void main(String[] args) {
        Component component, componentSB, componentBB;
        component = new Window();
        componentSB = new ScrollBarDecorator(component);
        componentBB = new BlackBorderDecorator(componentSB);
        componentSB.display();
        System.out.println("--------------------");
        componentBB.display();
    }
}
