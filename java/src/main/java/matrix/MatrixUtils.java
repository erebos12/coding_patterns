package matrix;

public class MatrixUtils {

    public static void printMatrix(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                String msg = "[%s][%s]=%s".formatted(row, col, matrix[row][col]);
                System.out.println(msg);
            }
        }
    }


}
