package matrix;

public class RotateMatrix {

    public static int[][] rotateMatrix(final int[][] matrix) {
        return matrix;
    }

    public static void printMatrix(final int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                System.out.println(matrix[row][col]);
            }

        }
    }
}
