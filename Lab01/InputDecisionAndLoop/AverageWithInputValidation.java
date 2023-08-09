package InputDecisionAndLoop;

import java.util.Scanner;

public class AverageWithInputValidation {
    public static double input() {
        Scanner input = new Scanner(System.in);
        int number = -1;
        int sum = 0;
        for (int student = 1; student <=3; student ++){
            do {
                System.out.print("Enter the mark (0 - 100) for student " + student + ": ");
                number = input.nextInt();
                if (number < 0 || number > 100)
                    System.out.println("Invalid input, try again ...");
                else
                    sum += number;
            } while (number < 0 || number > 100);
        }
        input.close();
        return  sum / 3.0;
    }

    public static void main(String[] args) {
        System.out.println(input());
    }
}
