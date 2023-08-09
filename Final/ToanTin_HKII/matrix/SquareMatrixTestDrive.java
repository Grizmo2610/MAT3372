package hus.oop.matrix;

import java.util.Random;

public class SquareMatrixTestDrive {
    public static void print(int[] array){
        for (int i = 0 ; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    public static void test(SquareMatrix matrix, int num){
        String index = "";
        if (num == 1){
            index = "First matrix";
        }else {
            index = "Second matrix";
        }

        System.out.println(index + ": ");
        System.out.println(matrix);

        System.out.println("Transpose of " + index +": ");
        System.out.println(matrix.transpose());

        System.out.println("Principal Diagonal of" + index + ": ");
        print(matrix.principalDiagonal());

        System.out.println("Secondary Diagonal of " + index + ": ");
        print(matrix.secondaryDiagonal());

        System.out.println("Primes in " + index +": ");
        print(matrix.primes());

        System.out.println("Sorted " + index +": ");
        System.out.println(matrix.getSortedMatrix());
    }

    public static void main(String[] args) {
        Random random = new Random();
        int size = random.nextInt(10) + 5;

        SquareMatrix first = new SquareMatrix(size);
        SquareMatrix second  = new SquareMatrix(size);

        test(first,1);

        System.out.println();

        test(second,2);

        System.out.println("Test add: ");
        System.out.println(first.add(second));

        System.out.println("Test sub: ");
        System.out.println(first.minus(second));

        System.out.println("Test mul: ");
        System.out.println(first.multiply(second));

        /* TODO
        Tạo ra 2 ma trận có cùng kích thước là một số ngẫu nhiên nằm trong đoạn [5, 10].
        Viết code thực hiện test các chức năng sau của các ma trận:
          - In ra 2 ma trận và 2 ma trận chuyển vị tương ứng.
          - In ra các đường chéo chính và đường chéo phụ của 2 ma trận.
          - In ra ma trận là ma trận tổng của 2 ma trận.
          - In ra ma trận là ma trận là hiệu của ma trận thứ nhất cho ma trận thứ 2.
          - In ra ma trận là ma trận tích của 2 ma trận.
          - In ra các số nguyên tố có trong 2 ma trận.

         Lưu kết quả chạy chương trình trên terminal vào file text và nộp cùng source code chương trình.
         File text kết quả được đặt tên như sau: <TenSinhVien_MaSinhVien_Matrix.txt> (Ví dụ, NguyenVanA_123456_Matrix.txt).
         */
    }
}
