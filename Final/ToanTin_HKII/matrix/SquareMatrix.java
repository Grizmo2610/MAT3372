package hus.oop.matrix;

import java.util.Arrays;
import java.util.Random;

public class SquareMatrix {
    private int[][] data;

    /**
     * Hàm dựng, khởi tạo một ma trận có các phần tử được sinh ngẫu nhiên trong khoảng [1, 100]
     * @param size
     */
    public SquareMatrix(int size) {
        initRandom(size);
    }

    /**
     * Phương thức khởi tạo ma trận, các phần tử của ma trận được sinh ngẫu nhiên trong khoảng [1, 100]
     * @param size
     */
    private void initRandom(int size) {
        data = new int[size][size];
        Random random = new Random();
        for (int i = 0; i < size;i++){
            for (int j = 0; j < size;j++){
                data[i][j] = random.nextInt(100) + 1;
            }
        }
    }

    /**
     * Phương thức lấy ra các phần tử trên đường chéo chính của ma trận.
     * @return đường chéo chính của ma trận.
     */
    public int[] principalDiagonal() {
        int[] result = new int[data.length];
        for (int i = 0; i < data.length; i++){
            result[i] = data[i][i];
        }
        return  result;
    }

    /**
     * Phương thức lấy ra các phần tử trên đường chéo phụ của ma trận.
     * @return đường chéo phụ của ma trận.
     */
    public int[] secondaryDiagonal() {
        int[] result = new int[data.length];
        for (int i = 0, j = data.length - 1; i < data.length; i++,j--){
            result[i] = data[j][i];
        }
        return  result;
    }

    private boolean isPrime(int number){
        if (number < 2){
            return false;
        } else if(number < 4){
            return true;
        }
        for (int i = 2; i <= Math.sqrt(number); i++){
            if (number % i == 0){
                return false;
            }
        }
        return true;
    }

    /**
     * Phương thức lấy ra các số là số nguyên tố trong ma trận.
     * @return các số nguyên tố trong ma trận.
     */
    public int[] primes() {
        int count = 0;
        for (int[] datum : data) {
            for (int j = 0; j < data[0].length; j++) {
                if (isPrime(datum[j])){
                    count++;
                }
            }
        }

        int[] result = new int[count];
        int index = 0;
        for (int[] datum : data) {
            for (int j = 0; j < data[0].length; j++) {
                if (isPrime(datum[j])){
                    result[index] = datum[j];
                    index++;
                }
            }
        }return result;
    }

    /**
     * Phương thức sắp xếp các phần tử của ma trận theo thứ tự tăng dần.
     * @return ma trận có các phần tử là phần tử của ma trận ban đầu được sắp xếp theo thứ tự tăng dần.
     * Các phần tử được sắp xếp theo thứ tự từ trái sang phải ở mỗi hàng, và từ trên xuống dưới.
     */
    public SquareMatrix getSortedMatrix() {
        SquareMatrix result = copy();
        int[][] matrix = result.data;

        int size = data.length;

        int[] flattenedMatrix = new int[size * size];
        int index = 0;

        // Flatten the matrix into a 1D array
        for (int[] row : matrix) {
            for (int num : row) {
                flattenedMatrix[index++] = num;
            }
        }

        // Sort the flattened array
        Arrays.sort(flattenedMatrix);
        index = 0;

        // Convert the sorted 1D array back to the matrix
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = flattenedMatrix[index++];
            }
        }

        result.data = matrix;
        return result;
    }

    /**
     * Lấy giá trị phần tử ở vị trí (row, col).
     * @param row
     * @param col
     * @return
     */
    public int get(int row, int col) {
        return data[row][col];
    }

    /**
     * Sửa giá trị phần tử ở vị trí (row, col) thành value.
     * @param row
     * @param col
     * @param value
     */
    public void set(int row, int col, int value) {
        data[row][col] = value;
    }

    private SquareMatrix copy(){
        SquareMatrix result = new SquareMatrix(data.length);
        int[][] target = new int[data.length][data.length];
        for (int i = 0; i < data.length; i++){
            System.arraycopy(data[i], 0, target[i], 0, data[0].length);
        }
        result.data = target;
        return result;
    }

    /**
     * Phương thức cộng ma trận hiện tại với một ma trận khác.
     * @param that
     * @return ma trận mới là ma trận tổng của 2 ma trận.
     */
    public SquareMatrix add(SquareMatrix that) {
        if (this.data.length != that.data.length || this.data[0].length != that.data[0].length){
            throw new ArrayIndexOutOfBoundsException();
        }
        SquareMatrix result = copy();
        for (int i = 0; i < data.length;i++){
            for (int j =0; j < data[0].length;j++){
               result.set(i, j,result.get(i,j) + that.get(i,j));
            }
        }return result;
    }

    /**
     * Phương thức trừ ma trận hiện tại cho một ma trận khác.
     * @param that
     * @return ma trận mới là ma trận hiệu của ma trận hiện tại và ma trận truyền vào.
     */
    public SquareMatrix minus(SquareMatrix that) {
        if (this.data.length != that.data.length || this.data[0].length != that.data[0].length){
            throw new ArrayIndexOutOfBoundsException();
        }
        SquareMatrix result = copy();
        for (int i = 0; i < data.length;i++){
            for (int j =0; j < data[0].length;j++){
                result.set(i,j, result.get(i,j) - that.get(i,j));
            }
        }return result;
    }

    /**
     * Phương thức nhân ma trận hiện tại với một ma trận khác.
     * @param that
     * @return ma trận mới là ma trận nhân của ma trận hiện tại với ma trận truyền vào.
     */
    public SquareMatrix multiply(SquareMatrix that) {
        if (data.length != that.data.length){
            throw new ArrayStoreException();
        }

        SquareMatrix result = copy();

        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < that.data.length; j++) {
                for (int k = 0; k < that.data.length; k++) {
                    result.set(i,j, result.get(i,j) + (result.get(i,k) * that.data[k][j]));
                }
            }
        }
        return result;
    }

    /**
     * Phương thức nhân ma trận với một số vô hướng.
     * @param value
     * @return ma trận mới là ma trận hiện tại được nhân với một số vô hướng.
     */
    public SquareMatrix scaled(int value) {
        SquareMatrix result = copy();
        for (int i = 0; i < data.length;i++){
            for (int j = 0; j < data[0].length; j++){
                result.set(i, j,result.get(i,j) * value);
            }
        }
        return result;
    }

    /**
     * Phương thức lấy ma trận chuyển vị.
     * @return ma trận mới là ma trận chuyển vị của ma trận hiện tại.
     */
    public SquareMatrix transpose() {
        SquareMatrix result = copy();
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length; j++) {
                result.set(j, i, this.data[i][j]);
            }
        }
        return result;
    }

    /**
     * Mô tả ma trận theo định dạng biểu diễn ma trận, ví dụ
     *   1 2 3
     *   4 5 6
     *   7 8 9
     * @return một chuỗi mô tả ma trận.
     */
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < data.length; i++){
            for (int j = 0; j < data[0].length; j++){
                result.append(data[i][j]);
                if (j < data[0].length - 1){
                    result.append(" ");
                }
            }
            if (i < data.length - 1){
                result.append("\n");
            }
        }
        return result.toString();
    }
}
