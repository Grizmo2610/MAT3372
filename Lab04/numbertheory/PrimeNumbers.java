package numbertheory;

import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the uppper bound: ");
        int bound = input.nextInt();
        input.close();

        primeList(bound);
    }
    public static boolean[] sieveOfEratosthenes(int bound) {
        boolean[] prime = new boolean[bound+1];
        for(int p = 2; p*p <=bound; p++)
            if(!prime[p])
                for(int i = p*p; i <= bound; i += p)
                    prime[i] = true;
        return prime;
    }

    public static int countPrime(boolean[] primes){
        int count = 0;
        for (int i = 2; i < primes.length ; i++)
            if (!primes[i])
                count ++;
        return count;
    }

    public static void  primeList(int upperBound){
        int numberPrime = countPrime(sieveOfEratosthenes(upperBound));
        System.out.printf("%d primes found (%.2f%%)", numberPrime, 100.0 * numberPrime / upperBound);
    }
}
