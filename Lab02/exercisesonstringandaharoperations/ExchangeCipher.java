package exercisesonstringandaharoperations;

import java.util.Scanner;

public class ExchangeCipher {
    public static String convert(String plaintext) {
        String result = "";
        int sum = 'A' + 'Z';
        for (int index = 0; index < plaintext.length(); index++) {
            char ch = plaintext.charAt(index);
            result += (char) (sum - ch);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a plaintext string: ");
        String plaintext = input.next().toUpperCase();
        input.close();

        System.out.print("The ciphertext string is: " + convert(plaintext));

    }
}
