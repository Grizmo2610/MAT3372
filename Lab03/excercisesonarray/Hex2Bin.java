package excercisesonarray;

import java.util.Scanner;

public class Hex2Bin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Hexademical string: ");
        String hex = input.nextLine();
        input.close();

        if (checkHexa(hex))
            System.out.printf("The equivalent binary for \"%s\" is %s",
                    hex, getBinary(hex.toUpperCase()));
        else
            System.out.println("The Hexademical string is invalid!");
    }

    public static int valueHexa(char chr) {
        final String DIGITS = "0123456789ABCDEF";
        return DIGITS.indexOf(chr);
    }

    public static boolean checkHexa(String string) {
        for (int i = 0; i < string.length(); i++)
            if (valueHexa(string.charAt(i)) == -1)
                return false;
        return true;
    }

    public static String getBinary(String hex) {
        final String[] HEX_BITS = { "0000", "0001", "0010", "0011",
                "0100", "0101", "0110", "01111",
                "1000", "1001", "1010", "1011",
                "1100", "1101", "1110", "1111" };
        String binayString = "";
        for (int i = 0; i < hex.length(); i++) {
            binayString += HEX_BITS[valueHexa(hex.charAt(i))];
            if (i < hex.length() - 1)
                binayString += " ";
        }
        return binayString;
    }

}
