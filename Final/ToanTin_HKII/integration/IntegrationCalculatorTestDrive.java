package hus.oop.integration;

public class IntegrationCalculatorTestDrive {
    public static void main(String[] args) {
//        System.out.println("Test Array: ");
//        testArrayPolynomial();
//
//        System.out.println("Test List: ");
//        testListPolynomial();
//
//        System.out.println("Test Integration Calculator: ");
//        testIntegrationCalculator();


        ListPolynomial polynomial = new ListPolynomial();
        ListPolynomial polynomial1 = new ListPolynomial();
        polynomial.append(4);
        polynomial.append(-1);
        polynomial1.append(4);
        polynomial1.append(1);
        System.out.println(polynomial.multiply(polynomial.multiply(polynomial1)));
    }
        /*
         TODO
         - Chạy demo các hàm test.
         - Lưu kết quả chạy chương trình vào file text có tên <TenSinhVien_MaSinhVien_Integration>.txt
           (ví dụ, NguyenVanA_123456_Integration.txt)
         - Nộp file kết quả chạy chương trình (file text trên) cùng với các file source code.
         */

    public static void testArrayPolynomial() {
        Polynomial polynomial = new ArrayPolynomial();
        ((ArrayPolynomial) polynomial).append(1);
        ((ArrayPolynomial) polynomial).append(2);
        ((ArrayPolynomial) polynomial).append(3);

        System.out.println("Test add: " + polynomial + "\n");

        ((ArrayPolynomial) polynomial).set(3, 0);
        System.out.println("Test set (1 -> 3): " + polynomial + "\n");

        Polynomial polynomial2 = new ArrayPolynomial();
        ((ArrayPolynomial) polynomial2).append(4);
        ((ArrayPolynomial) polynomial2).append(5);
        ((ArrayPolynomial) polynomial2).append(6);

        ((ArrayPolynomial) polynomial).plus((ArrayPolynomial) polynomial2);
        System.out.println("Test plus: " + polynomial + "\n");

        ((ArrayPolynomial) polynomial).minus((ArrayPolynomial) polynomial2);
        System.out.println("Test minus: " + polynomial + "\n");

        System.out.println("Test evaluate f(2): " + polynomial.evaluate(2) + "\n");

        Polynomial devertive = polynomial.derivative();
        System.out.println("Test derivative: " + devertive + "\n");

        ((ArrayPolynomial) polynomial).multiply((ArrayPolynomial) polynomial2);
        System.out.println("Test multiply: " + polynomial + "\n");
    }

    public static void testListPolynomial() {
        Polynomial polynomial = new ListPolynomial();
        ((ListPolynomial) polynomial).append(1);
        ((ListPolynomial) polynomial).append(2);
        ((ListPolynomial) polynomial).append(3);

        System.out.println("Test add: " + polynomial + "\n");

        ((ListPolynomial) polynomial).set(3, 0);
        System.out.println("Test set (1 -> 3): " + polynomial + "\n");

        Polynomial polynomial2 = new ListPolynomial();
        ((ListPolynomial) polynomial2).append(4);
        ((ListPolynomial) polynomial2).append(5);
        ((ListPolynomial) polynomial2).append(6);

        ((ListPolynomial) polynomial).plus((ListPolynomial) polynomial2);
        System.out.println("Test plus: " + polynomial + "\n");

        ((ListPolynomial) polynomial).minus((ListPolynomial) polynomial2);
        System.out.println("Test minus: " + polynomial + "\n");

        System.out.println("Test evaluate f(2): " + polynomial.evaluate(2) + "\n");

        Polynomial devertive = polynomial.derivative();
        System.out.println("Test derivative: " + devertive + "\n");

        ((ListPolynomial) polynomial).multiply((ListPolynomial) polynomial2);
        System.out.println("Test multiply: " + polynomial + "\n");
    }

    public static void test(Integrator integrator, Polynomial poly, double lower, double upper){
        IntegrationCalculator integrationCalculator = new IntegrationCalculator(integrator,poly);
        System.out.println("Test " + integrator.getClass() +": ");
        System.out.println(integrationCalculator.integrate(lower, upper));
        System.out.println();
    }

    public static void testIntegrationCalculator() {
        Polynomial polynomial = new ListPolynomial();
        ((ListPolynomial) polynomial).append(1);
        ((ListPolynomial) polynomial).append(2);
        ((ListPolynomial) polynomial).append(3);

        System.out.println("Polymonial: " + polynomial);

        System.out.println();

        Integrator midPoint = new MidpointRule(Math.pow(10, -6), 100);
        Integrator simpsonPoint = new SimpsonRule(Math.pow(10, -6), 100);
        Integrator trapezoidRule = new TrapezoidRule(Math.pow(10, -6), 100);

        test(midPoint, polynomial, 1,3);

        test(simpsonPoint, polynomial, 1, 3);

        test(trapezoidRule, polynomial, 1, 3);
        /*
         TODO

         - Tạo một đa thức.
         - Viết demo chương trình tính tích phân xác định của đa thức theo các phương pháp đã cho (MidpointRule, TrapezoidRule, SimpsonRule) sử dụng
           IntegrationCalculator. Các phương pháp tính tích phân có thể thay đổi ở thời gian chạy chương trình.
         - In ra thông tin phương pháp sử dụng, đa thức, và giá trị tích phân của đa thức.
         */
    }
}
