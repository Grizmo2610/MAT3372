package hus.oop.integration;

public class SimpsonRule implements Integrator {
    private double precision;
    private int maxIterations;

    public SimpsonRule(double precision, int maxIterations) {
        this.precision = precision;
        this.maxIterations = maxIterations;
    }

    /**
     * Phương thức tính xấp xỉ giá trị tích phân. Giá trị xấp xỉ được chấp nhận nếu phép tính đạt độ chính xác đã cho,
     * hoặc có số vòng vượt quá ngưỡng quy định.
     * Độ chính xác được xác định như sau, chọn n0 tùy ý, sau đó tính I_n với n = n0, 2n0, 4n0, ...
     * Việc tính toán dừng lại khi |I_2n - In|/3 < eps (precision), hoặc số lần chia đôi vượt quá ngưỡng quy định (maxIterations).
     * @param poly
     * @param lower
     * @param upper
     * @return
     */
    @Override
    public double integrate(Polynomial poly, double lower, double upper) {
        double h = (upper - lower) / maxIterations; // Chiều rộng mỗi phân đoạn
        double sum = poly.evaluate(lower) + poly.evaluate(upper); // Tổng giá trị đầu và cuối

        for (int i = 1; i < maxIterations; i += 2) {
            double x = lower + i * h;
            sum += 4 * poly.evaluate(x); // Cộng giá trị nhân 4
        }

        for (int i = 2; i < maxIterations - 1; i += 2) {
            double x = lower + i * h;
            sum += 2 * poly.evaluate(x); // Cộng giá trị nhân 2
        }

        return (h / 3) * sum; // Tính giá trị tích phân
    }

    /**
     * Phương thức tính xấp xỉ giá trị tích phân với numOfSubIntervals (số chẵn) khoảng phân hoạch đều.
     * @param poly
     * @param lower
     * @param upper
     * @param numOfSubIntervals
     * @return giá trị xấp xỉ giá trị tích phân.
     */
    private double integrate(Polynomial poly, double lower, double upper, int numOfSubIntervals) {

        double h = (upper - lower) / numOfSubIntervals; // Chiều rộng mỗi phân đoạn
        double sum = poly.evaluate(lower) + poly.evaluate(upper); // Tổng giá trị đầu và cuối

        for (int i = 1; i < numOfSubIntervals; i += 2) {
            double x = lower + i * h;
            sum += 4 * poly.evaluate(x); // Cộng giá trị nhân 4
        }

        for (int i = 2; i < numOfSubIntervals - 1; i += 2) {
            double x = lower + i * h;
            sum += 2 * poly.evaluate(x); // Cộng giá trị nhân 2
        }

        return (h / 3) * sum; // Tính giá trị tích phân
    }
}
