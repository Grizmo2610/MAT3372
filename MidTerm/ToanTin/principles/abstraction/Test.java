package oop.principles.abstraction;

import oop.polynomial.ArrayPolynomial;
import oop.polynomial.Polynomial;

public class Test {
    public static void print(Polynomial polynomial) {
        for (int i = 0; i < polynomial.degree() + 1; i++) {
            System.out.print(polynomial.coefficient(i) + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        /*poymonial có kiểu dữ liệu trừu tượng là Polynomial và có
        kiểu dữ liệu thực tết là Array Polynomial*/
        Polynomial polynomial = new ArrayPolynomial();
        ((ArrayPolynomial) polynomial).append(1);
        ((ArrayPolynomial) polynomial).append(2);
        ((ArrayPolynomial) polynomial).append(3);

        System.out.println("Test: ");
        print(polynomial);

    }
}
