package moreexercises;
public class FactorialInt {
    public static void main(String[] args) {
        factorial();
    }
    public static void factorial(){
        long factorial = 1, number = 1;
        System.out.printf("The factorial of %d is: %d\n", number, factorial);
        while (factorial * number < Integer.MAX_VALUE){
            number += 1;
            factorial *= number;
            System.out.printf("The factorial of %d is: %d\n", number, factorial);
        }
        number ++;
        System.out.printf("The factorial of %d is out of range", number);
    }
}
