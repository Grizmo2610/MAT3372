package collections.list;

public class ArrayList extends AbstractList {
    private int size = 0;
    private final int DEFAULT_CAPACITY = 16;
    private Object[] element = new Object[DEFAULT_CAPACITY];

    public ArrayList() {
    }

    @Override
    public void add(Object value, int index) {
        if (this.size == this.element.length)
            return;

        checkBoundaries(index, size);
        for (int i = this.size; i > index; i--){
            element[i] = element[i - 1];
        }
        element[index] = value;
        size++;
    }

    @Override
    public void add(Object value) {
        add(value, size);
    }

    @Override
    public void remove(int index) {
        checkBoundaries(index, DEFAULT_CAPACITY);
        Object[] temp = new Object[size - 1];
        System.arraycopy(element, 0, temp, 0, index);
        System.arraycopy(element, index + 1, temp, index + 1 - 1, size - (index + 1));
        size--;
        element = temp;
    }

    @Override
    public int size() {
        return element.length;
    }

    @Override
    public Object get(int index) {
        checkBoundaries(index, DEFAULT_CAPACITY);
        return element[index];
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder("[");
        for (int i = 0; i < size; i++) {
            result.append(element[i]);
            if (i < size - 1)
                result.append(", ");
        }
        result.append("]");
        return result.toString();
    }
}
