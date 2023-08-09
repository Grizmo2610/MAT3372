package exercisesonstringandaharoperations;

import java.util.Scanner;

public class ReverseString {
    public static String reverseString(String string){
        String result = "";
        for (int i = string.length() - 1; i >= 0; i--)
            result += string.charAt(i);
        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String string = input.next();
        input.close();

        System.out.printf("The reverse of the String %s is %s", string, reverseString(string));
    }
}
