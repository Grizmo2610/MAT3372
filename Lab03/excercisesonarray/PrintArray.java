package excercisesonarray;

import java.util.Scanner;

public class PrintArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of items: ");
        int size = input.nextInt();
        int[] numbers = inputArray(size, input);
        input.close();

        printArray(numbers);
    }

    public static int[] inputArray(int size, Scanner input) {
        System.out.print("Enter the value of all items (separated by space): ");
        int[] numbers = new int[size];
        for (int i = 0; i < size; i++)
            numbers[i] = input.nextInt();
        return numbers;
    }

    public static void printArray(int[] numbers) {
        System.out.print("The value are: [");
        for (int i = 0; i < numbers.length; i++) {
            if (i < numbers.length - 1)
                System.out.print(numbers[i] + ", ");
            else
                System.out.println(numbers[i] + "]");
        }
    }
}
