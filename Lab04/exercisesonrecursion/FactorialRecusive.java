package exercisesonrecursion;

import java.util.Scanner;

public class FactorialRecusive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        input.close();
        System.out.printf("%d! = %d",number , factorial(number));
    }
    public static int factorial (int n){
        return (n == 1 ) ? 1 : n * factorial(n - 1) ;
    }
}
