package liuwei.bridge;

/**
 * @Title: WindowsImp
 * @Description: TODO(用一句话描述该文件做什么)
 * @author: caoyue
 * @date: 2020/2/19 16:22
 * @最后修改人: caoyue
 * @最后修改时间: 2020/2/19 16:22
 * @company: shopin.net
 * @version: V1.0
 */

public class WindowsImp implements ImageImp {
    @Override
    public void doPaint(Matrix m) {
        System.out.println("在windows系统中显示图像");
    }
}
