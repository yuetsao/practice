package liuwei.decorator;

/**
 * @Title: ScorllBarDecorator
 * @Description: TODO(用一句话描述该文件做什么)
 * @author: caoyue
 * @date: 2020/2/20 14:44
 * @最后修改人: caoyue
 * @最后修改时间: 2020/2/20 14:44
 * @company: shopin.net
 * @version: V1.0
 */

public class ScrollBarDecorator extends ComponentDecorator{
    
    public ScrollBarDecorator(Component component) {
        super(component);
    }
    
    @Override
    public void display() {
        this.setScrollBar();
        super.display();
    }
    
    public void setScrollBar() {
        System.out.println("为构件增加滚动条");
    }
    
}
