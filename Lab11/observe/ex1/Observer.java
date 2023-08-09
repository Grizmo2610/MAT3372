package observe.ex1;

public abstract class Observer {
    protected Subject subject;

    public abstract void update();
}
