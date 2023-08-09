package exercisesonstringandaharoperations;

import java.util.Scanner;

public class CaesarCode {
    public static String convert(String ques){
        String code = "";
        for(int index = 0; index < ques.length(); index++){
            int temp = (int) ques.charAt(index) + 3;
            if (temp > 90)
                temp -= 26;
            code += (char) temp;
        }
        return code;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a palintext string: ");
        String text = input.next().toUpperCase();
        input.close();

        System.out.println("The cipher string is: " + convert(text));
    }
}
