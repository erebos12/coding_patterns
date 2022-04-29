import org.junit.jupiter.api.Test;
import utils.SlidingWindowException;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static utils.SlidingWindow.maxSumOfKElementsInArray;
import static utils.SlidingWindow.sumFromLowerToUpperIndex;

class TestSlidingWindow {

    @Test
    void sumLowerUpper() throws SlidingWindowException {
        var sum = sumFromLowerToUpperIndex(List.of(1, 4, 7, 8), 0, 3);
        assertEquals(20, sum);

        sum = sumFromLowerToUpperIndex(List.of(1, 4, 7, 8), 1, 2);
        assertEquals(11, sum);

        sum = sumFromLowerToUpperIndex(List.of(1, 4, 7, 8), 2, 3);
        assertEquals(15, sum);

        sum = sumFromLowerToUpperIndex(List.of(1, 4, 7, 8), 3, 3);
        assertEquals(8, sum);

        sum = sumFromLowerToUpperIndex(List.of(1, 4, 7, 8), 0, 0);
        assertEquals(1, sum);
    }

    @Test
    void testMaxSumOfKElementsInArray() throws SlidingWindowException {
        List<Integer> list = List.of(1, 4, 2, 10, 2, 3, 1, 0, 20);
        int max_sum = maxSumOfKElementsInArray(list, 4);
        assertEquals(24, max_sum);

        list = List.of(1, 4, 2, 10, 2, 3, 1, 10, 20);
        max_sum = maxSumOfKElementsInArray(list, 4);
        assertEquals(34, max_sum);

        list = List.of(1, 4, 2, 10, 2, 3, 1, 0);
        max_sum = maxSumOfKElementsInArray(list, 2);
        assertEquals(12, max_sum);

        list = List.of(1, 4, 2, 10, 2, 3, 1, 0);
        max_sum = maxSumOfKElementsInArray(list, 1);
        assertEquals(10, max_sum);
    }

    @Test
    void testMaxSumOfKElementsInArray_2() throws SlidingWindowException {
        int[] arr = {1, 4, 2, 10, 2, 3, 1, 0, 20};
        int k = 4;
        int n = arr.length;
        int result = maxSumOfKElementsInArray(arr, n, k);
        assertEquals(24, result);
    }
}



