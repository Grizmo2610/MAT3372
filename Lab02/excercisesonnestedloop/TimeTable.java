package excercisesonnestedloop;

import java.util.Scanner;

public class TimeTable {
    public static void printTimeTable(int size){
        for (int row = 0; row <= size; row ++){
            if (row == 0) {
                for (int col = 0; col <= size; col++)
                    if (col == 0)
                        System.out.printf("%2s | ","*");
                    else
                        System.out.printf("%4d", col);
                System.out.println();

                for (int col = 0; col <= size + 1; col++)
                    System.out.print("----");
            }
            else
                for (int col = 0; col <= size; col ++)
                    if (col == 0)
                        System.out.printf("%2d | ", row);
                    else
                        System.out.printf("%4d", col * row);

            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size: ");
        int size = input.nextInt();
        input.close();
        printTimeTable(size);
    }
}
