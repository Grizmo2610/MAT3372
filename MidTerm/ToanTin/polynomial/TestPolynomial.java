package oop.polynomial;

public class TestPolynomial {
  public static void main(String[] args) {
    System.out.println("Test Array: ");
    testArrayPolynomial();

    System.out.println("Test List: ");
    testListPolynomial();

    System.out.println("Test RootSolver: ");
    testRootSolver();

    /*
     * TODO
     * 
     * - Chạy demo các hàm test.
     * - Lưu kết quả chạy chương trình vào file text có tên
     * <Ten_MaSinhVien_MyList>.txt
     * (ví dụ, NguyenVanA_123456_MyList.txt)
     * - Nộp kết quả chạy chương trình (file text trên) cùng với các file source
     * code.
     */
  }

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
    /*
     * TODO
     * - Viết chương trình test các chức năng của ListPolynomial (thêm phần tử vào
     * đa thức, xóa phần tử trong đa thức,
     * sửa hệ số tại một phần tử, cộng 2 đa thức, trừ 2 đa thức, nhân 2 đa thức,
     * tính giá trị của đa thức khi biết
     * giá trị của x).
     */
  }

  public static void testRootSolver() {
    Polynomial polynomial = new ArrayPolynomial();
    ((ArrayPolynomial) polynomial).append(2);
    ((ArrayPolynomial) polynomial).append(-3);
    ((ArrayPolynomial) polynomial).append(1);

    PolynomialRootFinding solve = new PolynomialRootFinding(polynomial);
    double tolerance = 1e-16;
    int maxIterations = 100000;

    System.out.print("Polynomial: " + polynomial);

    solve.setRootSolver(new BisectionSolver(tolerance, maxIterations));
    System.out.println("Finding root using Bisection: ");
    System.out.println("Solution of the equation: " + solve.solve(0, 3));
    System.out.println();

    solve.setRootSolver(new NewtonRaphsonSolver(tolerance, maxIterations));
    System.out.println("Finding root using NewtonRaphson: ");
    System.out.println("Solution of the equation: " + solve.solve(0, 3));
    System.out.println();

    solve.setRootSolver(new SecantSolver(tolerance, maxIterations));
    System.out.println("Finding root using Secant: ");
    System.out.println("Solution of the equation: " + solve.solve(0, 3));


    /*
     * TODO
     * 
     * - Tạo đa thức có nghiệm trong khoảng [a, b] nào đó.
     * - Viết chương trình tìm nghiệm của đa thức theo các phương pháp đã cho
     * (Bisection, Newton-Raphson, Secant) sử dụng
     * PolynomialRootFinding. Các phương pháp tìm nghiệm của thể thay đổi ở thời
     * gian chạy chương trình.
     * - In ra phương pháp sử dụng, đa thức, và nghiệm của đa thức.
     */
  }
}
