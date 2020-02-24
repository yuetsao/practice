package liuwei.command;

/**
 * @Title: ExitCommand
 * @Description: TODO(用一句话描述该文件做什么)
 * @author: caoyue
 * @date: 2020/2/24 14:49
 * @最后修改人: caoyue
 * @最后修改时间: 2020/2/24 14:49
 * @company: shopin.net
 * @version: V1.0
 */

public class ExitCommand extends Command {
    
    private SystemExitClass systemExitClass;
    
    public ExitCommand() {
        systemExitClass = new SystemExitClass();
    }
    
    @Override
    public void execute() {
        systemExitClass.exit();
    }
}
