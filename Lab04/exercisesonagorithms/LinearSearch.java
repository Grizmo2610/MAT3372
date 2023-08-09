package exercisesonagorithms;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numbers = {1,2,3,4,5,6,7,8,9};
        System.out.print("Enter a key: ");
        int key = input.nextInt();
        if (search(numbers, key))
            System.out.printf("Index of %d in array is: %d", key, searchIndex(numbers, key));
        else
            System.out.println(key + " is not in array");
        input.close();
    }
    public static boolean search(int[] numbers, int key){
        for (int number: numbers)
            if (number == key)
                return true;
        return false;
    }
    public static int searchIndex(int[] numbers, int key){
        for (int index = 0; index < numbers.length; index++)
            if (numbers[index] == key)
                return index;
        return -1;
    }
}

