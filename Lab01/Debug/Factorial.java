package Debug;

public class Factorial {
        public static long factorial(int n){
            long factorial = 1 ;
            for ( int i = 1 ; i <= n ; i ++ ) {
                factorial = factorial * i ; // *
            }
            return factorial;
        }

        public static void main ( String [] args ) {
            int n = 20;
            long factorial = factorial(n);
            System.out.println("The Factorial of " + n + " is " + factorial) ;
        }
}

