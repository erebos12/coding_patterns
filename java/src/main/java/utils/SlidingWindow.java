package utils;

import java.util.List;

public class SlidingWindow {

    public static int sumFromLowerToUpperIndex(List<Integer> list, int lower, int upper) throws Exception {
        if (upper > list.size() || lower >= list.size()) {
            throw new Exception("Invalid upper or lower index!");
        }
        int sum = 0;
        for (int i = lower; i <= upper; i++) {
            sum += list.get(i);
        }
        return sum;
    }

    public static int maxSumOfKElementsInArray(List<Integer> list, int k) throws Exception {
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
