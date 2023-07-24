package arrays;

public class SignumPermutation {

    public static SignumResult signumOfPermutation(int[] array) {
        int errorCount = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    errorCount++;
                }
            }
        }
        int signum = (errorCount % 2 == 0) ? 1 : -1;
        return new SignumResult(signum, errorCount);
    }
}
