package GettingStarted;

import java.util.Scanner;

public class CheckPassFaill {

    public static String check(int mark) {
        if (mark >= 50)
            return "PASS";
        return "FAIL";
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int mark = input.nextInt();
        input.close();
        System.out.println(check(mark));
        System.out.println("Done");
    }
}
