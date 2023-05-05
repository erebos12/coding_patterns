import org.junit.jupiter.api.Test;

import static matrix.MatrixUtils.printMatrix;
import static matrix.RotateMatrix.rotateMatrix;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestRotateMatrix {

    @Test
    void testRotateMatrix2x2() {
        int[][] matrix = new int[2][2];
        matrix[0][0] = 1;
        matrix[0][1] = 2;
        matrix[1][0] = 3;
        matrix[1][1] = 4;
        var rotated = rotateMatrix(matrix);
        printMatrix(matrix);
        assertEquals(3, rotated[0][0]);
        assertEquals(1, rotated[0][1]);
        assertEquals(4, rotated[1][0]);
        assertEquals(2, rotated[1][2]);
    }

    @Test
    void testRotateMatrix3x3() {
        int[][] matrix = new int[3][3];
        matrix[0][0] = 1;
        matrix[0][1] = 2;
        matrix[0][2] = 3;
        matrix[1][0] = 4;
        matrix[1][1] = 5;
        matrix[1][2] = 6;
        matrix[2][0] = 7;
        matrix[2][1] = 8;
        matrix[2][2] = 9;
        var rotated = rotateMatrix(matrix);
        printMatrix(matrix);
        assertEquals(7, rotated[0][0]);
        assertEquals(4, rotated[0][1]);
        assertEquals(1, rotated[0][2]);
        assertEquals(8, rotated[1][0]);
        assertEquals(5, rotated[1][1]);
        assertEquals(2, rotated[1][2]);
        assertEquals(9, rotated[2][0]);
        assertEquals(6, rotated[2][1]);
        assertEquals(3, rotated[2][2]);
    }

    @Test
    void testRotateMatrix4x4() {
        int[][] matrix = new int[4][4];
        matrix[0][0] = 1;
        matrix[0][1] = 2;
        matrix[0][2] = 3;
        matrix[0][3] = 4;
        matrix[1][0] = 5;
        matrix[1][1] = 6;
        matrix[1][2] = 7;
        matrix[1][3] = 8;
        matrix[2][0] = 9;
        matrix[2][1] = 10;
        matrix[2][2] = 11;
        matrix[2][3] = 12;
        matrix[3][0] = 13;
        matrix[3][1] = 14;
        matrix[3][2] = 15;
        matrix[3][3] = 16;
        var rotated = rotateMatrix(matrix);
        printMatrix(matrix);
        assertEquals(13, rotated[0][0]);
        assertEquals(9, rotated[0][1]);
        assertEquals(5, rotated[0][2]);
        assertEquals(1, rotated[0][3]);
        assertEquals(14, rotated[1][0]);
        assertEquals(10, rotated[1][1]);
        assertEquals(6, rotated[1][2]);
        assertEquals(2, rotated[1][3]);
        assertEquals(15, rotated[2][0]);
        assertEquals(11, rotated[2][1]);
        assertEquals(7, rotated[2][2]);
        assertEquals(3, rotated[2][3]);
        assertEquals(16, rotated[3][0]);
        assertEquals(12, rotated[3][1]);
        assertEquals(8, rotated[3][2]);
        assertEquals(4, rotated[3][3]);

    }
}
