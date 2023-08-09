package exerciseonlists;
import java.util.*;

public class Lists {

    /**
     * Write a function to insert an element into a list at the beginning
     */
    public static void insertFirst(ArrayList<Integer> list, int value) {
        list.add(0, value);
    }

    /**
     * Write a function to insert an element into a list at the end
     */
    public static void insertLast(ArrayList<Integer> list, int value) {
        list.add(value);
    }

    /**
     * Write a function to replace the 3rd element of a list with a given value
     */
    public static void replace(ArrayList<Integer> list, int value) {
        list.set(2, value);
    }

    /**
     * Write a function to remove the 3rd element from a list
     */
    public static void removeThird(ArrayList<Integer> list) {
        list.remove(2);
    }

    /**
     * Write a function to remove the element "666" from a list
     */
    public static void removeEvil(ArrayList<Integer> list) {
        while (list.contains(666))
            list.remove((Integer) 666);
    }

    /**
     * Write a function returning an ArrayList<Integer> containing
     * the first 10 square numbers (i.e., 1, 4, 9, 16, ...)
     */
    public static ArrayList<Integer> generateSquare() {
        ArrayList<Integer> squares = new ArrayList<Integer>();
        for (int i = 1; i < 11; i ++)
            squares.add(i * i);
        return squares;
    }

    /**
     * Write a function to verify if a list contains a certain value
     */
    public static boolean contains(ArrayList<Integer> list, int value) {
        return list.contains(value);
    }

    /**
     * Write a function to copy a list into another list (without using library functions)
     * Note well: the target list must be emptied before the copy
     */
    public static void copy(ArrayList<Integer> source, ArrayList<Integer> target) {
        while (target.size() > 0)
            target.remove(0);

        target.addAll(source);
    }

    /**
     * Write a function to reverse the elements of a list
     */
    public static void reverse(ArrayList<Integer> list) {
        Collections.reverse(list);
    }

    /**
     * Write a function to reverse the elements of a list (without using library functions)
     */
    public static void reverseManual(ArrayList<Integer> list) {
        for (int l = 0, r = list.size() - 1 ; l < r; l++, r --) {
            int temp = list.get(l);
            list.set(l, list.get(r));
            list.set(r, temp);
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list = generateSquare();
        System.out.println("Test generateSquare: ");
        System.out.println(list);

        insertFirst(list, 666);
        System.out.println("Test insertFirst: ");
        System.out.println(list);

        insertLast(list, 555);
        System.out.println("Test insertLast: ");
        System.out.println(list);

        replace(list, 26);
        System.out.println("Test replace:");
        System.out.println(list);

        removeEvil(list);
        System.out.println("Test removeEvil:");
        System.out.println(list);

        System.out.println("Test contain (9): " + contains(list, 6));

        ArrayList<Integer> target = new ArrayList<Integer>();
        System.out.println("Test copy: ");
        target = generateSquare();

        System.out.println("Before copy: ");
        System.out.println(target);
        copy(list, target);
        System.out.println("After copy: ");
        System.out.println(target);

        reverse(list);
        System.out.println("Test reverse:");
        System.out.println(list);

        reverseManual(list);
        System.out.println("Test reverseManual:");
        System.out.println(list);
    }
}

