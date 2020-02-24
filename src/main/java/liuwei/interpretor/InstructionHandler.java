package liuwei.interpretor;

import java.util.Stack;

/**
 * @Title: InstructionHandler
 * @Description: TODO(用一句话描述该文件做什么)
 * @author: caoyue
 * @date: 2020/2/24 22:11
 * @最后修改人: caoyue
 * @最后修改时间: 2020/2/24 22:11
 * @company: shopin.net
 * @version: V1.0
 */

public class InstructionHandler {
    private AbstractNode node;
    
    public void handle(String instruction) {
        AbstractNode left = null , right = null;
        AbstractNode direction = null , action = null , distance = null;
        Stack<AbstractNode> stack = new Stack<AbstractNode>();
        String [] words = instruction.split(" ");
        for(int i =0; i<words.length; i++) {
            if(words[i].equalsIgnoreCase("and")) {
                left = (AbstractNode) stack.pop();
                String word1 = words[++i];
                direction = new DirectionNode(word1);
                String word2 = words[++i];
                action = new ActionNode(word2);
                String word3 = words[++i];
                distance = new DistanceNode(word3);
                right = new SentenceNode(direction, action, distance);
                stack.push(new AndNode(left, right));
            }else {
                String word1 = words[i];
                direction = new DirectionNode(word1);
                String word2 = words[++i];
                action = new ActionNode((word2));
                String word3 = words[++i];
                distance = new DistanceNode(word3);
                left = new SentenceNode(direction, action, distance);
                stack.push(left);
            }
        }
        this.node = (AbstractNode)stack.pop();
    }
    public String output() {
        String result = node.interpret();
        return result;
    }
}
