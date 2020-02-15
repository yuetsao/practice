package liuwei.builder1;

/**
 * @Title: Client
 * @Description: TODO(用一句话描述该文件做什么)
 * @author: caoyue
 * @date: 2020/2/15 23:27
 * @最后修改人: caoyue
 * @最后修改时间: 2020/2/15 23:27
 * @company: shopin.net
 * @version: V1.0
 */

public class Client {
    public static void main(String[] args) {
        ActorBuilder ab;
        ab = new AngelBuilder();
        Actor actor;
        ActorController ac = new ActorController();
        actor = ac.construct(ab);

        System.out.println(actor);
        
    }
}
