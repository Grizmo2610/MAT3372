package exercisesonstringandaharoperations;

import java.util.Scanner;

public class DecipherCaesarCode {
    public static String decode(String text){
        String code = "";
        for(int index = 0; index < text.length(); index++){
            int temp = (int) text.charAt(index) - 3;
            if (temp < 65)
                temp += 26;
            code += (char) temp;
        }
        return code;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a ciphertext string: ");
        String text = input.next().toUpperCase();
        input.close();

        System.out.println("The plaintext string is: " + decode(text));
    }
}
