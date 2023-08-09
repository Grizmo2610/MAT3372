package oop.principles.abstraction;

import oop.polynomial.AbstractPolynomial;
import oop.polynomial.Polynomial;

public class ArrayPolynomial extends AbstractPolynomial {
    private static final int DEFAULT_CAPACITY = 2;
    private double[] coefficents;
    private int size;

    /**
     * Khởi tạo dữ liệu mặc định.
     */
    public ArrayPolynomial() {
        coefficents = new double[DEFAULT_CAPACITY];
        size = 0;
    }

    /**
     * Lấy hệ số của đa thức tại phần tử index
     * @return hệ số tại phần tử index.
     */
    @Override
    public double coefficient(int index) {
        return coefficents[index];
    }

    /**
     * Lấy mảng các hệ số của đa thức.
     * @return mảng các hệ số của đa thức.
     */
    @Override
    public double[] coefficients() {
        return coefficents;
    }

    /**
     * Thêm một phần tử có hệ số coefficient vào cuối đa thức.
     * @param coefficient
     * @return đa thức hiện tại.
     */
    public ArrayPolynomial append(double coefficient) {
        if (size >= coefficients().length)
            enlarge();
        this.coefficents[size] = coefficient;
        size++;
        return this;
    }

    public void check(int index, int limit){
        if (index < 0 || index >= limit){
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    /**
     * Thêm một phần tử có hệ số coefficient vào vị trí index.
     * @param coefficient
     * @param index
     * @return đa thức hiện tại.
     */
    public ArrayPolynomial insert(double coefficient, int index) {
        if (size >= coefficients().length)
            enlarge();

        check(index, size);
        for (int i = size - 1; i > index; i-- ){
            coefficents[i] = coefficents[i-1];
        }
        this.coefficents[index] = coefficient;
        return this;
    }

    /**
     * Thay đổi hệ số của đa thức tại phần tử index.
     * @param coefficient
     * @param index
     * @return đa thức hiện tại.
     */
    public ArrayPolynomial set(double coefficient, int index) {
        check(index, size);
        coefficents[index] = coefficient;
        return this;
    }

    /**
     * Lấy bậc của đa thức.
     * @return bậc của đa thức.
     */
    @Override
    public int degree() {
        return size - 1;
    }

    /**
     * Tính giá trị của đa thức khi biết giá trị của x.
     * @return giá trị của đa thức.
     */
    @Override
    public double evaluate(double x) {
        double result = 0;
        for (int i = 0 ; i < size; i++){
            result += coefficents[i] * Math.pow(x, i);
        }
        return result;
    }

    /**
     * Lấy đạo hàm của đa thức.
     * @return Đa thức kiểu ArrayPolynomial là đa thức đạo hàm của đa thức hiện tại.
     */
    @Override
    public oop.polynomial.Polynomial derivative() {
        Polynomial result = new ArrayPolynomial();
        for (int i = 1; i < size; i++)
            ((ArrayPolynomial) result).append(i * coefficents[i]);
        return result;
    }

    /**
     * Cộng một đa thức khác vào đa thức hiện tại.
     * @param another
     * @return đa thức hiện tại.
     */
    public ArrayPolynomial plus(ArrayPolynomial another) {
        for (int i = 0; i < Math.min(size, another.degree() + 1); i++){
            coefficents[i] += another.coefficient(i);
        }
        if (another.degree() + 1 > size){
            for (int i = size - 1; i < another.degree() + 1; i++){
                append(another.coefficient(i));
            }
        }
        return this;
    }

    /**
     * Trừ đa thức hiện tại với đa thức khác.
     * @param another
     * @return đa thức hiện tại.
     */
    public ArrayPolynomial minus(ArrayPolynomial another) {
        for (int i = 0; i < Math.min(size, another.degree() + 1); i++){
            coefficents[i] -= another.coefficient(i);
        }
        if (another.degree() + 1 > size){
            for (int i = size - 1; i < another.degree() + 1; i++){
                append(-another.coefficient(i));
            }
        }
        return this;
    }

    /**
     * Nhân đa thức hiện tại với đa thức khác.
     * @param another
     * @return đa thức hiện tại.
     */
    public ArrayPolynomial multiply(ArrayPolynomial another) {
        double[] result = new double[size + another.degree()];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < another.degree() + 1; j++) {
                result[i + j] += coefficents[i] * another.coefficient(j);
            }
        }
        coefficents = result;
        return this;
    }

    /**
     * Thêm kích thước để lưu đa thức khi cần thiết.
     */
    private void enlarge() {
        double[] temp = new double[coefficents.length * 2];
        System.arraycopy(coefficents,0,temp,0,coefficents.length);
        coefficents = temp;
    }
}
