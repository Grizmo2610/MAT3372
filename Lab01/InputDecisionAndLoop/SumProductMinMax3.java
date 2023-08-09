package InputDecisionAndLoop;

import java.util.Scanner;

public class SumProductMinMax3 {
    public static int sum(int fisrt, int second, int third) {
        return fisrt + second + third;
    }

    public static int product(int fisrt, int second, int third) {
        return fisrt * second * third;
    }

    public static int min(int fisrt, int second, int third) {
        int[] number = { fisrt, second, third };
        int min = number[0];
        for (int i = 1; i < 3; i++)
            if (number[i] < min)
                min = number[i];
        return min;
    }

    public static int max(int fisrt, int second, int third) {
        int[] number = { fisrt, second, third };
        int max = number[0];
        for (int i = 1; i < 3; i++)
            if (number[i] > max)
                max = number[i];
        return max;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter 1st integer: ");
        int fisrt = input.nextInt();

        System.out.print("Enter 2nd integer: ");
        int second = input.nextInt();

        System.out.print("Enter 3rd integer: ");
        int third = input.nextInt();

        input.close();

        System.out.println("The sum is: " + sum(fisrt, second, third));
        System.out.println("The product is: " + product(fisrt, second, third));
        System.out.println("The min is: " + min(fisrt, second, third));
        System.out.println("The max is: " + max(fisrt, second, third));
    }
}
