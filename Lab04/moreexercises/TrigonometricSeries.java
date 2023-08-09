package moreexercises;

import java.util.Scanner;

public class TrigonometricSeries {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter x: ");
        double x = input.nextDouble();
        System.out.print("Enter num: ");
        int numTerms = input.nextInt();
        input.close();

        System.out.printf("Sin(%f) = %.2f\n", x, calculateSin(x, numTerms));
        System.out.printf("Cos(%f) = %.2f", x, calculateCos(x, numTerms));

    }
    public static double calculateSin(double x, int numTerms) {
        numTerms = Math.min(numTerms,200);
        double sin = x, numerator = x, denominator = 1, sign = -1;
        for (double factorial = 1; factorial < numTerms; factorial += 2) {
            numerator *= x * x;
            denominator *= (factorial + 1) * (factorial + 2);
            sin += sign * numerator / denominator;
            sign *= -1;
        }
        return sin;
    }

    public static double calculateCos(double x, int numTerms){
        numTerms = Math.min(numTerms,200);
        double cos = 1, numerator = 1, denominator = 1, sign = -1;
        for (double factorial = 0; factorial < numTerms; factorial += 2) {
            numerator *= x * x;
            denominator *= (factorial + 1) * (factorial + 2);
            cos += sign * numerator / denominator;
            sign *= -1;
        }
        return cos;
    }
}
