package moreexercises;

public class FibonacciInt {
    public static void main(String[] args) {
        fibonacci();
    }

    public static long caculateFibonacci(int n){
        if (n < 2)
            return n;
        int f1 = 0, f2 = 1, fn;
        for (int i = 2; i <= n; i++) {
            fn = f1 + f2;
            f1 = f2;
            f2 = fn;
        }

        return f2;
    }
    public static void fibonacci(){
        long fibonacci = 1;
        int number = 0;
        System.out.printf("The factorial of %d is: %d\n", number, fibonacci);
        fibonacci = caculateFibonacci(number + 1);
        while (fibonacci < Integer.MAX_VALUE){
            number ++;
            fibonacci = caculateFibonacci(number + 1);
            System.out.printf("The factorial of %d is: %d\n", number, fibonacci);
        }
        number ++;
        System.out.printf("The factorial of %d is out of range", number);
    }
}
