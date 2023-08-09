package GettingStarted;

import java.util.Scanner;

public class PrintNumberInWord {
    static String number(int number) {
        switch (number) {
            case 1:
                return "ONE";
            case 2:
                return "TWO";
            case 3:
                return "THREE";
            case 4:
                return "FOUR";
            case 5:
                return "FIVE";
            case 6:
                return "SIX";
            case 7:
                return "SEVEN";
            case 8:
                return "EIGHT";
            case 9:
                return "NINE";
            default:
                return "OTHER";
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        input.close();
        System.out.println(number(number));
    }
}
