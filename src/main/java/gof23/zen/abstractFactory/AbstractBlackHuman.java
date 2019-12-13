package gof23.zen.abstractFactory;

/**
 * @author caoyue
 * @description 大概描述所属模块和介绍
 * @date 2019-12-13 10:58
 **/
public abstract class AbstractBlackHuman implements Human {
    public void getColor() {
        System.out.println("black");
    }
    public void talk() {
        System.out.println("speak Africa language!");
    }
}
