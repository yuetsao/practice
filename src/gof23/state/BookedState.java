package gof23.state;

public class BookedState implements State {

    @Override
    public void handle() {
        System.out.println("房间已经预定，不能再预定");
    }
}
