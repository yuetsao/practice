package gof23.javaseobserver;

import java.util.Observable;

//目标对象
public class ConcreteSubject extends Observable {
    private int state;

    public void set(int state) {
        this.state = state;
        setChanged();
        notifyObservers(state);
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }
}
