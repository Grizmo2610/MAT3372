package exercisesonmethod;

import java.util.Scanner;

public class GradesStatistics {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of student: ");
        int numberStudent = input.nextInt();
        int[] grades = inputGrade(numberStudent, input);
        input.close();

        System.out.print("The grades are: ");
        print(grades);

        System.out.printf("The average is: %.2f\n", average(grades));
        System.out.printf("The median is: %.2f\n", median(grades));
        System.out.println("The minimum is: " + min(grades));
        System.out.println("The maximum is: " + max(grades));
        System.out.printf("The standard deviation is: %.2f", standardDeviation(grades));
    }

    public static int[] inputGrade(int numberStudents, Scanner input) {
        int[] grades = new int[numberStudents];
        for (int student = 0; student < numberStudents; student++) {
            System.out.printf("Enter  the grade for student %d: ", student + 1);
            grades[student] = input.nextInt();
        }
        return grades;
    }

    public static void print(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1)
                System.out.print(", ");
        }
        System.out.println("]");
    }

    public static double median(int[] grades) {
        final int SIZE = grades.length;
        if (SIZE % 2 != 0)
            return 1.0 * grades[SIZE/2];
        return (grades[SIZE/2] + grades[SIZE/2 - 1]) / 2.0;
    }

    public static int sum(int[] grades) {
        if (grades == null || grades.length == 0)
            return 0;
        int sum = grades[0];
        for (int i = 1; i < grades.length; i++)
            sum += grades[i];
        return sum;
    }

    public static double average(int[] grades) {
        return 1.0 * sum(grades) / grades.length;
    }

    public static int min(int[] grades) {
        if (grades == null || grades.length == 0)
            return 0;
        int min = grades[0];
        for (int i = 1; i < grades.length; i++)
            if (grades[i] < min)
                min = grades[i];
        return min;
    }

    public static int max(int[] grades) {
        if (grades == null || grades.length == 0)
            return 0;
        int max = grades[0];
        for (int i = 1; i < grades.length; i++)
            if (grades[i] > max)
                max = grades[i];
        return max;
    }

    public static double standardDeviation(int[] grades) {
        double result = 0;
        double mean = average(grades);
        for (int i = 0; i < grades.length; i++)
            result += grades[i] * grades[i] - mean * mean;

        return Math.sqrt(result / grades.length);
    }
}
