package moreexercises;

import java.util.Scanner;

public class DateUtil {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter year: ");
        int year = input.nextInt();

        System.out.print("Enter month: ");
        int month = input.nextInt();

        System.out.print("Enter day: ");
        int day = input.nextInt();
        input.close();

        if (isValidDate(year, month,day)){
            if (isLeapYear(year))
                System.out.println(year + " is a leap year!");
            else
                System.out.println(year + " is not a leap year!");

            System.out.println(toString(year, month, day));
        }else {
            System.out.printf("%d/%d/%d is not a valid date\n", day, month, year);
        }

    }
    public static boolean isLeapYear(int year){
        return (year % 4 == 0 && year % 100 != 0) || year % 400 == 0;
    }

    public static int maxDay(int month, int year){
        if (month == 2){
            if (isLeapYear(year))
                return 29;
            return 28;
        }
        final int[] SMALLMONTHS = {4,6,9,11};
        for (int mon: SMALLMONTHS)
            if (mon == month)
                return 30;
        return 31;
    }

    public static boolean validYear(int year){
        return 1 <= year && year <= 9999;
    }

    public static boolean validMonth(int month){
        return 1 <= month && month <= 12;
    }

    public static boolean isValidDate(int year, int month, int day){
        if (!validYear(year) || !validMonth(month))
            return false;
        return 1 <= day && day <= maxDay(month,year);
    }

    public static int getDayOfWeek(int year, int month, int day){
        return  (day + ((13 * (month + 1)) / 5) + year + (year / 4) - (year / 100) + (year / 400)) % 7;
    }

    public static String dayOfWeek(int year, int month, int day){
        final String[] DAYOFWEEK = new String[]  {"Sunday","Monday", "Tuesday", "Wednesday",
                                    "Thursday", "Friday", "Saturday"};
        return DAYOFWEEK[getDayOfWeek(year,month,day)];
    }

    public static String getMonth(int month){
        final String[] MONTH = {"January", "February", "March","April","May", "June", "July",
                                "August","September", "October", "November", "December"};
        return MONTH[month - 1];
    }

    public static String toString(int year, int month, int day){
        return dayOfWeek(year, month, day) + " " + day + " " + getMonth(month) + " " + year;
    }
}
