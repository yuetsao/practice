package gof23.commond;

public interface Commond {
    /**
     * 这个方法返回空
     * 可以设计成多个
     */
    void execute();
}

class ConcreteCommond implements Commond {

    private Receiver receiver;

    public ConcreteCommond(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.action();
    }
}
