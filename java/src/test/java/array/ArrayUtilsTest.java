package array;

import org.junit.jupiter.api.Test;

import static arrays.ArrayUtils.findNLargestElements;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class ArrayUtilsTest {

    @Test
    void testFind3LargestElements() {
        int num = 3;
        int[] arr = {1, 5, 9, 3, 7, 9, 10};
        Integer[] expected = {7, 9, 10};
        assertArrayEquals(expected, findNLargestElements(arr, num));

        arr = new int[]{1, 5, 9};
        expected = new Integer[]{1, 5, 9};
        assertArrayEquals(expected, findNLargestElements(arr, num));

        arr = new int[]{10, 10, 9};
        expected = new Integer[]{9, 10};
        assertArrayEquals(expected, findNLargestElements(arr, num));

        arr = new int[]{10, 10, 9, 11};
        expected = new Integer[]{9, 10, 11};
        assertArrayEquals(expected, findNLargestElements(arr, num));

        arr = new int[]{1};
        expected = new Integer[]{1};
        assertArrayEquals(expected, findNLargestElements(arr, num));
    }

    @Test
    void testFind4LargestElements() {
        int num = 4;
        int[] arr = {1, 5, 9, 3, 7, 9, 10};
        Integer[] expected = {5, 7, 9, 10};
        assertArrayEquals(expected, findNLargestElements(arr, num));

        arr = new int[]{1, 5, 9};
        expected = new Integer[]{1, 5, 9};
        assertArrayEquals(expected, findNLargestElements(arr, num));

        arr = new int[]{10, 10, 9};
        expected = new Integer[]{9, 10};
        assertArrayEquals(expected, findNLargestElements(arr, num));

        arr = new int[]{10, 10, 9, 11};
        expected = new Integer[]{9, 10, 11};
        assertArrayEquals(expected, findNLargestElements(arr, num));

        arr = new int[]{1, 3, 4, 5, 6, 7};
        expected = new Integer[]{4, 5, 6, 7};
        assertArrayEquals(expected, findNLargestElements(arr, num));
    }

    @Test
    void testFind2LargestElements() {
        int num = 2;
        int[] arr = {1, 5, 9, 3, 7, 9, 10};
        Integer[] expected = {9, 10};
        assertArrayEquals(expected, findNLargestElements(arr, num));

        arr = new int[]{1, 5, 9};
        expected = new Integer[]{5, 9};
        assertArrayEquals(expected, findNLargestElements(arr, num));

        arr = new int[]{10, 10, 9};
        expected = new Integer[]{9, 10};
        assertArrayEquals(expected, findNLargestElements(arr, num));

        arr = new int[]{10, 10, 9, 11};
        expected = new Integer[]{10, 11};
        assertArrayEquals(expected, findNLargestElements(arr, num));

        arr = new int[]{1, 3, 4, 5, 6, 7};
        expected = new Integer[]{6, 7};
        assertArrayEquals(expected, findNLargestElements(arr, num));
    }
}
