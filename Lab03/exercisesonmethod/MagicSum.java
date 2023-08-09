package exercisesonmethod;

import java.util.Scanner;

public class MagicSum {
    public static void main(String[] args) {
        final int FLAG = -1;
        int magicSum = getMagicSum(FLAG);
        System.out.println("The magic sum is: " + magicSum);
    }

    public static boolean hasEight(int number) {
        if (number < 0)
            number *= -1;

        while (number > 10) {
            if (number % 10 == 8)
                return true;
            number /= 10;
        }
        return number == 8;
    }

    public static int getMagicSum(int flag) {
        Scanner input = new Scanner(System.in);
        int sum = 0;
        int number;
        do {
            System.out.print("Enter a positive (or -1 to end): ");
            number = input.nextInt();
            if (hasEight(number))
                sum += number;
        } while (number != flag);
        input.close();
        return sum;
    }
}
