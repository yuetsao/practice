package liuwei.interpretor;

/**
 * @Title: DistanceNode
 * @Description: TODO(用一句话描述该文件做什么)
 * @author: caoyue
 * @date: 2020/2/24 22:09
 * @最后修改人: caoyue
 * @最后修改时间: 2020/2/24 22:09
 * @company: shopin.net
 * @version: V1.0
 */

public class DistanceNode extends AbstractNode {
    private String distance;

    public DistanceNode(String distance) {
        this.distance = distance;
    }

    @Override
    public String interpret() {
        return this.distance;
    }
}
