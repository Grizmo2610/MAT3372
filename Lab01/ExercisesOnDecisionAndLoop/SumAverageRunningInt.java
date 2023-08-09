package ExercisesOnDecisionAndLoop;

import java.util.Scanner;

public class SumAverageRunningInt {
    /*
    public static int sumInt(int lowerBound, int upperBound) {
        return (lowerBound + upperBound) * (upperBound - lowerBound + 1) / 2;
    }

    public static long sumSquare(int lowerBound, int upperBound) {
        if (lowerBound == 1) {
            return upperBound * (upperBound + 1) * (2 * upperBound + 1) / 6;
        }
        return sumSquare(1, upperBound) - sumSquare(1, lowerBound - 1);
    }

    public static int sumOdd(int lowerBound, int upperBound) {
        if (lowerBound == 1) {
            return upperBound * (upperBound + 1);
        }
        return sumOdd(1, upperBound) - sumOdd(1, lowerBound - 1);
    }

    public static int sumEven(int lowerBound, int upperBound) {
        if (lowerBound == 1) {
            return upperBound * upperBound;
        }
        return sumEven(1, upperBound) - sumEven(1, lowerBound - 1);
    }*/

    public static int sumInt(int lowerBound, int upperBound) {
        int sum = 0;
        for (int i = lowerBound; i <= upperBound; i++)
            sum += i;
        return  sum;
    }

    public static long sumSquare(int lowerBound, int upperBound) {
        int sum = 0;
        for (int i = lowerBound; i <= upperBound; i++)
            sum += i * i;
        return  sum;
    }

    public static int sumOdd(int lowerBound, int upperBound) {
        int sum = 0;
        for (int i = lowerBound; i <= upperBound; i++)
            if (i % 2 != 0)
                sum += i;
        return  sum;
        }

    public static int sumEven(int lowerBound, int upperBound) {
        int sum = 0;
        for (int i = lowerBound; i <= upperBound; i++)
            if (i % 2 == 0)
                sum += i;
        return sum;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int lowerBound = input.nextInt();
        int upperBound = input.nextInt();
        input.close();
        int sumInt = sumInt(lowerBound, upperBound);
        System.out.printf("The sum of %d to %d is %d\n", lowerBound, upperBound, sumInt);
        System.out.println("The average is " + sumInt / (upperBound - lowerBound + 1));
        System.out.printf("The sum of the square of %d to %d is %d\n", lowerBound,
                                                                upperBound,
                                                                sumSquare(lowerBound, upperBound));
        System.out.printf("The sum of the even of %d to %d\n",  lowerBound,
                                                                upperBound,
                                                                sumEven(lowerBound, upperBound));
        System.out.printf("The sum of the even of %d to %d\n",  lowerBound,
                                                                upperBound,
                                                                sumOdd(lowerBound, upperBound));
    }
}
