package liuwei.flyweight;

/**
 * @Title: IgoChessman
 * @Description: TODO(用一句话描述该文件做什么)
 * @author: caoyue
 * @date: 2020/2/22 13:37
 * @最后修改人: caoyue
 * @最后修改时间: 2020/2/22 13:37
 * @company: shopin.net
 * @version: V1.0
 */

public abstract class IgoChessman {
    public abstract String getColor();
    
    public void display() {
        System.out.println("棋子颜色："  +  this.getColor());
    }
}
