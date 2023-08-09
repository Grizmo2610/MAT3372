package numbertheory;

import java.util.Scanner;

public class PerfectAndDeficientNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter upper bound : ");
        int bound = input.nextInt();
        int[][] count = count(bound);
        int[] perfect = count[0], normal = count[1];

        System.out.println("These numbers are perfect: ");
        print(perfect);
        System.out.printf("%d perfect numbers found(%.2f%%)\n", perfect.length,
                          100.0 * perfect.length / bound);

        System.out.println("These numbers are are neither deficient nor perfect: ");
        print(normal);
        System.out.printf("%d numbers found(%.2f%%)", normal.length,
                          100.0 * normal.length / bound);
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

    public static int sumFactors(int number){
        int sum = 0;
        for (int i = 1; i <= number / 2; i++)
            if (number % i == 0)
                sum += i;
        return sum;
    }
    public static boolean isPerfect(int number ){
        return sumFactors(number) == number;
    }

    public static boolean isDeficient(int number ){
        return sumFactors(number) < number;
    }

    public static int[][] count(int bound){
        int[] perfects = {};
        int[] normals = {};
        for (int number = 1; number <= bound; number++){
            if (isPerfect(number))
                perfects = append(perfects, number);
            else if (!isDeficient(number))
                normals = append(normals,number);
        }
        return new int[][]{ perfects, normals};
    }
}
