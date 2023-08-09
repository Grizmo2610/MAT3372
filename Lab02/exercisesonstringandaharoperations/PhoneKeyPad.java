package exercisesonstringandaharoperations;

import java.util.Scanner;

public class PhoneKeyPad {
    public static String check(char chr){
        final String[] CHARATER= {"abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        for (int i = 0; i < 8; i++)
            if (CHARATER[i].indexOf ( chr ) != -1)
                return Integer.toString (i + 2);
        return "";
    }
    public static String convert(String string) {
        String result = "";
        for (int index = 0; index < string.length(); index++) {
            result += check ( string.charAt ( index ) );
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String string = input.next();
        input.close();

        System.out.println("Result: " + convert(string));
    }
}
