package exercisesonagorithms;

public class InsertionSort {
    public static void main(String[] args) {
        int[] numbers = {10,9,8,7,6,5,4,3,2,1};
        insertionSort( numbers);
        print(numbers);
    }
    public static void print(int[] numbers){
        for (int number: numbers)
            System.out.print(number + " ");
    }
    public static void insertionSort(int[] numbers){
        for (int i = 1; i < numbers.length; ++i) {
            int key = numbers[i];
            int j = i - 1;
            while (j >= 0 && numbers[j] > key) {
                numbers[j + 1] = numbers[j];
                j--;
            }
            numbers[j + 1] = key;
        }
    }

}
