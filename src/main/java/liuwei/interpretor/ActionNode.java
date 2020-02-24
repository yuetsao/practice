package liuwei.interpretor;

/**
 * @Title: ActionNode
 * @Description: TODO(用一句话描述该文件做什么)
 * @author: caoyue
 * @date: 2020/2/24 22:06
 * @最后修改人: caoyue
 * @最后修改时间: 2020/2/24 22:06
 * @company: shopin.net
 * @version: V1.0
 */

public class ActionNode extends AbstractNode {
    private String action;
    
    public ActionNode (String action) {
        this.action = action;
    }
    
    @Override
    public String interpret() {
        if(action.equalsIgnoreCase("move")) {
            return "移动";
        }else if(action.equalsIgnoreCase("run")) {
            return "快速移动";
        }else {
            return "无效指令";
        }
    }
}
