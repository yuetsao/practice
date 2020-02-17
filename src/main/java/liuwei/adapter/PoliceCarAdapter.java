package liuwei.adapter;

/**
 * @Title: PoliceCarAdapter
 * @Description: TODO(用一句话描述该文件做什么)
 * @author: caoyue
 * @date: 2020/2/17 15:02
 * @最后修改人: caoyue
 * @最后修改时间: 2020/2/17 15:02
 * @company: shopin.net
 * @version: V1.0
 */

public class PoliceCarAdapter extends CarController {
    private PoliceSound soud;
    private PoliceLamp lamp;
    public PoliceCarAdapter () {
        soud = new PoliceSound();
        lamp = new PoliceLamp();
    }
    @Override
    public void phonate() {
        soud.alarmSound();
    }

    @Override
    public void twinkle() {
        lamp.alarmLamp();
    }
}
