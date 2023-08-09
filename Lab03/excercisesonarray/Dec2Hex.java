package excercisesonarray;

import java.util.Scanner;

public class Dec2Hex {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int decimal = input.nextInt();
        input.close();

        System.out.println("The equivalent hexadecimal number is: " + getHec(decimal));
    }

    public static String getHec(int decimal) {
        final String DIGITS = "0123456789ABCDEF";
        String hex = "";
        while (decimal > 0) {
            hex = DIGITS.charAt(decimal % 16) + hex;
            decimal /= 16;
        }
        return hex;
    }
}
