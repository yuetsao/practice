package liuwei.decorator;

/**
 * @Title: ComponentDecorator
 * @Description: TODO(用一句话描述该文件做什么)
 * @author: caoyue
 * @date: 2020/2/20 14:42
 * @最后修改人: caoyue
 * @最后修改时间: 2020/2/20 14:42
 * @company: shopin.net
 * @version: V1.0
 */

public class ComponentDecorator extends Component {
    
    private Component component;
    
    public ComponentDecorator(Component component) {
        this.component = component;
    }
    
    @Override
    public void display() {
        component.display();
    }
}
