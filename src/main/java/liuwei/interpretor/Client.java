package liuwei.interpretor;

/**
 * @Title: Client
 * @Description: TODO(用一句话描述该文件做什么)
 * @author: caoyue
 * @date: 2020/2/24 22:19
 * @最后修改人: caoyue
 * @最后修改时间: 2020/2/24 22:19
 * @company: shopin.net
 * @version: V1.0
 */

public class Client {
    public static void main(String[] args) {
        String instruction = "down run 10 and left move 20";
        InstructionHandler handler = new InstructionHandler();
        handler.handle(instruction);
        String outString;
        outString = handler.output();
        System.out.println(outString);
    }
}
