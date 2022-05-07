package two_pointers;

public class SlowFastPointer {

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

    public static int[] moveZeros(int[] nums) {
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

    public static int[] moveZerosInArray(int[] nums) {
        for (int i = 0, j = 0; j < nums.length; j++) {
            if (nums[j] != 0) {
                swap(nums, i++, j);
            }
        }
        return nums;
    }
}
