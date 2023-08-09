package moreexercises;

public class Matrices {
    public static void main(String[] args) {
        int[][] matrix1 = {{1,2,3},{4,5,6},{7,8,9}};
        System.out.println("First Matrix: ");
        print(matrix1);
        int[][] matrix2 = {{2,1,3},{9,7,8},{6,4,5}};
        System.out.println("Second Matrix: ");
        print(matrix2);

        System.out.println("Add 2 matrix");
        print(add(matrix1,matrix2));
        System.out.println("Subtract 2 matrix");
        print(subtract(matrix1,matrix2));
        System.out.println("Multiply 2 matrix");
        print(multiply(matrix1,matrix2));
    }
    public static void print(int[][] matrix){
        if (matrix == null){
            System.out.println("NULL!");
            return;
        }

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                System.out.print(matrix[row][col]);
                if (col != matrix[0].length - 1)
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void print(double[][] matrix){
        if (matrix == null){
            System.out.println("NULL!");
            return;
        }
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                System.out.print(matrix[row][col]);
                if (col != matrix[0].length - 1)
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static boolean haveSameDimension(int[][] matrix1, int[][] matrix2){
        return matrix1[0].length == matrix2[0].length && matrix1.length == matrix2.length;
    }

    public static boolean haveSameDimension(double[][] matrix1, double[][] matrix2){
        return matrix1[0].length == matrix2[0].length && matrix1.length == matrix2.length;
    }

    public  static int[][] add(int[][] matrix1, int[][] matrix2){
        if (haveSameDimension(matrix1,matrix2)){
            int[][] addMatrix = new int[matrix1.length][matrix1[0].length];
            for (int i = 0; i < matrix1.length; i++)
                for (int j = 0; j < matrix1[0].length; j++)
                    addMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            return addMatrix;
        }
        System.out.println("Can n't add two matrix!");
        return null;
    }

    public  static double[][] add(double[][] matrix1, double[][] matrix2){
        if (haveSameDimension(matrix1,matrix2)){
            double[][] addMatrix = new double[matrix1.length][matrix1[0].length];
            for (int i = 0; i < matrix1.length; i++)
                for (int j = 0; j < matrix1[0].length; j++)
                    addMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
            return addMatrix;
        }
        System.out.println("Can n't add two matrix!");
        return null;
    }
    public  static int[][] subtract(int[][] matrix1, int[][] matrix2){
        if (haveSameDimension(matrix1,matrix2)){
            int[][] addMatrix = new int[matrix1.length][matrix1[0].length];
            for (int i = 0; i < matrix1.length; i++)
                for (int j = 0; j < matrix1[0].length; j++)
                    addMatrix[i][j] = matrix1[i][j] - matrix2[i][j];
            return addMatrix;
        }
        System.out.println("Can n't add two matrix!");
        return null;
    }

    public  static double[][] subtract(double[][] matrix1, double[][] matrix2){
        if (haveSameDimension(matrix1,matrix2)){
            double[][] addMatrix = new double[matrix1.length][matrix1[0].length];
            for (int i = 0; i < matrix1.length; i++)
                for (int j = 0; j < matrix1[0].length; j++)
                    addMatrix[i][j] = matrix1[i][j] - matrix2[i][j];
            return addMatrix;
        }
        System.out.println("Can n't add two matrix!");
        return null;
    }

    public static int[][] multiply(int[][] matrix1, int[][] matrix2){
        if (matrix1.length != matrix2[0].length){
            System.out.println("Can n't multiply two matrix!");
            return null;
        }

        int[][] mulMatrix = new int[matrix1.length][matrix2[0].length];
        for (int i = 0; i < matrix1[0].length; i++)
            for (int j = 0; j < matrix2[0].length; j++)
                for (int k = 0; k < matrix1[0].length; k++)
                    mulMatrix[i][j] += matrix1[i][k] * matrix2[k][j];
        return mulMatrix;
    }

    public static double[][] multiply(double[][] matrix1, double[][] matrix2){
        if (matrix1.length != matrix2[0].length){
            System.out.println("Cann't multiply two matrix!");
            return null;
        }

        double[][] mulMatrix = new double[matrix1.length][matrix2[0].length];
        for (int i = 0; i < matrix1[0].length; i++)
            for (int j = 0; j < matrix2[0].length; j++)
                for (int k = 0; k < matrix1[0].length; k++)
                    mulMatrix[i][j] += matrix1[i][k] * matrix2[k][j];
        return mulMatrix;
    }

}
