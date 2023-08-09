package InputDecisionAndLoop;

import java.util.Scanner;

public class ReverseInt {
    public static int reverse(int n){
        int result = 0;
        while (n > 0){
            result = result * 10 + n % 10 ;
            n /= 10;
        }
        return  result;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int n = input.nextInt();
        input.close();

        System.out.println("The reverse is: " + reverse(n));
    }
}
