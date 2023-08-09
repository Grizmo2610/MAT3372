package hus.oop.integration;

import java.util.ArrayList;
import java.util.List;

public class ListPolynomial extends AbstractPolynomial {
    private List<Double> coefficients;

    /**
     * Khởi tạo dữ liệu mặc định.
     */
    public ListPolynomial() {
        coefficients = new ArrayList<>();
    }

    /**
     * Lấy hệ số của đa thức tại vị trí index.
     * @return
     */
    @Override
    public double coefficient(int index) {
        return coefficients.get(index);
    }

    /**
     * Lấy các hệ số của đa thức.
     * @return
     */
    @Override
    public double[] coefficients() {
        double[] temp = new double[coefficients.size()];
        for (int i = 0; i < temp.length; i++){
            temp[i] = coefficients.get(i);
        }
        return temp;
    }

    /**
     * Thêm phần tử có hệ số coefficient vào cuối đa thức hiện tại.
     * @param coefficient
     * @return đa thức hiện tại.
     */
    public ListPolynomial append(double coefficient) {
        this.coefficients.add(coefficient);
        return this;
    }

    /**
     * Thêm phần tử có hệ số coefficient vào vị trí index.
     * @param coefficient
     * @param index
     * @return đa thức hiện tại.
     */
    public ListPolynomial insert(double coefficient, int index) {
        this.coefficients.add(index, coefficient);
        return this;
    }

    /**
     * Sửa hệ số của phần tử index là coefficient.
     * @param coefficient
     * @param index
     * @return đa thức hiện tại.
     */
    public ListPolynomial set(double coefficient, int index) {
        this.coefficients.set(index, coefficient);
        return this;
    }

    /**
     * Lấy ra bậc của đa thức.
     * @return
     */
    @Override
    public int degree() {
        return coefficients.size() - 1;
    }

    /**
     * Tính giá trị của đa thức khi biết giá trị của x.
     * @return
     */
    @Override
    public double evaluate(double x) {
        double result = 0;
        for (int i = 0; i < coefficients.size(); i++){
            result += coefficients.get(i) * Math.pow(x, i);
        }
        return result;
    }

    /**
     * Lấy đạo hàm của đa thức.
     * @return Đa thức kiểu ListPolynomial là đa thức đạo hàm của đa thức ban đầu.
     */
    @Override
    public Polynomial derivative() {
        Polynomial result = new ListPolynomial();
        for (int i = 1; i < coefficients.size(); i++)
            ((ListPolynomial) result).append(i * coefficients.get(i));
        return result;
    }

    /**
     * Cộng đa thức hiện tại với đa thức khác.
     * @param another
     * @return đa thức hiện tại.
     */
    public ListPolynomial plus(ListPolynomial another) {
        for (int i = 0; i < Math.min(coefficients.size(), another.degree() + 1); i++){
            coefficients.set(i, this.coefficients.get(i) + another.coefficient(i));
        }
        if (another.degree() + 1 > coefficients.size()){
            for (int i = coefficients.size() - 1; i < another.degree() + 1; i++){
                coefficients.add(another.coefficient(i));
            }
        }
        return this;
    }

    /**
     * Trừ đa thức hiện tại với đa thức khác.
     * @param another
     * @return đa thức hiện tại.
     */
    public ListPolynomial minus(ListPolynomial another) {
        for (int i = 0; i < Math.min(coefficients.size(), another.degree() + 1); i++){
            coefficients.set(i, this.coefficients.get(i) - another.coefficient(i));
        }
        if (another.degree() + 1 > coefficients.size()){
            for (int i = coefficients.size() - 1; i < another.degree() + 1; i++){
                coefficients.add(- another.coefficient(i));
            }
        }
        return this;
    }

    /**
     * Nhân đa thức hiện tại với đa thức khác.
     * @param another
     * @return đa thức hiện tại.
     */
    public ListPolynomial multiply(ListPolynomial another) {
        double[] result = new double[this.coefficients.size()+ another.degree()];
        for (int i = 0; i < this.coefficients.size(); i++) {
            for (int j = 0; j < another.degree() + 1; j++) {
                result[i + j] += this.coefficients.get(i) * another.coefficient(j);
            }
        }
        coefficients.clear();
        for (int i = 0; i < result.length; i++){
            this.coefficients.add(result[i]);
        }
        return this;
    }
}
