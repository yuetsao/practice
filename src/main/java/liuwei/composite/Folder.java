package liuwei.composite;

import java.util.ArrayList;

/**
 * @Title: Folder
 * @Description: TODO(用一句话描述该文件做什么)
 * @author: caoyue
 * @date: 2020/2/19 23:09
 * @最后修改人: caoyue
 * @最后修改时间: 2020/2/19 23:09
 * @company: shopin.net
 * @version: V1.0
 */

public class Folder extends AbstractFile {
    
    private ArrayList<AbstractFile> fileList = new ArrayList<>();
    
    private String name;
    
    public Folder(String name) {
        this.name = name;
    }
    
    @Override
    public void add(AbstractFile file) {
        fileList.add(file);
    }

    @Override
    public void remove(AbstractFile file) {
        fileList.remove(file);
    }

    @Override
    public AbstractFile getChild(int i) {
        return fileList.get(i);
    }

    @Override
    public void killVirus() {
        System.out.println("****对文件夹" + name + "进行杀毒");
        for (AbstractFile file: fileList) {
            file.killVirus();
        }
    }
}
