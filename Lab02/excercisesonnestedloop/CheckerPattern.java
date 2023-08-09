package excercisesonnestedloop;

import java.util.Scanner;

public class CheckerPattern {
    public static void printPattern(int size){
        for (int row = 0; row < size; row++){
            if (row % 2 != 0)
                System.out.print(" ");
            for (int col = 0; col < size; col++)
                System.out.print("# ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size = input.nextInt();
        input.close();
        System.out.println("Pattern: ");
        printPattern(size);
    }
}
