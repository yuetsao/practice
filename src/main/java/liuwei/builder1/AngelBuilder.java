package liuwei.builder1;

/**
 * @Title: AngelBuilder
 * @Description: TODO(用一句话描述该文件做什么)
 * @author: caoyue
 * @date: 2020/2/15 23:24
 * @最后修改人: caoyue
 * @最后修改时间: 2020/2/15 23:24
 * @company: shopin.net
 * @version: V1.0
 */

public class AngelBuilder extends ActorBuilder {
    @Override
    public void buildType() {
        actor.setType("天使");
    }

    @Override
    public void buildSex() {
        actor.setSex("女");
    }

    @Override
    public void buildFace() {
        actor.setFace("美丽");
    }

    @Override
    public void buildCostume() {
        actor.setCostume("白裙");
    }

    @Override
    public void buildHairstyle() {
        actor.setHiarstyle("披肩长发");
    }
}
