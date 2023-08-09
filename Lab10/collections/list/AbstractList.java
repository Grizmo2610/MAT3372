package collections.list;

public abstract class AbstractList implements List {
    public AbstractList() {
    }

    @Override
    public abstract void add(Object value, int index);

    @Override
    public abstract void add(Object value);

    @Override
    public abstract void remove(int index);

    @Override
    public abstract int size();

    @Override
    public abstract Object get(int index);

    protected void checkBoundaries(int index, int limit) {
        if (index < 0 || index > limit){
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    @Override
    public String toString() {
        return "MyAbstractList{}";
    }
}
