package liuwei.abstractFactory1;

/**
 * @Title: SkinFactory
 * @Description: TODO(用一句话描述该文件做什么)
 * @author: caoyue
 * @date: 2020/2/15 19:56
 * @最后修改人: caoyue
 * @最后修改时间: 2020/2/15 19:56
 * @company: shopin.net
 * @version: V1.0
 */

public interface SkinFactory {
    public Button createButton();
    public TextField createTextField();
    public ComboBox createComoBox();
}
