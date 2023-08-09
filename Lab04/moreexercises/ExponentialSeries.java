package moreexercises;

public class ExponentialSeries {
    public static void main(String[] args) {
        System.out.println(specialSeries(0.5, 3));
    }

    // numberator[i] = x[i-1] * x * x * (number + 2)
    public static double specialSeries( double x , int numTerms){
        double sum = x, numerator = x * x * x, denominator = 2 * 3;
        double term = numerator / denominator;
        for (double i = 1; i < numTerms; i++) {
            sum += term;
            numerator *= x * x * (2 * i - 1);
            denominator *= (2 * i) * (2 * i + 1);
            term = numerator / denominator;
        }
        return sum;
    }
}
