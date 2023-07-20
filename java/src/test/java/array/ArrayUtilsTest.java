package array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static arrays.ArrayUtils.*;
import static matrix.MatrixUtils.randomMatrix;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

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

    @Test
    void testFindSecondLargestElement() {
        assertEquals(9, findSecondLargestElement(new int[]{10, 10, 9}));
        assertEquals(5, findSecondLargestElement(new int[]{1, 2, 3, 5, 9}));
        assertEquals(6, findSecondLargestElement(new int[]{10, 1, 6}));
        assertEquals(10, findSecondLargestElement(new int[]{10}));
        assertEquals(-1, findSecondLargestElement(new int[]{}));
    }

    @Test
    void testMoveZero() {
        assertArrayEquals(new int[]{9, 10, 0}, moveZeros(new int[]{0, 9, 10}));
        assertArrayEquals(new int[]{9, 0, 0}, moveZeros(new int[]{0, 0, 9}));
        assertArrayEquals(new int[]{1, 9, 0, 0}, moveZeros(new int[]{0, 0, 1, 9}));
        assertArrayEquals(new int[]{1, 2, 4, 3, 5, 0, 0, 0}, moveZeros(new int[]{1, 2, 0, 4, 3, 0, 5, 0}));
        assertArrayEquals(new int[]{1, 2, 3, 6, 0, 0, 0}, moveZeros(new int[]{1, 2, 0, 0, 0, 3, 6}));
    }

    @Test
    void testSwap() {
        int[] array = new int[]{0, 9, 10};
        swap(array, 0, 1);
        assertArrayEquals(new int[]{9, 0, 10}, array);

        array = new int[]{0, 9, 10};
        swap(array, 0, 2);
        assertArrayEquals(new int[]{10, 9, 0}, array);

        array = new int[]{};
        swap(array, 0, 2);
        assertArrayEquals(new int[]{}, array);

        array = new int[]{0, 9, 10};
        swap(array, 0, 0);
        assertArrayEquals(new int[]{0, 9, 10}, array);

        Assertions.assertThrows(AssertionError.class,
                () -> swap(new int[]{10}, -1, 0), "AssertionError was expected");

        Assertions.assertThrows(AssertionError.class,
                () -> swap(new int[]{10}, 0, -1), "AssertionError was expected");
    }
}
