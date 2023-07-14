package matrix;

public class MatrixUtils {

    public static void print(final int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                String msg = "[%s][%s]=%s".formatted(row, col, matrix[row][col]);
                System.out.println(msg);
            }
        }
    }

    public static int[][] transpose(final int[][] matrix) {
        final int[][] transposed = new int[matrix.length][matrix.length];
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                transposed[row][col] = matrix[col][row];
                transposed[col][row] = matrix[row][col];
            }
        }
        return transposed;
    }


}
