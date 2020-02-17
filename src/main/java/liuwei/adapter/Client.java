package liuwei.adapter;

/**
 * @Title: Client
 * @Description: TODO(用一句话描述该文件做什么)
 * @author: caoyue
 * @date: 2020/2/17 15:04
 * @最后修改人: caoyue
 * @最后修改时间: 2020/2/17 15:04
 * @company: shopin.net
 * @version: V1.0
 */

public class Client {
    public static void main(String[] args) {
        CarController carController;
        PoliceCarAdapter policeCarAdapter = new PoliceCarAdapter();
        carController =  (CarController)policeCarAdapter;
        carController.move();
        carController.phonate();
        carController.twinkle();
    }
}
