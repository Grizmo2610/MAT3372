package GettingStarted;

import java.util.Scanner;

public class PrintDayInWord {
    static String dayInWord(int day) {
        switch (day) {
            case 0:
                return "Sunday";
            case 1:
                return "Monday";
            case 2:
                return "Tuesday";
            case 3:
                return "Wednesday";
            case 4:
                return "Thursday";
            case 5:
                return "Friday";
            case 6:
                return "Sarturday";
            default:
                return "Not a valid day";
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int day = input.nextInt();
        input.close();
        System.out.println(dayInWord(day));

    }
}
