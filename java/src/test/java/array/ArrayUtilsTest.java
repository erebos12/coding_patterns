package array;

import org.junit.jupiter.api.Test;

import static arrays.ArrayUtils.find3LargestElements;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ArrayUtilsTest {

    @Test
    void testFind3LargestElements() {
        int[] arr = {1, 5, 9, 3, 7, 9, 10};
        Integer[] expected = {7, 9, 10};
        assertArrayEquals(expected, find3LargestElements(arr));

        arr = new int[]{1, 5, 9};
        expected = new Integer[]{1, 5, 9};
        assertArrayEquals(expected, find3LargestElements(arr));

        arr = new int[]{10, 10, 9};
        expected = new Integer[]{9, 10};
        assertArrayEquals(expected, find3LargestElements(arr));

        arr = new int[]{10, 10, 9, 11};
        expected = new Integer[]{9, 10, 11};
        assertArrayEquals(expected, find3LargestElements(arr));

        arr = new int[]{1};
        expected = new Integer[]{1};
        assertArrayEquals(expected, find3LargestElements(arr));
    }
}
