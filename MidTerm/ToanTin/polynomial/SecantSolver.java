package oop.polynomial;

public class SecantSolver implements RootSolver {
    private double tolerance;
    private int maxIterations;

    /**
     * Khởi tạo giá trị các tham số.
     * @param tolerance
     * @param maxIterations
     */
    public SecantSolver(double tolerance, int maxIterations) {
        this.tolerance = tolerance;
        this.maxIterations = maxIterations;
    }

    /**
     * Tìm nghiệm của đa thức theo phương pháp Secant
     * @param polynomial
     * @param lower
     * @param upper
     * @return nghiệm của đa thức trong khoảng [lower, upper]
     */
    @Override
    public double solve(Polynomial polynomial, double lower, double upper) {
        double x = lower - 5;
        double xPrev = upper + 26;

        int iterations = 0;
        while (Math.abs(polynomial.evaluate(x)) > tolerance && iterations < maxIterations) {
            double delta = (polynomial.evaluate(x) * (x - xPrev)) / (polynomial.evaluate(x) - polynomial.evaluate(xPrev));
            xPrev = x;
            x -= delta;
            iterations++;
        }

        return x;
    }
}
