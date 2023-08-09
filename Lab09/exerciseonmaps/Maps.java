package exerciseonmaps;

import java.util.*;

public class Maps {
    /**
     Write a function to return the number of key-value mappings of a map
     */
    public static int count(Map<Integer, Integer> map) {
        return map.size();
    }
    /**

     Write a function to remove all mappings from a map
     */
    public static void empty(Map<Integer, Integer> map) {
        map.clear();
    }
    /**

     Write a function to test if a map contains a mapping for the specified key
     */
    public static boolean contains(Map<Integer, Integer> map, int key) {
        return map.containsKey(key);
    }
    /**
     Write a function to test if a map contains a mapping for the specified key
     and if its value equals the specified value
     */
    public static boolean containsKeyValue(Map<Integer, Integer> map, int key, int value) {
        return contains(map, key) && map.get(key) == value;
    }
    /**
     Write a function to return the key set of map
     */
    public static Set<Integer> keySet(Map<Integer, Integer> map) {
        return map.keySet();
    }
    /**

     Write a function to return the values of a map
     */
    public static Collection<Integer> values(Map<Integer, Integer> map) {
        return map.values();
    }
    /**

     Write a function, internally using a map, returning "black", "white", or "red" depending on input value.
     "black" = 0, "white" = 1, "red" = 2
     */
    public static String getColor(int value) {
        Map<Integer, String> map = new HashMap<>();
        map.put(0, "black");
        map.put(1, "white");
        map.put(2, "red");
        return map.getOrDefault(value, "Unknown");
    }

    public static void main(String[] args) {
        System.out.println(getColor(5));
    }
}