package excercisesonnestedloop;

import java.util.Scanner;

public class TriangularPattern {
    public static void triangularPatternA(int size){
        for (int row = 0; row < size; row ++){
            for (int col = 0; col <= row; col++)
                System.out.print("# ");
            System.out.println();
        }
    }

    public static void triangularPatternB(int size){
        for (int row = size - 1; row >= 0; row --){
            for (int col = 0; col <= row; col++)
                System.out.print("# ");
            System.out.println();
        }
    }

    public static void triangularPatternC(int size){
        for (int row = 0; row < size; row ++){
            for (int col = 0; col < size; col++)
                if (row <= col)
                    System.out.print("# ");
                else
                    System.out.print("  ");
            System.out.println();
        }
    }

    public static void triangularPatternD(int size){
        for (int row = 0; row < size; row ++){
            for (int col = 0; col < size; col++)
                if (row  + col >= size - 1)
                    System.out.print("# ");
                else
                    System.out.print("  ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size = input.nextInt();
        input.close();

        System.out.println("Triangular Pattern A: ");
        triangularPatternA(size);

        System.out.println("\nTriangular Pattern B: ");
        triangularPatternB(size);

        System.out.println("\nTriangular Pattern C: ");
        triangularPatternC(size);

        System.out.println("\nTriangular Pattern D: ");
        triangularPatternD(size);
    }
}
