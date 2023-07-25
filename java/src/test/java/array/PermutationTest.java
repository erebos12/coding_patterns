package array;

import arrays.SignumResult;
import org.junit.jupiter.api.Test;

import static arrays.Permutation.*;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PermutationTest {

    @Test
    void testSignumOfPermutation() {
        SignumResult res = signumOfPermutation(new int[]{4, 2, 1, 3});
        assertEquals(1, res.signum);
        assertEquals(4, res.errorCount);
        res = signumOfPermutation(new int[]{3, 1, 4, 5, 2});
        assertEquals(1, res.signum);
        assertEquals(4, res.errorCount);

        res = signumOfPermutation(new int[]{3, 4, 1, 2, 5});
        assertEquals(1, res.signum);
        assertEquals(4, res.errorCount);

        res = signumOfPermutation(new int[]{4, 2, 3, 1});
        assertEquals(-1, res.signum);
        assertEquals(5, res.errorCount);

        res = signumOfPermutation(new int[]{2, 1});
        assertEquals(-1, res.signum);
        assertEquals(1, res.errorCount);

        res = signumOfPermutation(new int[]{4, 3, 1});
        assertEquals(-1, res.signum);
        assertEquals(3, res.errorCount);

        res = signumOfPermutation(new int[]{1, 2, 3});
        assertEquals(1, res.signum);
        assertEquals(0, res.errorCount);

        res = signumOfPermutation(new int[]{1});
        assertEquals(1, res.signum);
        assertEquals(0, res.errorCount);

    }

    @Test
    void testInvertPermutation() {
        int[] res = invertPermutation(new int[]{3, 1, 4, 5, 2});
        assertArrayEquals(new int[]{2, 5, 1, 3, 4}, res);

        res = invertPermutation(new int[]{3, 4, 1, 2, 5});
        assertArrayEquals(new int[]{3, 4, 1, 2, 5}, res);

        res = invertPermutation(new int[]{3, 1, 2});
        assertArrayEquals(new int[]{2, 3, 1}, res);

        res = invertPermutation(new int[]{2, 1, 3});
        assertArrayEquals(new int[]{2, 1, 3}, res);

        res = invertPermutation(new int[]{1, 2, 3});
        assertArrayEquals(new int[]{1, 2, 3}, res);

        res = invertPermutation(new int[]{2, 1});
        assertArrayEquals(new int[]{2, 1}, res);

        res = invertPermutation(new int[]{1, 2});
        assertArrayEquals(new int[]{1, 2}, res);

        res = invertPermutation(new int[]{1});
        assertArrayEquals(new int[]{1}, res);
    }

    @Test
    void testComposePermutation() {
        int[] a = new int[]{3, 4, 2, 1};
        int[] b = new int[]{3, 1, 4, 2};
        int[] res = composePermutation(a, b);
        assertArrayEquals(new int[]{2, 3, 1, 4}, res);

        a = new int[]{3, 4, 2, 1};
        b = new int[]{3, 1, 4, 2};
        res = composePermutation(b, a);
        assertArrayEquals(new int[]{4, 2, 1, 3}, res);

        a = new int[]{3, 1, 4, 5, 2};
        b = new int[]{3, 4, 1, 2, 5};
        res = composePermutation(a, b);
        assertArrayEquals(new int[]{4, 5, 3, 1, 2}, res);

        a = new int[]{3, 1, 4, 5, 2};
        b = new int[]{3, 4, 1, 2, 5};
        res = composePermutation(b, a);
        assertArrayEquals(new int[]{1, 3, 2, 5, 4}, res);

    }

    @Test
    void testCreatePermutationMatrix01() {
        int[][] permutationMatrix = createPermutationMatrix(new int[]{3, 5, 8, 1, 7, 4, 2, 6});
        for (int row = 0; row < permutationMatrix.length; row++) {
            for (int col = 0; col < permutationMatrix.length; col++) {
                if (row == 0 && col == 2) {
                    assertEquals(1, permutationMatrix[row][col]);
                } else if (row == 1 && col == 4) {
                    assertEquals(1, permutationMatrix[row][col]);
                } else if (row == 2 && col == 7) {
                    assertEquals(1, permutationMatrix[row][col]);
                } else if (row == 3 && col == 0) {
                    assertEquals(1, permutationMatrix[row][col]);
                } else if (row == 4 && col == 6) {
                    assertEquals(1, permutationMatrix[row][col]);
                } else if (row == 5 && col == 3) {
                    assertEquals(1, permutationMatrix[row][col]);
                } else if (row == 6 && col == 1) {
                    assertEquals(1, permutationMatrix[row][col]);
                } else if (row == 7 && col == 5) {
                    assertEquals(1, permutationMatrix[row][col]);
                } else {
                    assertEquals(0, permutationMatrix[row][col]);
                }
            }
        }
    }

    @Test
    void testCreatePermutationMatrix02() {
        int[][] permutationMatrix = createPermutationMatrix(new int[]{2, 3, 1});
        for (int row = 0; row < permutationMatrix.length; row++) {
            for (int col = 0; col < permutationMatrix.length; col++) {
                if (row == 0 && col == 1) {
                    assertEquals(1, permutationMatrix[row][col]);
                } else if (row == 1 && col == 2) {
                    assertEquals(1, permutationMatrix[row][col]);
                } else if (row == 2 && col == 0) {
                    assertEquals(1, permutationMatrix[row][col]);
                } else {
                    assertEquals(0, permutationMatrix[row][col]);
                }
            }
        }
    }
}