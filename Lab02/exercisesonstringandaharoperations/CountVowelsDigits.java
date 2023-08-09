package exercisesonstringandaharoperations;

import java.util.Scanner;

public class CountVowelsDigits {

    public static boolean isVowel(char chr) {
        final String VOWEL = "aeiou";
        return VOWEL.indexOf(chr) != -1;
    }

    public static int countVowel(String string) {
        int count = 0;
        for (int index = 0; index < string.length(); index++)
            if (isVowel(string.charAt(index)))
                count++;
        return count;
    }

    public static boolean isDigits(char chr) {
        return 48 <= (int) chr && (int) chr < 58;

    }

    public static int countDigits(String string) {
        int count = 0;
        for (int index = 0; index < string.length(); index++)
            if (isDigits(string.charAt(index)))
                count++;
        return count;
    }

    public static double percentageVowel(String string) {
        return 100.0 * countVowel(string) / string.length();
    }

    public static double percentageVowel(String string, int vowel) {
        return 100.0 * vowel / string.length();
    }

    public static double percentageDigits(String string) {
        return 100.0 * countDigits(string) / string.length();
    }

    public static double percentageDigits(String string, int digits) {
        return 100.0 * digits / string.length();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String string = input.next().toLowerCase();
        input.close();

        int vowels = countVowel(string);
        int digits = countDigits(string);

        System.out.printf("Number of vowel: %d (%.2f%%)\n", vowels,
                percentageVowel(string, vowels));
        System.out.printf("Number of digit: %d (%.2f%%)\n", digits,
                percentageDigits(string, digits));

    }
}
