package liuwei.bridge;

/**
 * @Title: JPGImage
 * @Description: TODO(用一句话描述该文件做什么)
 * @author: caoyue
 * @date: 2020/2/19 16:28
 * @最后修改人: caoyue
 * @最后修改时间: 2020/2/19 16:28
 * @company: shopin.net
 * @version: V1.0
 */

public class BMPImage extends Image {

    @Override
    public void parseFile(String fileName) {
        Matrix m = new Matrix();
        imp.doPaint(m);
        System.out.println(fileName + ",格式为BMP");
    }
}
