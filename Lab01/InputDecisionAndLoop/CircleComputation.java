package InputDecisionAndLoop;

import java.util.Scanner;

public class CircleComputation {
    public static double diameter(double radius) {
        return 2 * radius;
    }

    public static double area(double radius) {
        return Math.PI * radius * radius;
    }

    public static double circumference(double radius) {
        return Math.PI * radius * 2.0;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter radius: ");
        double radius = input.nextDouble();
        input.close();
        System.out.println("Diameter = " + diameter(radius));
        System.out.println("Area = " + area(radius));
        System.out.println("Circumfernce = " + circumference(radius));
    }
}
