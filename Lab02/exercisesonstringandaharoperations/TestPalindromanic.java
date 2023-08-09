package exercisesonstringandaharoperations;

import java.util.Scanner;

public class TestPalindromanic {
    public static boolean word(String text) {
        for (int i = 0, j = text.length() - 1; i < j; i++, j--) {
            if (text.charAt(i) != text.charAt(j))
                return false;
        }
        return true;
    }

    public static boolean phrase(String phrase) {
        for (int i = 0, j = phrase.length() - 1; i < j; i++, j--) {
            char left = phrase.charAt(i);
            char right = phrase.charAt(j);
            while ((65 < left || left > 90) && i < j)
                i++;
            while ((65 < right || right > 90) && i > j)
                j--;
            if (left != right)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = input.nextLine().toLowerCase();
        System.out.print("Enter a phrase: ");
        String phrase = input.nextLine().toLowerCase();
        input.close();

        System.out.println("Word is palindromic: " + word(word));
        System.out.println("Phrase is palindromic: " + phrase(phrase));
    }
}
