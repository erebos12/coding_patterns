package two_pointers;


public class TwoPointers {

    /*
     *  Is the sum of pairs (2 items) of an array equal to a given value x
     */
    public static boolean isPairSum(int[] array, int x) {
        // represents first pointer
        int i = 0;
        // represents second pointer
        int j = array.length - 1;
        while (i < j) {
            if (array[i] + array[j] == x) {
                System.out.println("First pointer: Found number " + array[i] + " at index " + i);
                System.out.println("Second Pointer: Found number " + array[j] + " at index " + j);
                return true;
            } else if (array[i] + array[j] < x) {
                /*
                When sum is less than x then the sum must get greater.
                So we move left index (first pointer) to the right since it's a sorted array by which the sum will become greater.
                 */
                i++;
            } else {
                /*
                When sum is greater than x then the sum must get smaller.
                So we move right index (second pointer) to the left since it's a sorted array by which the sum will become smaller.
                 */
                j--;
            }

        }
        return false;
    }

    /*
     * Problem: Given an array, rotate the array to the right by k steps, where k is non-negative.
     * For example, if our input array is [1, 2, 3, 4, 5, 6, 7] and k is 4, then the output should be [4, 5, 6, 7, 1, 2, 3].
     * We can solve this by having two loops again which will make the time complexity O(n^2) or by using an extra, temporary array, but that will make the space complexity O(n).
     */
    public void rotate(int[] input, int step) {
        step %= input.length;
        reverse(input, 0, input.length - 1);
        reverse(input, 0, step - 1);
        reverse(input, step, input.length - 1);
    }

    private void reverse(int[] input, int start, int end) {
        while (start < end) {
            int temp = input[start];
            input[start] = input[end];
            input[end] = temp;
            start++;
            end--;
        }
    }
}
