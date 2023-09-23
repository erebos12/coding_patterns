package arrays;

import java.util.ArrayList;
import java.util.Collections;

import static matrix.MatrixUtils.createZeroMatrix;
import static matrix.MatrixUtils.transpose;

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

    /*
       The inverted permutation matrix (P^-1) is equal to the transposed permutation matrix (P^T):
       P^-1 = P^T -> See https://en.wikipedia.org/wiki/Permutation_matrix
       So for creating the inverted permutation we use the permutation matrix,
       transpose it and convert it back to a permutation.
     */
    public static int[] invertByPermutationMatrix(int[] array) {
        int[][] permMatrix = createPermutationMatrix(array);
        int[][] transposed = transpose(permMatrix);
        return permutationMatrixToPermutation(transposed);
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

    public static int[] createIdentityPermutation(int numberOfElements) {
        int[] id = new int[numberOfElements];
        for (int i = 0; i < numberOfElements; i++) {
            id[i] = i + 1;
        }
        return id;
    }

    /*
     This method converts a permutation in two-line-notation to the shorter
     cycle-notation. The cycle notation is at the same time
     the decomposition of a permutation in its cycles.
     See https://en.wikipedia.org/wiki/Cyclic_permutation or https://de.wikipedia.org/wiki/Permutation#Zyklenschreibweise
     */
    public static ArrayList<ArrayList<Integer>> getPermutationCycles(int[] permutation) {
        ArrayList<ArrayList<Integer>> cycles = new ArrayList<>();
        ArrayList<Integer> cycle = new ArrayList<>();
        for (int i = 0; i < permutation.length; i++) {
            int value = permutation[i];
            while (value != -1 && !cycle.contains(value)) {
                cycle.add(value);
                i = value - 1;
                value = permutation[i];
                permutation[i] = -1; // touched this already, so ignore later on
            }
            if (!cycle.isEmpty()) {
                cycles.add(cycle);
                cycle = new ArrayList<>(); // start a new empty cycle
            }
        }
        return cycles;
    }

    /*
      Calculates the cycle-type of a permutation.
      See https://de.wikipedia.org/wiki/Zykeltyp
     */
    public static ArrayList<Integer> permutationCycleType(int[] permutation) {
        ArrayList<Integer> type = new ArrayList<>();
        ArrayList<ArrayList<Integer>> cycles = getPermutationCycles(permutation);
        cycles.forEach(c -> type.add(c.size()));
        Collections.sort(type);
        return type;
    }

    /*
    Calculates whether 2 permutations are in the same permutation class.
    See https://de.wikipedia.org/wiki/Zykeltyp -> Zykelklassen
   */
    public static boolean arePermutationsInSameClass(int[] permutation1, int[] permutation2) {
        return permutationCycleType(permutation1).equals(permutationCycleType(permutation2));
    }
}
