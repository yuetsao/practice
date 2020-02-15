package liuwei.builder1;

/**
 * @Title: ActorBuilder
 * @Description: TODO(用一句话描述该文件做什么)
 * @author: caoyue
 * @date: 2020/2/15 23:15
 * @最后修改人: caoyue
 * @最后修改时间: 2020/2/15 23:15
 * @company: shopin.net
 * @version: V1.0
 */

public abstract class ActorBuilder {
    protected Actor actor = new Actor();
    
    public abstract void buildType();
    public abstract void buildSex();
    public abstract void buildFace();
    public abstract void buildCostume();
    public abstract void buildHairstyle();
    
    public Actor createActor() {
        return actor;
    }
}
