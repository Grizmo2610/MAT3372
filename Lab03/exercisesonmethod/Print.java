package exercisesonmethod;

public class Print {
    public static void main(String[] args) {
        String[] stringArray = { "Helo", "World", "!" };
        char[] charArray = { 'P', 'H', 'N' };
        int[] integerArray = { 3, 4, 5 };
        long[] longArray = { 20, 30, 500 };
        double[] doubleArray = { 3.5, 4.5, 5.6 };
        float[] floatArray = { 3.2F, 3.9F, 2.2F };

        print(stringArray);
        print(charArray);
        print(integerArray);
        print(longArray);
        print(doubleArray);
        print(floatArray);
    }

    public static void print(char[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.printf("\'%s\'", array[i]);
            if (i < array.length - 1)
                System.out.print(", ");
        }
        System.out.println("]");

    }

    public static void print(String[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.printf("\"%s\"", array[i]);
            if (i < array.length - 1)
                System.out.print(", ");
        }
        System.out.println("]");

    }

    public static void print(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1)
                System.out.print(", ");
        }
        System.out.println("]");
    }

    public static void print(long[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1)
                System.out.print(", ");
        }
        System.out.println("]");
    }

    public static void print(double[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1)
                System.out.print(", ");
        }
        System.out.println("]");
    }

    public static void print(float[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1)
                System.out.print(", ");
        }
        System.out.println("]");
    }
}
