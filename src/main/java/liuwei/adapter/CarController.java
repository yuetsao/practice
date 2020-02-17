package liuwei.adapter;

/**
 * @Title: CarController
 * @Description: TODO(用一句话描述该文件做什么)
 * @author: caoyue
 * @date: 2020/2/17 14:57
 * @最后修改人: caoyue
 * @最后修改时间: 2020/2/17 14:57
 * @company: shopin.net
 * @version: V1.0
 */

public abstract class CarController {
    public void move() {
        System.out.println("玩具汽车移动");
    }
    public abstract void phonate();
    public abstract void twinkle();
}
