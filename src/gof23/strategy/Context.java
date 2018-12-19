package gof23.strategy;

//负责和具体的策略类交互
//算法彻底和客户端分离，使得算法可以独立的变化
public class Context {
    private Strategy strategy;//当前采用的算法

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void printPrice(double s) {
        System.out.println("您该报价" + strategy.getPrice(s));
    }
}
