package numbertheory;

public class GreatestCommonDivisor {
    public static void main(String[] args) {
        System.out.println(gcd(16,12));
    }

    public static int gcd(int a, int b){
        a = Math.abs(a);
        b = Math.abs(b);

        if (a == b )
            return a;
        else if (a < b)
            return gcd(a, b - a);
        return gcd(a - b, b);

    }
}
