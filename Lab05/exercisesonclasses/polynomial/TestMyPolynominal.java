package exercisesonclasses.polynomial;

public class TestMyPolynominal {
    public static void main(String[] args) {
        MyPolynomial polynomial1 = new MyPolynomial(new double[]{1,2,3,4});
        System.out.println("My polynomialL: " + polynomial1);
        System.out.println("My polynomial at 5 is: " + polynomial1.evaluate(5));
        MyPolynomial polynomial2 = new MyPolynomial(new double[]{2,2,1});
        System.out.println("Right polynomial: " + polynomial2);

        MyPolynomial addPolynomial = polynomial1.add(polynomial2);
        System.out.println("Add polynomial: " + addPolynomial);

        MyPolynomial multiplyPolynomial = polynomial1.multiply(polynomial2);
        System.out.println("Multiply polynomial: " + multiplyPolynomial);
    }
}
