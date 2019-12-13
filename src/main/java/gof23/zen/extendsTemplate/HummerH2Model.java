package gof23.zen.extendsTemplate;

/**
 * @author caoyue
 * @description 大概描述所属模块和介绍
 * @date 2019-12-13 14:44
 **/
public class HummerH2Model extends HummerModel {
    @Override
    protected void start() {
        System.out.println("H2 start!");
    }

    @Override
    protected void stop() {
        System.out.println("H2 stop!");
    }

    @Override
    protected void alarm() {
        System.out.println("H2 alarm!");
    }

    @Override
    protected void engineBoom() {
        System.out.println("H2 engine boom!");
    }
    @Override
    protected boolean isAlarm () {
        return false;
    }
}
