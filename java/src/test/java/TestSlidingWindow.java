import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TestSlidingWindow {

    @Test
    void sumLowerUpper() throws Exception {
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
    void testMaxSumOfKElementsInArray() throws Exception {
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

    private int sumFromLowerToUpperIndex(List<Integer> list, int lower, int upper) throws Exception {
        if (upper > list.size() || lower >= list.size()) {
            throw new Exception("Invalid upper or lower index!");
        }
        int sum = 0;
        for (int i = lower; i <= upper; i++) {
            sum += list.get(i);
        }
        return sum;
    }

    private int maxSumOfKElementsInArray(List<Integer> list, int k) throws Exception {
        if (k > list.size()) {
            return -1;
        }
        int max_sum = 0;
        int lower = 0;
        int upper = k - 1;
        while (upper < list.size()) {
            int window_sum = sumFromLowerToUpperIndex(list, lower, upper);
            max_sum = Math.max(window_sum, max_sum);
            lower++;
            upper++;
        }
        return max_sum;
    }
}



