package excercisesonarray;

import java.util.Scanner;

public class GradesStatistics {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numStudents = input.nextInt();
        int[] studentsGrade = inputArray(numStudents, input);
        input.close();

        System.out.printf("The average is: %.2f\n", average(studentsGrade));
        System.out.println("The minimum is: " + min(studentsGrade));
        System.out.println("The maximum is: " + max(studentsGrade));
    }

    public static int[] inputArray(int size, Scanner input) {
        int[] numbers = new int[size];
        for (int student = 1; student <= size; student++) {
            System.out.print("Enter the grade for student " + student + ": ");
            numbers[student - 1] = input.nextInt();
        }
        return numbers;
    }

    public static int sum(int[] studentGrades) {
        int sum = studentGrades[0];
        for (int grade : studentGrades)
            sum += grade;
        return sum;
    }

    public static double average(int[] studentGrade) {
        return 1.0 * sum(studentGrade) / studentGrade.length;
    }

    public static int max(int[] studentGrades) {
        int max = studentGrades[0];
        for (int grade = 1; grade < studentGrades.length; grade++)
            if (studentGrades[grade] > max)
                max = studentGrades[grade];
        return max;
    }

    public static int min(int[] studentGrades) {
        int min = studentGrades[0];
        for (int grade = 1; grade < studentGrades.length; grade++)
            if (studentGrades[grade] < min)
                min = studentGrades[grade];
        return min;
    }
}
