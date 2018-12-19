package gof23.observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    List<Observer> observerList = new ArrayList<>();
    public void register(Observer observer) {
        observerList.add(observer);
    }

    public void removeObserver(Observer observer) {
        observerList.remove(observer);
    }

    public void notifyAllObserver() {
        for (Observer o : observerList) {
           o.update(this);
        }
    }
}
