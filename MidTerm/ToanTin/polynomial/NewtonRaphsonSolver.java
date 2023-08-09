package oop.polynomial;

import java.util.Random;

public class NewtonRaphsonSolver implements RootSolver {
    private double tolerance;
    private int maxIterations;

    /**
     * Khởi tạo giá trị các tham số.
     * @param tolerance
     * @param maxIterations
     */
    public NewtonRaphsonSolver(double tolerance, int maxIterations) {
        this.tolerance = tolerance;
        this.maxIterations = maxIterations;
    }

    /**
     * Tìm nghiệm của đa thức sử dụng phương pháp Newton-Raphson.
     * @param polynomial
     * @param lower
     * @param upper
     * @return nghiệm của đa thức.
     */
    @Override
    public double solve(Polynomial polynomial, double lower, double upper) {
        int maxIterations = 100; // Số lần lặp tối đa
        Polynomial derivative = polynomial.derivative();
        Random random = new Random();

        double x = random.nextInt((int) upper);
        int iterations = 0;
        while (Math.abs(polynomial.evaluate(x)) > tolerance && iterations < maxIterations) {
            double delta = polynomial.evaluate(x) / derivative.evaluate(x);
            x = x - delta;
            iterations++;
        }

        return x;
    }
}
