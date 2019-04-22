package gof23.state;

public class FreeState implements State {
    @Override
    public void handle() {
        System.out.println("房间空闲没有人住");
    }
}
