package gof23.zen.abstractFactory;

/**
 * @author caoyue
 * @description 大概描述所属模块和介绍
 * @date 2019-12-13 11:20
 **/
public class FemaleHumanFactory implements HumanFactory {

    public FemaleWhiteHuman createWhiteHuman() {
        return new FemaleWhiteHuman();
    }

    public FemaleBlackHuman createBlackHuman() {
        return new FemaleBlackHuman();
    }

    public FemaleYellowHuman createYellowHuman() {
        return new FemaleYellowHuman();
    }
}
