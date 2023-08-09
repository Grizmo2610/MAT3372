package observe.ex1;

import java.util.List;

public class Subject {
    protected List<Observer> observers;
    protected int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public void attach() {

    }

    public void notifyAllObservers() {

    }
}
