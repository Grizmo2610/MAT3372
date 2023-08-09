package exercisesonagorithms;

public class SelectionSort {
    public static void main(String[] args) {
        int[] numbers = {10,9,8,7,6,5,4,3,2,1};
        selectionSort( numbers);
        print(numbers);
    }
    public static void print(int[] numbers){
        for (int number: numbers)
            System.out.print(number + " ");
    }

    public static int min(int[] numbers, int left){
        int min = left;
        for (int i = left + 1; i < numbers.length; i++)
            if (numbers[i] < numbers[min])
                min = i;
        return min;
    }

    public static void selectionSort(int[] numbers){
        for (int i = 0; i < numbers.length; i++){
            int index = min(numbers, i);
            int temp = numbers[i];
            numbers[i] = numbers[index];
            numbers[index] = temp;
        }
    }
}
