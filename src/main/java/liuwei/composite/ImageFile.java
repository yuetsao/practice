package liuwei.composite;

/**
 * @Title: ImageFile
 * @Description: TODO(用一句话描述该文件做什么)
 * @author: caoyue
 * @date: 2020/2/19 23:00
 * @最后修改人: caoyue
 * @最后修改时间: 2020/2/19 23:00
 * @company: shopin.net
 * @version: V1.0
 */

public class ImageFile extends AbstractFile {
    
    private String name;
    
    public ImageFile(String name) {
        this.name = name;
    }
    
    @Override
    public void add(AbstractFile file) {
        System.out.println("对不起不支持该方法");
    }

    @Override
    public void remove(AbstractFile file) {
        System.out.println("对不起不支持该方法");
    }

    @Override
    public AbstractFile getChild(int i) {
        System.out.println("对不起不支持该方法");
        return null;
    }

    @Override
    public void killVirus() {
        System.out.println("---对图像文件" + name + "进行杀毒");
    }
}
