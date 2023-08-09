package exercisesonstringandaharoperations;

import java.util.Scanner;

public class Bin2Dec {
    public static int getDemecal( int binary ) {
        int decimal = 0;
        int n = 0;
        while ( binary != 0 ) {
            int temp = binary % 10;
            if ( temp != 1 && temp != 0 )
                return -1;
            decimal += temp * Math.pow ( 2, n );
            binary = binary / 10;
            n++;
        }
        return decimal;
    }

    public static void main( String[] args ) {
        Scanner input = new Scanner ( System.in );
        System.out.print ( "Enter a binary string: " );
        int binary = input.nextInt ( );
        input.close ( );

        int demical = getDemecal ( binary );
        if ( demical != -1 )
            System.out.printf ( "The equivalent demical number for binary \"%d\" is: %d", binary, demical );
        else
            System.out.println ( "Error: invalid binary string \" " + binary + "\"" );
    }
}
