package matrix;

import java.util.Random;

public class MatrixUtils {

    public static int[][] rotateMatrix(final int[][] matrix) {
        // 1. Transpose matrix
        // 2. Swap per row elements which are to the opposite (2 pointer pattern)
        return matrix;
    }

    public static void print(final int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                String msg = "[%s][%s]=%s".formatted(row, col, matrix[row][col]);
                System.out.println(msg);
            }
        }
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
        return null;
    }

    public static int[][] randomMatrix(final int numOfRows, final int numOfColumns) {
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
}
