package liuwei.command;

/**
 * @Title: HelpCommand
 * @Description: TODO(用一句话描述该文件做什么)
 * @author: caoyue
 * @date: 2020/2/24 14:53
 * @最后修改人: caoyue
 * @最后修改时间: 2020/2/24 14:53
 * @company: shopin.net
 * @version: V1.0
 */

public class HelpCommand extends  Command {
    private DisplayHelpClass displayHelpClass;
    
    public HelpCommand() {
        this.displayHelpClass = new DisplayHelpClass();
    }
    
    @Override
    public void execute() {
        displayHelpClass.display();
    }
}
