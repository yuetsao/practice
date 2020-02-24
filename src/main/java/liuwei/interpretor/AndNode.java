package liuwei.interpretor;

/**
 * @Title: AndNod
 * @Description: TODO(用一句话描述该文件做什么)
 * @author: caoyue
 * @date: 2020/2/24 21:44
 * @最后修改人: caoyue
 * @最后修改时间: 2020/2/24 21:44
 * @company: shopin.net
 * @version: V1.0
 */

public class AndNode extends AbstractNode {
    private AbstractNode left;
    private AbstractNode right;
    
    public AndNode(AbstractNode left, AbstractNode right) {
        this.left = left;
        this.right = right;
    }
    
    
    @Override
    public String interpret() {
        return left.interpret() + "再" + right.interpret();
    }
}
