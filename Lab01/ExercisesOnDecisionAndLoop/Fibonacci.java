package ExercisesOnDecisionAndLoop;

import java.util.Scanner;

public class Fibonacci {
    public static int[] computeFibonacci(int n){
        int[] f = {0, 1};
        int[] result = new int[n + 1];
        result[0] = 0;
        result[1] = 1;
        for (int i = 2; i <= n; i++){
            int temp = f[1];
            f[1] = f[1] + f[0];
            f[0] = temp;
            result[i] = f[1];
        }
        return result;
    }


    public static void printFibonacci(int[] fibonaccis){
        for (int i = 1; i < fibonaccis.length; i++)
            System.out.print(fibonaccis[i] + " ");
    }

    public static  double averageFibonacci(int[] fibonaccis){
        double sum = 0.0;
        for (int i = 0; i < fibonaccis.length; i++)
            sum += fibonaccis[i];
        return sum / (1.0 * fibonaccis.length);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.close();
        int[] fibonaccis = computeFibonacci(n);
        System.out.println("The first " + n +" Fibonacci numbers are : ");
        printFibonacci(fibonaccis);
        System.out.println("The average is: " + averageFibonacci(fibonaccis));
    }
}
