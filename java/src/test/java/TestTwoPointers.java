import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static two_pointers.TwoPointers.*;

class TestTwoPointers {

    @Test
    void sumLowerUpper() {
        int[] arr = {2, 3, 5, 8, 9, 10, 11};
        boolean found = isPairSum(arr, 17);
        assertTrue(found);

        int[] arr2 = {2, 3, 5, 8, 9, 10, 16, 20, 33};
        found = isPairSum(arr2, 19);
        assertTrue(found);
    }

    @Test
    void testSwap() {
        int[] nums = new int[]{0, 1, 0, 3, 12};
        swap(nums, 0, 1);
        assertArrayEquals(new int[]{1, 0, 0, 3, 12}, nums);
        swap(nums, 3, 4);
        assertArrayEquals(new int[]{1, 0, 0, 12, 3}, nums);
    }

    @Test
    void moveZeros() {
        int[] nums = new int[]{0, 1, 0, 3, 12};
        assertArrayEquals(new int[]{1, 3, 12, 0, 0}, moveZeroes(nums));
        nums = new int[]{0, 7, 0, 3, 12, 8, 0, 9};
        assertArrayEquals(new int[]{7, 3, 12, 8, 9, 0, 0, 0}, moveZeroes(nums));
    }
}



