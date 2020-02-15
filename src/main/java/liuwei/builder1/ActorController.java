package liuwei.builder1;

/**
 * @Title: ActorController
 * @Description: TODO(用一句话描述该文件做什么)
 * @author: caoyue
 * @date: 2020/2/15 23:25
 * @最后修改人: caoyue
 * @最后修改时间: 2020/2/15 23:25
 * @company: shopin.net
 * @version: V1.0
 */

public class ActorController {
    public Actor construct(ActorBuilder ab) {
        Actor actor;
        ab.buildType();
        ab.buildSex();
        ab.buildFace();
        ab.buildCostume();
        ab.buildHairstyle();
        actor = ab.createActor();
        return actor;
    }
}
