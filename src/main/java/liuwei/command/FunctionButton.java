package liuwei.command;

/**
 * @Title: FunctionButton
 * @Description: TODO(用一句话描述该文件做什么)
 * @author: caoyue
 * @date: 2020/2/24 14:47
 * @最后修改人: caoyue
 * @最后修改时间: 2020/2/24 14:47
 * @company: shopin.net
 * @version: V1.0
 */

public class FunctionButton {
    private Command command;
    
    public void setCommand(Command command) {
        this.command = command;
    }
    
    public void click() {
        System.out.println("单击功能键");
        command.execute();
    }
}
