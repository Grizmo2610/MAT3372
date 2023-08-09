package moreexercises;

import java.util.Random;
import java.util.Scanner;

public class NumberGuess {
    static Scanner input = new Scanner(System.in);
    static Random randint = new Random();
    static int computerGuess = randint.nextInt(89) + 10;
    ;
    static int playerInput;

    // Guess number
    static int playerInput(String stringInput) {
        System.out.print(stringInput);
        return input.nextInt();
    }

    // Check running
    static boolean running() {
        return playerInput == computerGuess;
    }

    // Before guess Hint
    static boolean isPrimeNumber() {
        for (int i = 2; i < computerGuess; i++)
            if (computerGuess % i == 0)
                return false;
        return true;
    }

    // Biggest divisor
    static int mod(int randomDivisor) {
        int number  = computerGuess;
        int divisor = 1;
        divisor = number / randomDivisor;
        number -= divisor * randomDivisor;
        return number;
    }

    // computerGuess * "A random number" from 21 to 29
    static int mutiple() {
        return computerGuess * (randint.nextInt(8) + 21);
    }

    // Greatset common number of ComputerGuess and playerInput
    static int greatestCommonNumber() {
        int GreatestCommonDivisor = 1;
        for (int i = 1; i <= Math.min(computerGuess, playerInput); i++)
            if (computerGuess % i == 0 && playerInput % i == 0)
                GreatestCommonDivisor = i;
        return GreatestCommonDivisor;
    }

    // Digit in number
    static boolean digitInNumber(int digit) {
        String stringNumber = String.valueOf(computerGuess);
        for (int i = 0; i < stringNumber.length(); i++)
            if (stringNumber.charAt(i) == digit + 48)
                return true;
        return false;
    }

    // Hint method
    static String hint() {
        int randomHint = randint.nextInt(5) + 1;
        switch (randomHint) {
            case 1:
                if (playerInput < computerGuess)
                    return "Your number is smaler than you have to guess";
                return "Your number is bigger than you have to guess";
            case 2:
                int randomDivisor = randint.nextInt(8) + 2;
                return String.format("\"Computer number\" mod %d is: %d", randomDivisor, mod(randomDivisor));
            case 3:
                return (mutiple() + " is a mutiple of guessing number!");
            case 4:
                return String.format("Greatest common divisor of \"computer number\" and \"Your number (%d)\" is: %d\n",
                                     playerInput, greatestCommonNumber());
            default:
                int digit = randint.nextInt(10);
                return String.format("In guessing number have digit %d: %s", digit, digitInNumber(digit));
        }
    }

    public static void main(String[] args) {
        // Rule
        String stringInput = "Guess a random positive number: ";
        System.out.println("Rule");
        System.out.println("1. You have to Guess a positive number from 10 to 99!");
        System.out.println("2. After every guess, program will give you a random hint.");
        System.out.println("3. You want to stop just need to type in \"Stop\" or \"Exit\".");
        System.out.println("4. At first you will know Guessing number is prime or not.");
        System.out.println("---------------------");

        int time = 1;

        try {
            System.out.printf("Guessing number is prime: %s\n", isPrimeNumber());
            playerInput = playerInput(stringInput);
            boolean running = running();
            stringInput = "Retype in number: ";

            while (! running && time <= 10) {
                System.out.println("\nOops! Wrong number\nHere is your hint: \n" + hint() + "\n");
                time++;
                playerInput = playerInput(stringInput);
                running = running();
            }

            if (running){
                System.out.printf("Congratulation! You guess right number (%d) at %d-th time",
                                  computerGuess, time);
                System.out.println("\nThank you for playing!");
            } else {
                System.out.println("Loser can't win this game?");
                System.out.println("Number you have to guess is: " + computerGuess);
            }

        } catch (Exception e) {
            System.out.println("Loser can't win this game ?");
        }
    }
}
