package exercisesonstringandaharoperations;

import java.util.Scanner;

public class CheckHexStr {
    public static boolean check(String text){
        for (int i = 0; i < text.length(); i++){
            char chr = text.charAt(i);
            if ( (chr < 47 || (chr > 57  && chr < 65) || chr  >  70))
                return false;
        }return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a hex string: ");
        String hexString = input.next();
        input.close();
        if (check(hexString.toUpperCase())){
            System.out.println("\" " + hexString + "\" is a hex string");
        }else {
            System.out.println("\" " + hexString + "\" is NOT a hex string");
        }
    }
}
