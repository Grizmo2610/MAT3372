package exercisesonrecursion;

public class GCD {
    public static void main(String[] args) {
        System.out.println(gcd(12,25));
    }

    public static int gcd(int a, int b){
        if (a != b)
            return (a < b) ? gcd(a, b - a): gcd(a - b, b);
        return a;
    }
}
