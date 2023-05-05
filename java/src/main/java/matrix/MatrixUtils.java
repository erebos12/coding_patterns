package matrix;

public class MatrixUtils {

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                String msg = "[%s][%s]=%s".formatted(i, j, matrix[i][j]);
                System.out.println(msg);
            }
        }
    }
}
