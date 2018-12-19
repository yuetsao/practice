package gof23.observer;

public class ObserverA implements Observer {
    private int myState;//和目标对象的值保持一致，并且其他的观察者也能发生变化

    @Override
    public void update(Subject subject) {
        myState = ((ConcreteSubject)subject).getState();
    }

    public int getMyState() {
        return myState;
    }

    public void setMyState(int myState) {
        this.myState = myState;
    }
}
