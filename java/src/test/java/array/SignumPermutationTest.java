package array;

import arrays.SignumResult;
import org.junit.jupiter.api.Test;

import static arrays.SignumPermutation.*;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SignumPermutationTest {

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
        assertArrayEquals(new int[]{1, 2}, res);

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
}
