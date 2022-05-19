package missing_number;

public class FindMissingNumber {

    public static int findOneMissingNumber(int[] array) {
        int n = array.length + 1; // +1 because ONE number is missing, so the size must be +1
        int sumByGauss = n * (n + 1) / 2;
        int sumOfArray = sumOfArray(array);
        return sumByGauss - sumOfArray;
    }

    public static int sumOfArray(int[] array) {
        int sumOfArray = 0;
        for (int j : array) {
            sumOfArray += j;
        }
        return sumOfArray;
    }
}
