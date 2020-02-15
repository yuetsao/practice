package liuwei.abstractFactory1;

/**
 * @Title: SpringTextField
 * @Description: TODO(用一句话描述该文件做什么)
 * @author: caoyue
 * @date: 2020/2/15 19:52
 * @最后修改人: caoyue
 * @最后修改时间: 2020/2/15 19:52
 * @company: shopin.net
 * @version: V1.0
 */

public class SpringTextField implements TextField {
    @Override
    public void display() {
        System.out.println("显示绿色的边框文本框");
    }
}
