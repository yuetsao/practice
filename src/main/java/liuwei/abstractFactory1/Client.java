package liuwei.abstractFactory1;

/**
 * @Title: Client
 * @Description: TODO(用一句话描述该文件做什么)
 * @author: caoyue
 * @date: 2020/2/15 20:02
 * @最后修改人: caoyue
 * @最后修改时间: 2020/2/15 20:02
 * @company: shopin.net
 * @version: V1.0
 */

public class Client {
    public static void main(String[] args) {
        Button button;
        TextField textField;
        ComboBox comboBox;
        
        SkinFactory skinFactory = new SpringSkinFactory();
        
        button = skinFactory.createButton();
        textField = skinFactory.createTextField();
        comboBox = skinFactory.createComoBox();
        
        button.display();
        textField.display();
        comboBox.display();
    }
}
