package utils;

import java.util.List;

public class SlidingWindow {

    private SlidingWindow() {
        throw new IllegalStateException("Utility class");
    }

    public static int sumFromLowerToUpperIndex(List<Integer> list, int lower, int upper) throws SlidingWindowException {
        if (upper > list.size() || lower >= list.size()) {
            throw new SlidingWindowException("Invalid upper or lower index!");
        }
        int sum = 0;
        for (int i = lower; i <= upper; i++) {
            sum += list.get(i);
        }
        return sum;
    }

    public static int maxSumOfKElementsInArray(List<Integer> list, int k) throws SlidingWindowException {
        if (k > list.size()) {
            throw new SlidingWindowException("Invalid window size!");
        }
        int maxSum = 0;
        int lower = 0;
        int upper = k - 1;
        while (upper < list.size()) {
            int windowSum = sumFromLowerToUpperIndex(list, lower, upper);
            maxSum = Math.max(windowSum, maxSum);
            lower++;
            upper++;
        }
        return maxSum;
    }

    public static int maxSumOfKElementsInArray(int[] arr, int n, int k) throws SlidingWindowException {
        if (n < k) {
            throw new SlidingWindowException("Invalid window size!");
        }
        int maxSum = 0;
        for (int i = 0; i < k; i++)
            maxSum += arr[i];
        int windowSum = maxSum;
        for (int i = k; i < n; i++) {
            windowSum += arr[i] - arr[i - k];
            maxSum = Math.max(maxSum, windowSum);
        }
        return maxSum;
    }
}
