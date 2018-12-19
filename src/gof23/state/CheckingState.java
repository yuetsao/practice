package gof23.state;

public class CheckingState implements State {

    @Override
    public void handle() {
        System.out.println("房间已经入住，请勿打扰");
    }
}
