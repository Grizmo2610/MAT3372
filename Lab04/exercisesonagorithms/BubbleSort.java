package exercisesonagorithms;

public class BubbleSort {
    public static void main(String[] args) {
        int[] numbers = {10,9,8,7,6,5,4,3,2,1};
        bubbleSort(numbers);
        print(numbers);
    }

    public static void print(int[] numbers){
        for (int number: numbers)
            System.out.print(number + " ");
    }

    public static void bubbleSort(int[] numbers){
        for (int i = 0; i < numbers.length; i++) {
            boolean swapped = false;
            for (int j = 0; j < numbers.length - 1; j++)
                if (numbers[j] > numbers[j + 1]){
                    swapped = true;
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            if (!swapped)
                break;
        }
    }
}
