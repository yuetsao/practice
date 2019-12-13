package gof23.zen.extendsTemplate;

/**
 * @author caoyue
 * @description 大概描述所属模块和介绍
 * @date 2019-12-13 14:40
 **/
public class HummerH1Model extends HummerModel {
    public Boolean alarmFlag = true;
    @Override
    protected void start() {
        System.out.println("H1 start!");
    }

    @Override
    protected void stop() {
        System.out.println("H1 stop!");
    }

    @Override
    protected void alarm() {
        System.out.println("H1 bee bee!");
    }

    @Override
    protected void engineBoom() {
        System.out.println("Engine boom!");
    }
    public void setAlarm(Boolean alarmFlag) {
        this.alarmFlag = alarmFlag;
    }
}
