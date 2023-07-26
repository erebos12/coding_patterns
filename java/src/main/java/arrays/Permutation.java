package arrays;

import static matrix.MatrixUtils.createZeroMatrix;

/*
   What is a permutation ? See https://en.wikipedia.org/wiki/Permutation
   - here Two-line notation is used by applying a java array
   - 1st line: index of array elements
   - 2nd line: value of index
 */
public class Permutation {
    /*
      Signum or Signature of a permutation 'p':

        sgn(p) = 1 if number of pairs (i,j) with i>j and p(i)<p(j) is EVEN
                   ELSE
                -1 if ODD

       see https://de.wikipedia.org/wiki/Vorzeichen_(Permutation)
     */

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

    public static int[] invertByPermutationMatrix(int[] array) {
        return new int[array.length];
    }

    /*
       Composing 2 permutations: a o b = a(b(i))
         - b(i) gives value at i and this value, say x, is put into a(x) gives value at x, say y
         - y is put into result
     */
    public static int[] composePermutations(int[] a, int[] b) {
        int[] result = new int[a.length];
        for (int i = 0; i < b.length; i++) {
            result[i] = a[b[i] - 1];
        }
        return result;
    }

    /*
       see https://de.wikipedia.org/wiki/Permutationsmatrix
     */
    public static int[][] createPermutationMatrix(int[] a) {
        int[][] permMatrix = createZeroMatrix(a.length, a.length);
        int row = 0;
        for (int col : a) {
            permMatrix[row][col - 1] = 1;
            row++;
        }
        return permMatrix;
    }

    public static int[] permutationMatrixToPermutation(int[][] permMatrix) {
        int[] permutation = new int[permMatrix.length];
        for (int row = 0; row < permMatrix.length; row++) {
            for (int col = 0; col < permMatrix[row].length; col++) {
                if (permMatrix[row][col] == 1) {
                    permutation[row] = col + 1;
                }
            }
        }
        return permutation;
    }
}
