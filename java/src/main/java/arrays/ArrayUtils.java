package arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ArrayUtils {

    public static Integer[] findNLargestElements(final int[] array, final int n) {
        Set<Integer> result = new HashSet<>();
        /*
         Arrays.sort: It uses Tuned Quicksort with avg. case Time complexity = O(n*log(n))
         */
        Arrays.sort(array);
        int inserted = 1;
        for (int i = array.length - 1; i >= 0; i--) {
            if (inserted <= n && !result.contains(array[i])) {
                result.add(array[i]);
                inserted++;
            }
        }
        return result.toArray(Integer[]::new);
    }

    public static int findSecondLargestElement(final int[] array) {
        if (array.length == 0) {
            return -1;
        }
        if (array.length == 1) {
            return array[0];
        }
        Set<Integer> temp = new HashSet<>();
        /*
         Arrays.sort: It uses Tuned Quicksort with avg. case Time complexity = O(n*log(n))
         */
        Arrays.sort(array);
        for (int j : array) {
            temp.add(j);
        }
        return (int) temp.toArray()[temp.size() - 2];
    }
}
