package two_pointers;


/*
  Is the sum of pairs (2 items) of an array equal to a given value x
 */
public class TwoPointers {

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

    public static void swap(int[] arr, int i, int j) {
        int k = arr[i];
        arr[i] = arr[j];
        arr[j] = k;
    }

    public static int countZerosInArray(int[] nums) {
        int count_zeros = 0;
        for (int num : nums) {
            if (num == 0) {
                count_zeros++;
            }
        }
        return count_zeros;
    }

    public static int[] moveZeroes(int[] nums) {
        int count_zeros = countZerosInArray(nums);
        for (int n = 0; n < count_zeros; n++) {
            int slow = 0;
            for (int fast = 1; fast < nums.length; fast++) {
                if (nums[slow] == 0) {
                    swap(nums, slow, fast);
                }
                slow++;
            }
        }
        return nums;
    }
}
