package ExercisesOnDecisionAndLoop;

import java.util.Scanner;

public class HarmonicSum {
    public static  double sumLeftToRight(int n){
        double sum = 0;
        for (int i = 1; i <=n; i++)
            sum += 1.0 / i;
        return sum;
    }

    public static  double sumRightToLeft(int n){
        double sum = 0;
        for (int i = n; i > 0; i--)
            sum += 1.0 / i;
        return sum;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.close();
        System.out.println("Sum left to right" + sumLeftToRight(n));
        System.out.println("Sum right to left" + sumRightToLeft(n));

    }
}
