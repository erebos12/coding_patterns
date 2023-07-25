package arrays;

public class Permutation {

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

    /*
       Inverting permutation: Index becomes value and value becomes index
       ATTENTION:
         Values in array always starts with 1,
         so 1 corresponds then to index = 0, 2 to index = 1 and so on.
         That means (value - 1) would then be the new index.
     */
    public static int[] invertPermutation(int[] array) {
        int[] inverted = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            inverted[array[i] - 1] = i + 1;
        }
        return inverted;
    }

    public static int[] composePermutation(int[] a, int[] b) {
        int[] result = new int[a.length];
        for (int i = 0; i < b.length; i++) {
            result[i] = a[b[i] - 1];
        }
        return result;
    }
}
