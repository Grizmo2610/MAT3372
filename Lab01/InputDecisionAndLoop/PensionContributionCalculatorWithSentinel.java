package InputDecisionAndLoop;

import java.util.Scanner;

public class PensionContributionCalculatorWithSentinel {
    public static double employeeContribution(int salary, int age) {
        if (age < 55)
            return salary * 0.2;
        else if (age < 61)
            return salary * 0.13;
        else if (age < 66)
            return salary * 0.075;
        return salary * 0.05;
    }

    public static double employerContribution(int salary, int age) {
        if (age < 55)
            return salary * 0.17;
        else if (age < 61)
            return salary * 0.13;
        else if (age < 66)
            return salary * 0.09;
        return salary * 0.075;
    }

    public static void input() {
        Scanner input = new Scanner(System.in);
        int salary = 0;
        int age = 0;
        do{
            System.out.print("Enter the monthly salary: ");
            salary = input.nextInt();
            if (salary != -1) {
                System.out.print("Enter the age: ");
                age = input.nextInt();
                output(salary, age);
            }
        } while (salary != -1);
        input.close();
    }

    public static void output(int salary, int age){
        double employee = employeeContribution(salary, age);
        double employer = employerContribution(salary, age);

        System.out.println("The employee’s contribution is: " + employee);
        System.out.println("The employer’s contribution is: " + employer);
        System.out.println("The total contribution is: " + employee + employer);
    }

    public static void main(String[] args) {
        input();
        System.out.println("Bye!");
    }
}
