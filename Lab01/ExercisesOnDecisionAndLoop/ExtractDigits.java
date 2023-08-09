package ExercisesOnDecisionAndLoop;

import java.util.Scanner;

public class ExtractDigits {
    public static String extractDigits(int n){
        String result = "";
        while (n > 0){
            result += n % 10 + " ";
            n /= 10;
        }
        return  result;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.close();
        System.out.println("The Extract Digits of "+ n + " is " +extractDigits(n));
    }
}
