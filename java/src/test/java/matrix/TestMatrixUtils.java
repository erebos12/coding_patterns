package matrix;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static arrays.Permutation.createPermutationMatrix;
import static matrix.MatrixUtils.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static strings.StringUtils.stdout;

public class TestMatrixUtils {


    public static int[][] matrix2x2;
    public static int[][] matrix3x3;
    public static int[][] matrix4x4;

    @BeforeAll
    static void setup() {
        matrix2x2 = new int[2][2];
        matrix2x2[0][0] = 1;
        matrix2x2[0][1] = 2;
        matrix2x2[1][0] = 3;
        matrix2x2[1][1] = 4;

        matrix3x3 = new int[3][3];
        matrix3x3[0][0] = 1;
        matrix3x3[0][1] = 2;
        matrix3x3[0][2] = 3;
        matrix3x3[1][0] = 4;
        matrix3x3[1][1] = 5;
        matrix3x3[1][2] = 6;
        matrix3x3[2][0] = 7;
        matrix3x3[2][1] = 8;
        matrix3x3[2][2] = 9;

        matrix4x4 = new int[4][4];
        matrix4x4[0][0] = 1;
        matrix4x4[0][1] = 2;
        matrix4x4[0][2] = 3;
        matrix4x4[0][3] = 4;
        matrix4x4[1][0] = 5;
        matrix4x4[1][1] = 6;
        matrix4x4[1][2] = 7;
        matrix4x4[1][3] = 8;
        matrix4x4[2][0] = 9;
        matrix4x4[2][1] = 10;
        matrix4x4[2][2] = 11;
        matrix4x4[2][3] = 12;
        matrix4x4[3][0] = 13;
        matrix4x4[3][1] = 14;
        matrix4x4[3][2] = 15;
        matrix4x4[3][3] = 16;
    }


    @Test
    void testRotateMatrix2x2() {
        var rotated = rotateMatrix(matrix2x2);
        assertEquals(3, rotated[0][0]);
        assertEquals(1, rotated[0][1]);
        assertEquals(4, rotated[1][0]);
        assertEquals(2, rotated[1][1]);
    }

    @Test
    void testRotateMatrix3x3() {
        var rotated = rotateMatrix(matrix3x3);
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

        var rotated = rotateMatrix(matrix4x4);
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

    @Test
    void testPrintMatrix() {
        print(matrix2x2);
        print(matrix3x3);
        print(matrix4x4);
    }

    @Test
    void testTransposeSquaredMatrix() {
        int[][] matrix = randomMatrix(2, 2);
        int[][] transposed = transpose(matrix);
        checkTransposedMatrix(matrix, transposed);

        matrix = randomMatrix(3, 3);
        transposed = transpose(matrix);
        checkTransposedMatrix(matrix, transposed);

        matrix = randomMatrix(4, 4);
        transposed = transpose(matrix);
        checkTransposedMatrix(matrix, transposed);

        matrix = randomMatrix(20, 20);
        transposed = transpose(matrix);
        checkTransposedMatrix(matrix, transposed);
    }

    @Test
    void testTransposeExceptions() {
        Assertions.assertThrows(AssertionError.class, () -> randomMatrix(1, 2), "AssertionError was expected");

        Assertions.assertThrows(AssertionError.class, () -> randomMatrix(0, 1), "AssertionError was expected");

        Assertions.assertThrows(AssertionError.class, () -> randomMatrix(1, 0), "AssertionError was expected");

        Assertions.assertThrows(AssertionError.class, () -> randomMatrix(0, 0), "AssertionError was expected");
    }

    void checkTransposedMatrix(int[][] matrix, int[][] transposed) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                assertEquals(matrix[row][col], transposed[col][row]);
            }
        }
    }

    @Test
    void testRandomMatrix() {
        int[][] m = randomMatrix(3, 3);
        assertEquals(m.length, 3);
        print(m);
        m = randomMatrix(2, 2);
        assertEquals(m.length, 2);
    }

    @Test
    void testSwap2x2() {
        int[][] m = randomMatrix(2, 2);
        int[][] swapped = swap(m);
        assertEquals(m[0][0], swapped[0][1]);
        assertEquals(m[1][0], swapped[1][1]);
    }

    @Test
    void testSwap3x3() {
        int[][] m = randomMatrix(3, 3);
        int[][] swapped = swap(m);
        assertEquals(m[0][0], swapped[0][2]);
        assertEquals(m[0][1], swapped[0][1]);
        assertEquals(m[1][0], swapped[1][2]);
        assertEquals(m[1][1], swapped[1][1]);
        assertEquals(m[2][0], swapped[2][2]);
    }

    @Test
    void testSwap4x4() {
        int[][] m = randomMatrix(4, 4);
        int[][] swapped = swap(m);
        assertEquals(m[0][0], swapped[0][3]);
        assertEquals(m[0][1], swapped[0][2]);
        assertEquals(m[1][0], swapped[1][3]);
        assertEquals(m[1][1], swapped[1][2]);
        assertEquals(m[2][0], swapped[2][3]);
        assertEquals(m[2][1], swapped[2][2]);
    }

    @Test
    void testCreateZeroMatrix() {
        int[][] matrix = createZeroMatrix(3, 3);
        checkAllZerosInMatrix(matrix);
        matrix = createZeroMatrix(2, 2);
        checkAllZerosInMatrix(matrix);
        matrix = createZeroMatrix(4, 4);
        checkAllZerosInMatrix(matrix);
    }

    @Test
    void testPrettyPrint() {
        String s = prettyPrint(createZeroMatrix(3, 3));
        assertEquals("[0 0 0 , 0 0 0 , 0 0 0 ]", Arrays.toString(s.split("\n")));
        stdout(s);
        s = prettyPrint(createPermutationMatrix(new int[]{2, 1, 3}));
        assertEquals("[0 1 0 , 1 0 0 , 0 0 1 ]", Arrays.toString(s.split("\n")));
        stdout(s);
        s = prettyPrint(createPermutationMatrix(new int[]{2, 1, 3, 4}));
        assertEquals("[0 1 0 0 , 1 0 0 0 , 0 0 1 0 , 0 0 0 1 ]", Arrays.toString(s.split("\n")));
        stdout(s);
    }

    void checkAllZerosInMatrix(int[][] matrix) {
        for (int[] ints : matrix) {
            for (int anInt : ints) {
                assertEquals(0, anInt);
            }
        }
    }
}
