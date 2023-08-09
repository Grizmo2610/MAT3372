package exercisesonrecursion;

import java.util.Scanner;

public class LengthOfARunningNumberSequence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        long number = input.nextLong();
        input.close();
        System.out.println("Length of number is: " + length(number));
    }

    public static int length(long number){
        if (number == 0)
            return 0;
        return 1 + length(number / 10);
    }
}
