package liuwei.bridge;

/**
 * @Title: Image
 * @Description: TODO(用一句话描述该文件做什么)
 * @author: caoyue
 * @date: 2020/2/19 16:26
 * @最后修改人: caoyue
 * @最后修改时间: 2020/2/19 16:26
 * @company: shopin.net
 * @version: V1.0
 */

public abstract class Image {
    protected ImageImp imp;
    public void setImageImp(ImageImp imp) {
        this.imp = imp;
    }
    public abstract void parseFile(String fileName);
}
