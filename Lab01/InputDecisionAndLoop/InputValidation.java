package InputDecisionAndLoop;

import java.util.Scanner;

public class InputValidation {
    public static void input() {
        Scanner input = new Scanner(System.in);
        int number = -1;
        do {
            System.out.print("Enter a number between 0−10 or 90−100: ");
            number = input.nextInt();
            if (number < 0 || (number > 10 && number < 90) || number > 100)
                System.out.println("Invalid input, try again ...");
        } while (number < 0 || (number > 10 && number < 90) || number > 100);
        System.out.println("You have entered: " + number);
        input.close();
    }

    public static void main(String[] args) {
        input();
    }
}
