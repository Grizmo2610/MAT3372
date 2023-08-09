package exercisesonagorithms;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner       input   = new Scanner(System.in);
        int[] numbers = {1,2,3,4,5,6,7,8,9,10};
        System.out.print("Enter a key: ");
        int key = input.nextInt();
        input.close();
        if (binarySearch(numbers, key))
            System.out.println(key + " is in array");
        else
            System.out.println(key + " is not in array");
    }

    public static int binarySearchUsingLoop(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }

    public static boolean binarySearch(int[] numbers, int key){
        return binarySearch(numbers, key,0, numbers.length);
    }

    public static boolean binarySearch(int[] numbers, int key, int left, int right){
        int mid = (right + left) / 2;
        if (numbers[mid] == key)
            return true;
        else if (left >= right - 1)
            return numbers[left] == key;
        else if (numbers[mid] < key)
            return binarySearch(numbers, key, mid, right);
        return binarySearch(numbers, key, left, mid - 1);
    }f
}
