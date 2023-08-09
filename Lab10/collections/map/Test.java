package collections.map;

public class Test {
    public static void main(String[] args) {
        Map m = new HashMap();
        m.put(11, "Nicola");
        m.put(11, "Nicola");
        m.put(21, "Marzia");
        m.put(33, "Agata");
        System.out.println("Test Map:\n" + m);

        System.out.println();
        m.remove(21);
        System.out.println("Test remove 21: \n" + m);

        System.out.println("Map contain 11: " + m.contains(11));
        System.out.println("Map contain 26: " + m.contains(26));
        System.out.println("Size: " + m.size());

    }
}
