package numbertheory;

import java.util.Scanner;

public class PrimeFactors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int bound = input.nextInt();
        input.close();

        int[] perfectPrimeFactorList = count(bound);
        System.out.println("These numbers are equal to the product of prime factors:");
        print(perfectPrimeFactorList);
        System.out.printf("[%d numbers found (%.2f%%)]", perfectPrimeFactorList.length,
                          100.0 * perfectPrimeFactorList.length / bound);
    }

    public static void print(int[] numbers){
        for (int i = 0; i < numbers.length; i++){
            System.out.print(numbers[i]);
            if (i != numbers.length - 1)
                System.out.print(" ");
        }
        System.out.println();
    }
    public static int[] append(int[] numbers, int number){
        int[] newArray = new int[numbers.length + 1];
        for (int i = 0; i < numbers.length; i++)
            newArray[i] = numbers[i];

        newArray[numbers.length] = number;
        numbers = newArray;
        return numbers;
    }
    public static boolean[] sieveOfEratosthenes(int bound) {
        boolean[] prime = new boolean[bound+1];
        for(int p = 2; p*p <=bound; p++)
            if(!prime[p])
                for(int i = p*p; i <= bound; i += p)
                    prime[i] = true;
        return prime;
    }

    public static boolean isProductOfPrimeFactors(int number, boolean[] prime){
        int product = 1;
        for (int j = 2; j <= number; j++)
            if (!prime[j] && number % j == 0)
                product *= j;
        return product == number;
    }
    public static int[] count(int bound){
        boolean[] prime = sieveOfEratosthenes(bound);
        int[] result = {};
        for (int number = 2; number <= bound; number++)
            if (isProductOfPrimeFactors(number, prime) && prime[number])
                result = append(result, number);
        return result;
    }

}
