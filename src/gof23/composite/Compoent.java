package gof23.composite;

/**
 * 抽象组件
 */
public interface Compoent {

}

/**
 * 叶子节点
 */
interface Leaf extends Compoent {

}

/**
 * 容器组件
 */
interface Composite extends Compoent {
    void add(Compoent compoent);
    void remove(Compoent compoent);
    Compoent getChild(int index);
}
