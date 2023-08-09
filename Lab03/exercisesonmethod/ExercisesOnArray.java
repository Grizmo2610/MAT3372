package exercisesonmethod;

import java.util.Scanner;

public class ExercisesOnArray {
    public static void main(String[] args) {
        // Input Array 1 and array3 2
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = input.nextInt();
        int[] array1 = inputArray(size, input);
        int[] array2 = inputArray(size, input);

        // print array3
        System.out.print("Array1: ");
        print(array1);

        // Array to string
        System.out.println("Array1 to string: " + arrayToString(array1));

        // Enter a key value to search
        System.out.print("Enter key: ");
        int key = input.nextInt();
        input.close();

        // If array1 contain key
        if (contains(array1, key)) {
            System.out.printf("\"%d\" in array1\n", key);
            System.out.printf("Index of \"%d\" in array1 is %d\n", key, search(array1, key));
        }
        // else array2 not contain key
        else
            System.out.printf("\"%d\" in array1\n", key);

        // if array1 equal to array2
        if (equal(array1, array2))
            System.out.println("Array1 equal to array2");

        // if array1 not equal to array2
        else
            System.out.println("Array1 not equal to array2");

        // copy array1
        int[] array3 = copyOf(array1);
        System.out.print("Copy of array1: ");
        print(array3);

        // swap value array1 with array2
        if (swap(array1, array2)) {
            System.out.println("After swap: ");
            System.out.print("Array 1: ");
            print(array1);
            System.out.print("Array 2: ");
            print(array2);
        } else
            System.out.println("Can not swap array1 to array2");

        // reverse array3
        System.out.println("After reverse array1: ");
        reverse(array1);
        print(array1);

    }

    public static int[] inputArray(int size, Scanner input) {
        int[] numbers = new int[size];
        System.out.print("Enter all value (separate by space): ");
        for (int i = 0; i < size; i++)
            numbers[i] = input.nextInt();
        return numbers;
    }

    public static String arrayToString(int[] array) {
        String result = "";
        for (int i = 0; i < array.length; i++)
            result += "" + array[i];
        return result;
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

    public static boolean contains(int[] array, int key) {
        for (int i = 0; i < array.length; i++)
            if (key == array[i])
                return true;
        return false;
    }

    public static int search(int[] array, int key) {
        for (int i = 0; i < array.length; i++)
            if (key == array[i])
                return i;
        return -1;
    }

    public static boolean equal(int[] array1, int[] array2) {
        if (array1.length != array2.length)
            return false;

        for (int i = 0; i < array1.length; i++)
            if (array1[i] != array2[i])
                return false;
        return true;
    }

    public static int[] copyOf(int[] array) {
        int[] copyArray = new int[array.length];
        for (int i = 0; i < array.length; i++)
            copyArray[i] = array[i];
        return copyArray;
    }

    public static int[] copyOf(int[] array, int newLength) {
        int[] copyArray = new int[newLength];
        for (int i = 0; i < Math.min(array.length, newLength); i++)
            copyArray[i] = array[i];
        return copyArray;
    }

    public static boolean swap(int[] array1, int[] array2) {
        if (array1.length != array2.length)
            return false;

        for (int i = 0; i < array1.length; i++) {
            int temp = array1[i];
            array1[i] = array2[i];
            array2[i] = temp;
        }
        return true;
    }

    public static void reverse(int[] array) {
        for (int i = 0, j = array.length - 1; i < j; i++, j--) {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }
}
