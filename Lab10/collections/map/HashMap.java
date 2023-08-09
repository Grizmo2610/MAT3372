package collections.map;

import java.security.Key;

public class HashMap implements Map {
    protected HashMapEntry[] table;
    protected final int INITIAL_SIZE = 8;
    protected int size;

    @Override
    public int size() {
        return size;
    }

    @Override
    public void put(Object key, Object value) {
        enlarge();
        table[size - 1] = new HashMapEntry(key, value);
    }

    @Override
    public void remove(Object key) {
        int bucket = getBucket(key);
        HashMapEntry[] temp = new HashMapEntry[size - 1];
        for (int i = 0; i < bucket; i++){
            temp[i] = table[i];
        }
        for (int i = bucket + 1; i < size; i++){
            temp[i - 1] = table[i];
        }
        size--;
        table = temp;
    }

    @Override
    public boolean contains(Object key) {

        for (int i = 0; i < table.length; i++){
            if (table[i].getKey().equals(key)){
                return true;
            }
        }

        for (HashMapEntry hashMapEntry: table){
            if (hashMapEntry.getKey().equals(key)){
                return true;
            }
        }return false;
    }

    @Override
    public Object get(Object key) {
        int bucket = getBucket(key);
        if (table[bucket] != null){
            return table[bucket].getValue();
        }
        return null;
    }

    public double capacifyRatio(){
        return 1.0 * size / table.length;
    }

    protected void enlarge(){
        HashMapEntry[] temp = new HashMapEntry[size + 1];
        for (int i = 0; i < size; i++){
            temp[i] = table[i];
        }
        table = temp;
        size ++;
    }

    protected int getBucket(Object key){
        int bucket = (Math.abs(key.hashCode()) % table.length);
        while (table[bucket] != null && table[bucket].getKey() != key){
            bucket = (bucket + 1) % table.length;
        }
        return bucket;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < table.length; i++){
            if (table[i] == null){
                sb.append(String.format("[bucket %d] -> null\n", i));
            } else {
                sb.append(String.format("[bucket %d] -> (%s, %s)\n", i, table[i].getKey(), table[i].getValue()));
            }
        }
        return sb.toString();
    }
}
