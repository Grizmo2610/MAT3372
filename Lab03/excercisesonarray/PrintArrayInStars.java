package excercisesonarray;

import java.util.Scanner;

public class PrintArrayInStars {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of items: ");
        int size = input.nextInt();
        int[] numItems = inputArray(size, input);
        input.close();

        printArrayStar(numItems);
    }

    public static int[] inputArray(int size, Scanner input) {
        System.out.print("Enter the value of all items (separated by space): ");
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++)
            numbers[i] = input.nextInt();
        return numbers;
    }

    public static void printArrayStar(int[] numItems) {
        for (int i = 0; i < numItems.length; i++) {
            System.out.print(i + ": ");
            printStar(numItems[i]);
        }
    }

    public static void printStar(int size) {
        for (int i = 0; i < size; i++) {
            System.out.print("*");
        }
        System.out.println("(" + size + ")");
    }
}
