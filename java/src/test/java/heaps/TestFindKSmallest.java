package heaps;

import org.junit.jupiter.api.Test;

import static heaps.FindKSmallest.findKSmallest;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class TestFindKSmallest {

    @Test
    public void testFind2Smallest() {
        int[] input = {9, 4, 7, 1, -2, 6, 5};
        int[] output = findKSmallest(input, 2);
        assertArrayEquals(new int[]{-2, 1}, output);
    }

    @Test
    public void testFind4Smallest() {
        int[] input = {9, 4, 7, 1, -2, 6, 5};
        int[] output = findKSmallest(input, 4);
        assertArrayEquals(new int[]{-2, 1, 4, 5}, output);
    }
}
