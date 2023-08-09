package excercisesonnestedloop;

import java.util.Scanner;

public class BoxPattern {
    public static void boxPatternA(int size){
        for (int row = 0; row < size; row++){
            for (int col = 0; col < size; col++)
                if (col == size - 1 || col == 0 || row == 0 || row == size - 1)
                    System.out.print("* ");
                else System.out.print("  ");
            System.out.println();
        }
    }

    public static void boxPatternB(int size){
        for (int row = 0; row < size; row++){
            for (int col = 0; col < size; col++)
                if (col == row || row == 0 || row == size - 1)
                    System.out.print("* ");
                else System.out.print("  ");
            System.out.println();
        }
    }

    public static void boxPatternC(int size){
        for (int row = 0; row < size; row++){
            for (int col = 0; col < size; col++)
                if (col + row == size - 1 || row == 0 || row == size - 1)
                    System.out.print("* ");
                else System.out.print("  ");
            System.out.println();
        }
    }

    public static void boxPatternD(int size){
        for (int row = 0; row < size; row++){
            for (int col = 0; col < size; col++)
                if (col + row == size - 1 || row == 0 || row == size - 1 || col == row)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size = input.nextInt() - 1;
        input.close();

        System.out.println("Box Pattern A:");
        boxPatternA(size);
        System.out.println();

        System.out.println("Box Pattern B:");
        boxPatternB(size);
        System.out.println();

        System.out.println("Box Pattern C:");
        boxPatternC(size);
        System.out.println();

        System.out.println("Box Pattern D:");
        boxPatternD(size);
        System.out.println();
    }
}
