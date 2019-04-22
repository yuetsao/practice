package gof23.state;

public class Client {
    public static void main(String[] args) {
        System.out.println();
        Context cxt = new Context();
        cxt.setState(new BookedState());

    }
}
