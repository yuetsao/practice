package liuwei.builder1;

/**
 * @Title: DevilBuilder
 * @Description: TODO(用一句话描述该文件做什么)
 * @author: caoyue
 * @date: 2020/2/15 23:21
 * @最后修改人: caoyue
 * @最后修改时间: 2020/2/15 23:21
 * @company: shopin.net
 * @version: V1.0
 */

public class DevilBuilder extends ActorBuilder {
    @Override
    public void buildType() {
        actor.setType("恶魔");
    }

    @Override
    public void buildSex() {
        actor.setSex("妖");
    }

    @Override
    public void buildFace() {
        actor.setFace("丑陋");
    }

    @Override
    public void buildCostume() {
        actor.setCostume("黑衣");
    }

    @Override
    public void buildHairstyle() {
        actor.setHiarstyle("光头");
    }
}
