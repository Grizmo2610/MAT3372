package excercisesonnestedloop;

import java.util.Scanner;

public class SquarePattern {
    public static void printPattern(int size) {
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++)
                if (col == size - 1)
                    System.out.print("#");
                else
                    System.out.print("# ");
            System.out.println();
        }
    }

    public static void printPatternWhileDo(int size) {
        int row = 0;
        while (row < size) {
            int col = 0;
            while (col < size) {
                if (col == size - 1)
                    System.out.print("#");
                else
                    System.out.print("# ");
                col++;
            }
            row++;
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size = input.nextInt();
        input.close();
        System.out.println("Using For loop: ");
        printPattern(size);
        System.out.println("Using While - do loop: ");
        printPatternWhileDo(size);
    }
}
