package GettingStarted;
import java.util.Scanner;
public class CheckOddEven {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        System.out.println(number % 2 == 0 ? "Odd" : "Even" + " Number");
        input.close();
    }
}