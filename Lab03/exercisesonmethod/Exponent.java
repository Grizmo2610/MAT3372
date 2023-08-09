package exercisesonmethod;

import java.util.Scanner;

public class Exponent {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the base: ");
        int base = input.nextInt();
        System.out.print("Enter the exponent: ");
        int exponent = input.nextInt();
        input.close();

        System.out.printf("%d raises to the power of %d is: %d",
                base, exponent, exponent(base, exponent));
    }

    public static long exponent(int base, int exponent) {
        long result = 1;
        for (int i = 0; i < exponent; i++)
            result *= base;
        return result;
    }
}
