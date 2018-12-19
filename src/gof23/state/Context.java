package gof23.state;

/**
 * 维持不同状态之间的切换
 */
public class Context {

    //如果是银行系统，这个context根据金额不同切换不同的状态
    private State state;

    public void setState(State s) {
        this.state = s;
        state.handle();
    }
}
