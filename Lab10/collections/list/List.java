package collections.list;

public interface List {
    void add(Object value, int index);

    void remove(int index);

    int size();

    Object get(int index);

    void add(Object value);
}
