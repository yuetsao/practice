package gof23.zen.extendsTemplate;

/**
 * @author caoyue
 * @description 大概描述所属模块和介绍
 * @date 2019-12-13 14:35
 **/
public abstract class HummerModel {
    protected abstract void start();
    protected abstract void stop();
    protected abstract void alarm();
    protected abstract void engineBoom();
    final public void run() {
        this.start();
        this.engineBoom();
        if(this.isAlarm()) {
            this.alarm();
        }
        this.stop();
    }
    protected boolean isAlarm() {
        return true;
    }
}
