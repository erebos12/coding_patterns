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

    public static int[] moveZeros(final int[] array) {
        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                swap(array, j, i);
                j++;
            }
        }
        return array;
    }

    public static void swap(int[] array, int a, int b) {
        if (array.length == 0) {
            return;
        }
        assert a >= 0 && b >= 0;
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }

    // immutable solution where origin array remains as it is
    public static int[] rearrangeMaxAndMin(final int[] array) {
        int[] result = new int[array.length];
        int left = 0;
        int right = array.length - 1;
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                result[i] = array[right--];
            } else {
                result[i] = array[left++];
            }
        }
        return result;
    }
}
