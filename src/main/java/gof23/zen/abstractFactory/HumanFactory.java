package gof23.zen.abstractFactory;

/**
 * @author caoyue
 * @description 大概描述所属模块和介绍
 * @date 2019-12-13 11:16
 **/
public interface HumanFactory {
    public Human createWhiteHuman();
    public Human createBlackHuman();
    public Human createYellowHuman();
}
