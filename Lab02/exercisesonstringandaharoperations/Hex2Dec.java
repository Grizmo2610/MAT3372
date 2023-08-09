package exercisesonstringandaharoperations;

import java.util.Scanner;

public class Hex2Dec {
    public static int valueHexa(char chr){
        final String DIGITS = "0123456789ABCDEF";
        return DIGITS.indexOf(chr);
    }
    public static int getDecimal(String hexadecimal) {
        if (hexadecimal.length() == 0 || hexadecimal == null)
            return -1;

        int val = valueHexa(hexadecimal.charAt(0));
        for (int i = 1; i <hexadecimal.length(); i ++){
            int valueHex = valueHexa(hexadecimal.charAt(i));
            if (valueHex == -1)
                return -1;
            val = val * 16 + valueHex;
        }
        return val;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a hexademical string: ");
        String hexadecimal = input.next().toUpperCase();
        input.close();

        int demical = getDecimal(hexadecimal);
        if (demical == -1){
            System.out.println("Error: invalid hexademical string\" " + hexadecimal +"\"");
        }
        else
            System.out.printf("The equivalent demical number for octal \"%s\" is: %d", hexadecimal, demical);
    }
}
