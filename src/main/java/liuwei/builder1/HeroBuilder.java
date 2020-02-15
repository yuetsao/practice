package liuwei.builder1;

/**
 * @Title: HeroBuilder
 * @Description: TODO(用一句话描述该文件做什么)
 * @author: caoyue
 * @date: 2020/2/15 23:18
 * @最后修改人: caoyue
 * @最后修改时间: 2020/2/15 23:18
 * @company: shopin.net
 * @version: V1.0
 */

public class HeroBuilder extends ActorBuilder {
    @Override
    public void buildType() {
        actor.setType("英雄");
    }

    @Override
    public void buildSex() {
        actor.setSex("男");
    }

    @Override
    public void buildFace() {
        actor.setFace("英俊");
    }

    @Override
    public void buildCostume() {
        actor.setCostume("盔甲");
    }

    @Override
    public void buildHairstyle() {
        actor.setHiarstyle("飘逸");
    }
}
