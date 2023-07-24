package array;

import arrays.SignumResult;
import org.junit.jupiter.api.Test;

import static arrays.SignumPermutation.signumOfPermutation;
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
}
