package liuwei.interpretor;

/**
 * @Title: SentenceNode
 * @Description: TODO(用一句话描述该文件做什么)
 * @author: caoyue
 * @date: 2020/2/24 21:47
 * @最后修改人: caoyue
 * @最后修改时间: 2020/2/24 21:47
 * @company: shopin.net
 * @version: V1.0
 */

public class SentenceNode extends  AbstractNode {
    private AbstractNode direction;
    private AbstractNode action;
    private AbstractNode distance;
    
    public SentenceNode(AbstractNode direction, AbstractNode action, AbstractNode distance) {
        this.direction = direction;
        this.action = action;
        this.distance = distance;
    }
    
    
    @Override
    public String interpret() {
        return direction.interpret() + action.interpret() + distance.interpret();
    }
}
