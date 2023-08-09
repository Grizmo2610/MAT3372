package oop.polynomial;

public class BisectionSolver implements RootSolver {
    private double tolerance;
    private int maxIterations;

    /**
     * Khởi tạo giá trị các tham số.
     * @param tolerance
     * @param maxIterations
     */
    public BisectionSolver(double tolerance, int maxIterations) {
        this.tolerance = tolerance;
        this.maxIterations = maxIterations;
    }

    /**
     * Tìm nghiệm của đa thức theo phương pháp chia đôi (Bisection)
     * @param polynomial
     * @param lower
     * @param upper
     * @return
     */
    @Override
    public double solve(Polynomial polynomial, double lower, double upper) {
        double mid = (lower + upper) / 2;

        int iterations = 0;
        while (Math.abs(upper - lower) > this.tolerance && iterations < this.maxIterations) {
            if (polynomial.evaluate(lower) * polynomial.evaluate(mid) < 0) {
                upper = mid;
            } else if (polynomial.evaluate(upper) * polynomial.evaluate(mid) < 0) {
                lower = mid;
            } else {
                return mid;
            }
            mid = (lower + upper) / 2;
            iterations++;
        }

        return mid;
    }
}
