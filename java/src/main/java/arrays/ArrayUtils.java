package arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ArrayUtils {

    public static Integer[] find3LargestElements(final int[] array) {
        Set<Integer> result = new HashSet<>();
        /*
         Arrays.sort: It uses Tuned Quicksort with avg. case Time complexity = O(n*log(n))
         */
        Arrays.sort(array);
        int inserted = 1;
        for (int i = array.length - 1; i >= 0; i--) {
            if (inserted <= 3 && !result.contains(array[i])) {
                result.add(array[i]);
                inserted++;
            }
        }
        return result.toArray(Integer[]::new);
    }
}
