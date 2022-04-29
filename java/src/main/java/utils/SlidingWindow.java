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
            throw new Exception("Invalid window size!");
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

    public static int maxSumOfKElementsInArray(int[] arr, int n, int k) {
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < n - k + 1; i++) {
            int currentSum = 0;
            for (int j = 0; j < k; j++)
                currentSum = currentSum + arr[i + j];
            maxSum = Math.max(currentSum, maxSum);
        }
        return maxSum;
    }
}
