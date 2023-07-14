import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static matrix.MatrixUtils.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestRotateMatrix {


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


    //@Test
    void testRotateMatrix2x2() {
        var rotated = rotateMatrix(matrix2x2);
        print(matrix2x2);
        assertEquals(3, rotated[0][0]);
        assertEquals(1, rotated[0][1]);
        assertEquals(4, rotated[1][0]);
        assertEquals(2, rotated[1][2]);
    }

    //@Test
    void testRotateMatrix3x3() {
        var rotated = rotateMatrix(matrix3x3);
        print(matrix3x3);
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

    //@Test
    void testRotateMatrix4x4() {

        var rotated = rotateMatrix(matrix4x4);
        print(matrix4x4);
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
        System.out.println("========");
        print(matrix3x3);
        System.out.println("========");
        print(matrix4x4);
    }

    @Test
    void testTranspose() {
        /*
         TODO: create generic transpose test
         1. create randomized a matrix
         2. create a generic assert-method that checks if transpose worked correctly
         */

        int[][] transposed = transpose(matrix2x2);
        assertEquals(1, transposed[0][0]);
        assertEquals(3, transposed[0][1]);
        assertEquals(2, transposed[1][0]);
        assertEquals(4, transposed[1][1]);

        transposed = transpose(matrix3x3);
        assertEquals(1, transposed[0][0]);
        assertEquals(4, transposed[0][1]);
        assertEquals(7, transposed[0][2]);
        assertEquals(2, transposed[1][0]);
        assertEquals(5, transposed[1][1]);
        assertEquals(8, transposed[1][2]);
        assertEquals(3, transposed[2][0]);
        assertEquals(6, transposed[2][1]);
        assertEquals(9, transposed[2][2]);

        transposed = transpose(matrix4x4);
        assertEquals(1, transposed[0][0]);
        assertEquals(5, transposed[0][1]);
        assertEquals(9, transposed[0][2]);
        assertEquals(13, transposed[0][3]);

        assertEquals(2, transposed[1][0]);
        assertEquals(6, transposed[1][1]);
        assertEquals(10, transposed[1][2]);
        assertEquals(14, transposed[1][3]);

        assertEquals(3, transposed[2][0]);
        assertEquals(7, transposed[2][1]);
        assertEquals(11, transposed[2][2]);
        assertEquals(15, transposed[2][3]);

        assertEquals(4, transposed[3][0]);
        assertEquals(8, transposed[3][1]);
        assertEquals(12, transposed[3][2]);
        assertEquals(16, transposed[3][3]);
    }
}
