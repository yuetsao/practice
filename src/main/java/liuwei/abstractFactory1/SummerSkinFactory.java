package liuwei.abstractFactory1;

/**
 * @Title: SummerSkinFactory
 * @Description: TODO(用一句话描述该文件做什么)
 * @author: caoyue
 * @date: 2020/2/15 19:59
 * @最后修改人: caoyue
 * @最后修改时间: 2020/2/15 19:59
 * @company: shopin.net
 * @version: V1.0
 */

public class SummerSkinFactory implements SkinFactory {
    @Override
    public Button createButton() {
        return new SummerButton();
    }

    @Override
    public TextField createTextField() {
        return new SummerTextField();
    }

    @Override
    public ComboBox createComoBox() {
        return new SummerComboBox();
    }
}
