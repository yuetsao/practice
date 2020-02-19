package liuwei.bridge;

/**
 * @Title: Client
 * @Description: TODO(用一句话描述该文件做什么)
 * @author: caoyue
 * @date: 2020/2/19 16:31
 * @最后修改人: caoyue
 * @最后修改时间: 2020/2/19 16:31
 * @company: shopin.net
 * @version: V1.0
 */

public class Client {
    public static void main(String[] args) {
        Image image = new PNGImage();
        ImageImp imp = new WindowsImp();
        image.setImageImp(imp);
        image.parseFile("小龙女");
    }
}
