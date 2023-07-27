package matrix;

import java.util.Random;

public class MatrixUtils {

    public static int[][] rotateMatrix(final int[][] matrix) {
        return swap(transpose(matrix));
    }

    /*
    TODO: Currently only squared matrices are supported.
     */
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

    public static int[][] swap(final int[][] matrix) {
        int[][] swapped = new int[matrix.length][matrix.length];
        for (int row = 0; row < matrix.length; row++) {
            int left = 0;
            int right = matrix.length - 1;
            while (left <= right) {
                int a = matrix[row][left];
                swapped[row][left] = matrix[row][right];
                swapped[row][right] = a;
                left++;
                right--;
            }
        }
        return swapped;
    }

    public static int[][] randomMatrix(final int numOfRows, final int numOfColumns) {
        assert numOfColumns > 0 && numOfRows > 0;
        int[][] matrix = new int[numOfRows][numOfColumns];
        int upperbound = 100;
        Random rand = new Random();
        for (int row = 0; row < numOfRows; row++) {
            for (int col = 0; col < numOfColumns; col++) {
                matrix[row][col] = rand.nextInt(upperbound);
            }
        }
        return matrix;
    }

    public static int[][] createZeroMatrix(final int numOfRows, final int numOfColumns) {
        assert numOfColumns > 0 && numOfRows > 0;
        assert numOfColumns == numOfRows;
        int[][] matrix = new int[numOfRows][numOfColumns];
        for (int row = 0; row < numOfRows; row++) {
            for (int col = 0; col < numOfColumns; col++) {
                matrix[row][col] = 0;
            }
        }
        return matrix;
    }

    public static String toString(final int[][] matrix) {
        final StringBuilder s = new StringBuilder();
        for (int[] ints : matrix) {
            for (int anInt : ints) {
                s.append(anInt).append(" ");
            }
            s.append("\n");
        }
        return s.toString();
    }
}
