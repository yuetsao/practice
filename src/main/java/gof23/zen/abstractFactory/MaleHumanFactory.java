package gof23.zen.abstractFactory;

/**
 * @author caoyue
 * @description 大概描述所属模块和介绍
 * @date 2019-12-13 11:25
 **/
public class MaleHumanFactory implements HumanFactory {
    public Human createWhiteHuman() {
        return new MaleWhiteHuman();
    }

    public Human createBlackHuman() {
        return new MaleBlackHuman();
    }

    public Human createYellowHuman() {
        return new MaleYellowHuman();
    }
}
