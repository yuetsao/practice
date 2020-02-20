package liuwei.decorator;

/**
 * @Title: BlackBorderDecorator
 * @Description: TODO(用一句话描述该文件做什么)
 * @author: caoyue
 * @date: 2020/2/20 14:47
 * @最后修改人: caoyue
 * @最后修改时间: 2020/2/20 14:47
 * @company: shopin.net
 * @version: V1.0
 */

public class BlackBorderDecorator extends ComponentDecorator {
    
    public BlackBorderDecorator(Component component) {
        super(component);
    }
    
    @Override
    public void display() {
        this.setBlackBorder();
        super.display();
    }
    
    public void setBlackBorder() {
        System.out.println("为构件增加黑色边框");
    }
}
