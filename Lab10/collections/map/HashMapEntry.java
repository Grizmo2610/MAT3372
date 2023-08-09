package collections.map;

public class HashMapEntry {
    private Object key;
    private Object value;

    public HashMapEntry(Object key, Object value) {
        this.key = key;
        this.value = value;
    }

    public Object getKey() {
        return key;
    }

    public Object getValue() {
        return value;
    }
}
