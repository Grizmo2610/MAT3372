package exercisesonstringandaharoperations;

import java.util.Scanner;

public class RadixN2Dec {
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

    public static int valueOct(char chr) {
        return (int) chr - 48;
    }

    public static boolean checkOct(String string) {
        for (int i = 0; i < string.length(); i++) {
            int value = valueOct(string.charAt(i));
            if (value < 0 || value > 7)
                return false;
        }
        return true;
    }

    public static int valueBinary(char chr) {
        return (int) chr - 48;
    }

    public static boolean checkBinary(String string) {
        for (int i = 0; i < string.length(); i++) {
            int value = valueOct(string.charAt(i));
            if (value != 1 && value != 0)
                return false;
        }
        return true;
    }

    public static boolean validRadix(int radix) {
        if (radix == 2 || radix == 16 || radix == 8)
            return true;
        return false;
    }

    public static boolean validString(String string, int radix) {
        if (string.length() == 0)
            return false;
        else if (radix == 2)
            return checkBinary(string);
        else if (radix == 8)
            return checkOct(string);
        return checkHexa(string);

    }

    public static int valueRadix(int radix, char chr) {
        if (radix == 16) {
            return valueHexa(chr);
        } else if (radix == 8) {
            return valueOct(chr);
        }
        return valueBinary(chr);

    }

    public static int convertRadix(String string, int radix) {
        int sum = valueRadix(radix, string.charAt(0));
        for (int i = 1; i < string.length(); i++) {
            int value = valueRadix(radix, string.charAt(i));
            if (value == -1)
                return -1;
            sum = sum * radix + value;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the radix: ");
        int radix = input.nextInt();
        System.out.print("Enter the the string: ");
        String string = input.next().toUpperCase();
        input.close();

        if (!validRadix(radix)) {
            System.out.println("Error invalid radix type \"" + radix + "\"");
        } else if (!validString(string, radix)) {
            System.out.println("Error: invalid string \" " + string + "\"");
        } else {
            int demical = convertRadix(string, radix);
            System.out.printf("The equivalent demical number \"%s\" is: %d", string, demical);
        }

    }
}
