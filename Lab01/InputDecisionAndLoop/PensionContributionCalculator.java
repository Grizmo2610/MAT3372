package InputDecisionAndLoop;

import java.util.Scanner;

public class PensionContributionCalculator {

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

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the monthly salary: ");
        int salary = input.nextInt();

        System.out.print("Enter the age: ");
        int age = input.nextInt();

        input.close();

        double employee = employeeContribution(salary, age);
        double employer = employerContribution(salary, age);

        System.out.println("The employee's contribution is: " + employee);
        System.out.println("The employer's contribution is: " + employer);
        System.out.println("The total contribution is: " + employee + employer);

    }
}
