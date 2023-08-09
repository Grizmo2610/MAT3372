package collections.polynomials;

public interface Poly {
    public double[] coefficients();
    public double coefficient(int base);
    public int degree();
    public Poly derivative();
}
