package liuwei.composite;

/**
 * @Title: AbstractFile
 * @Description: TODO(用一句话描述该文件做什么)
 * @author: caoyue
 * @date: 2020/2/19 22:58
 * @最后修改人: caoyue
 * @最后修改时间: 2020/2/19 22:58
 * @company: shopin.net
 * @version: V1.0
 */

public abstract class AbstractFile {
    public abstract void add(AbstractFile file);
    public abstract void remove(AbstractFile file);
    public abstract AbstractFile getChild(int i);
    public abstract void killVirus();
}
