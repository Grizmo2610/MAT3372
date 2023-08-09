package exercisesonstringandaharoperations;

import java.util.Scanner;

public class Oct2Dec {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an octal string: ");
        int octal = input.nextInt();
        input.close();

        int demical = getDemical(octal);
        if (demical != -1)
            System.out.printf("The equivalent demical number for octal \"%d\" is: %d", octal, demical);
        else
            System.out.println("Error: invalid octal string\" " + octal +"\"");
    }
    public static int getDemical(int octal){
        String octalString = Integer.toString(octal);
        int val = (int) octalString.charAt(0) - 48;

        for (int i = 1; i < octalString.length(); i++) {
            int octalValue = (int) octalString.charAt(i) - 48;
            if (octalValue < 0 || octalValue > 7)
                return -1;

            val = val * 8 + octalValue;
        }
        return val;
    }
}
