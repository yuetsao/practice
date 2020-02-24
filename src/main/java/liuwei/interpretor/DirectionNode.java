package liuwei.interpretor;

/**
 * @Title: DirectionNode
 * @Description: TODO(用一句话描述该文件做什么)
 * @author: caoyue
 * @date: 2020/2/24 21:52
 * @最后修改人: caoyue
 * @最后修改时间: 2020/2/24 21:52
 * @company: shopin.net
 * @version: V1.0
 */

public class DirectionNode extends AbstractNode{
    private String direction;

    public DirectionNode(String direction) {
        this.direction = direction;
    }

    @Override
    public String interpret() {
        if(direction.equalsIgnoreCase("up")) {
            return "向上";
        }else if(direction.equalsIgnoreCase("down")) {
            return "向下";
        }else if(direction.equalsIgnoreCase("left")) {
            return "向左";
        }else if(direction.equalsIgnoreCase("right")) {
            return "向右";
        }else {
            return "无效指令";
        }
    }
}
