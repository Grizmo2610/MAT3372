package exercisesonmethod;

import java.util.Scanner;

public class GradesHistogram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of student: ");
        int numsGrades = input.nextInt();
        int[] student = inputArray(numsGrades, input);
        int[] grades = countGrades(student);
        horizontal(grades);
        System.out.println();
        histograms(grades);
    }

    public static int[] inputArray(int size, Scanner input) {
        int[] numbers = new int[size];
        System.out.print("Enter all grades of student (separate by space): ");
        for (int i = 0; i < size; i++)
            numbers[i] = input.nextInt();
        return numbers;
    }

    public static int[] countGrades(int[] grades) {
        int[] numGrades = new int[10];
        for (int i = 0; i < grades.length; i++) {
            int exp = 1;
            while ((grades[i] < 10 * (exp - 1) || grades[i] >= 10 * exp) && exp < 10)
                exp += 1;

            numGrades[exp - 1] += 1;
        }
        return numGrades;
    }

    public static void printStar(int num) {
        for (int i = 0; i < num; i++)
            System.out.print("*");
        System.out.println();
    }

    public static void horizontal(int[] staticsGrades) {
        for (int i = 0; i < 10; i++) {
            if (i != 9)
                System.out.printf("%2d - %3d: ", i * 10, i * 10 + 9);
            else
                System.out.printf("%2d - %3d: ", i * 10, i * 10 + 10);
            printStar(staticsGrades[i]);
        }
    }

    public static int getMaxGrade(int[] grades) {
        if (grades == null || grades.length == 0)
            return 0;
        int max = grades[0];
        for (int i = 1; i < grades.length; i++)
            if (grades[i] > max)
                max = grades[i];
        return max;
    }

    public static void histograms(int[] grades) {

        int maxGrade = getMaxGrade(grades);
        for (int i = maxGrade; i > 0; i--) {

            for (int j = 0; j < grades.length; j++) {
                if (grades[j] >= i) {
                    System.out.print("  *   ");
                } else {
                    System.out.print("      ");
                }
            }
            System.out.println();
        }

        for (int i = 0; i < grades.length; i++) {
            if (i == 9)
                System.out.printf("%2d-%2d ", i * 10, i * 10 + 10);
            else
                System.out.printf("%2d-%2d ", i * 10, i * 10 + 9);
        }
    }
}
