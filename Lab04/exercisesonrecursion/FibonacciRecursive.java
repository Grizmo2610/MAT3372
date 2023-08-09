package exercisesonrecursion;

import java.util.Scanner;

public class FibonacciRecursive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        input.close();
        System.out.printf("%d-th fibonacci number is: %d",number , fibonacci(number));
    }
    public static int fibonacci(int n){
        return (n < 2 ) ? 1 : fibonacci(n - 1) + fibonacci(n - 2);
    }
}
