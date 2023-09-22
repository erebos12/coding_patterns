package array;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static arrays.Permutation.*;
import static org.junit.jupiter.api.Assertions.*;

public class CycleOfPermutationTest {

    @Test
    void testPermutationCycles_01() {
        // Given
        int[] permutation = new int[]{3, 4, 2, 1};
        // When
        ArrayList<ArrayList<Integer>> cycles = getPermutationCycles(permutation);
        // Then
        assertEquals(1, cycles.size());
        assertArrayEquals(List.of(3, 2, 4, 1).toArray(), cycles.get(0).toArray());
    }

    @Test
    void testPermutationCycles_02() {
        // Given
        int[] permutation = new int[]{3, 1, 2, 4};
        // When
        ArrayList<ArrayList<Integer>> cycles = getPermutationCycles(permutation);
        // Then
        assertEquals(2, cycles.size());
        assertArrayEquals(List.of(3, 2, 1).toArray(), cycles.get(0).toArray());
        assertArrayEquals(List.of(4).toArray(), cycles.get(1).toArray());
    }

    @Test
    void testPermutationCycles_03() {
        // Given
        int[] permutation = new int[]{3, 4, 1, 2};
        // When
        ArrayList<ArrayList<Integer>> cycles = getPermutationCycles(permutation);
        // Then
        assertEquals(2, cycles.size());
        assertArrayEquals(List.of(3, 1).toArray(), cycles.get(0).toArray());
        assertArrayEquals(List.of(4, 2).toArray(), cycles.get(1).toArray());
    }

    @Test
    void testPermutationCycles_04() {
        // Given
        int[] permutation = new int[]{1, 4, 2, 3};
        // When
        ArrayList<ArrayList<Integer>> cycles = getPermutationCycles(permutation);
        // Then
        assertEquals(2, cycles.size());
        assertArrayEquals(List.of(1).toArray(), cycles.get(0).toArray());
        assertArrayEquals(List.of(4, 3, 2).toArray(), cycles.get(1).toArray());
    }

    @Test
    void testPermutationCycles_05() {
        // Given
        int[] permutation = new int[]{5, 3, 4, 1, 2};
        // When
        ArrayList<ArrayList<Integer>> cycles = getPermutationCycles(permutation);
        // Then
        assertEquals(1, cycles.size());
        assertArrayEquals(List.of(5, 2, 3, 4, 1).toArray(), cycles.get(0).toArray());
    }

    @Test
    void testPermutationCycles_06() {
        // Given
        int[] permutation = new int[]{1, 3, 2, 4, 5};
        // When
        ArrayList<ArrayList<Integer>> cycles = getPermutationCycles(permutation);
        // Then
        assertEquals(4, cycles.size());
        assertArrayEquals(List.of(1).toArray(), cycles.get(0).toArray());
        assertArrayEquals(List.of(3, 2).toArray(), cycles.get(1).toArray());
        assertArrayEquals(List.of(4).toArray(), cycles.get(2).toArray());
        assertArrayEquals(List.of(5).toArray(), cycles.get(3).toArray());
    }

    @Test
    void testPermutationCycles_07() {
        // Given
        int[] permutation = new int[]{1, 3, 2, 5, 4};
        // When
        ArrayList<ArrayList<Integer>> cycles = getPermutationCycles(permutation);
        // Then
        assertEquals(3, cycles.size());
        assertArrayEquals(List.of(1).toArray(), cycles.get(0).toArray());
        assertArrayEquals(List.of(3, 2).toArray(), cycles.get(1).toArray());
        assertArrayEquals(List.of(5, 4).toArray(), cycles.get(2).toArray());
    }

    @Test
    void testPermutationCycles_08() {
        // Given
        int[] permutation = new int[]{3, 6, 4, 1, 5, 2};
        // When
        ArrayList<ArrayList<Integer>> cycles = getPermutationCycles(permutation);
        // Then
        assertEquals(3, cycles.size());
        assertArrayEquals(List.of(3, 4, 1).toArray(), cycles.get(0).toArray());
        assertArrayEquals(List.of(6, 2).toArray(), cycles.get(1).toArray());
        assertArrayEquals(List.of(5).toArray(), cycles.get(2).toArray());
    }

    @Test
    void testPermutationCycles_id_8() {
        ArrayList<ArrayList<Integer>> cycles = getPermutationCycles(createIdentityPermutation(8));
        assertEquals(8, cycles.size());
        assertArrayEquals(List.of(1).toArray(), cycles.get(0).toArray());
        assertArrayEquals(List.of(2).toArray(), cycles.get(1).toArray());
        assertArrayEquals(List.of(3).toArray(), cycles.get(2).toArray());
        assertArrayEquals(List.of(4).toArray(), cycles.get(3).toArray());
        assertArrayEquals(List.of(5).toArray(), cycles.get(4).toArray());
        assertArrayEquals(List.of(6).toArray(), cycles.get(5).toArray());
        assertArrayEquals(List.of(7).toArray(), cycles.get(6).toArray());
        assertArrayEquals(List.of(8).toArray(), cycles.get(7).toArray());
    }

    @Test
    void testPermutationCycles_id_20() {
        ArrayList<ArrayList<Integer>> cycles = getPermutationCycles(createIdentityPermutation(20));
        assertEquals(20, cycles.size());
    }

    @Test
    void testGetCycleTypeOfPermutation_01() {
        // Given
        int[] permutation = new int[]{2, 4, 1, 3, 5, 7, 6};
        // When
        ArrayList<Integer> type = permutationCycleType(permutation);
        // Then
        assertArrayEquals(List.of(1, 2, 4).toArray(), type.toArray());
    }

    @Test
    void testGetCycleTypeOfPermutation_id() {
        // Given
        int[] id = createIdentityPermutation(4);
        // When
        ArrayList<Integer> type = permutationCycleType(id);
        // Then
        assertArrayEquals(List.of(1, 1, 1, 1).toArray(), type.toArray());
    }

    @Test
    void testGetCycleTypeOfPermutation_fixpunktfrei_01() {
        // see https://de.wikipedia.org/wiki/Fixpunktfreie_Permutation
        // Given
        int[] permutation = new int[]{3, 4, 2, 1};
        // When
        ArrayList<Integer> type = permutationCycleType(permutation);
        // Then
        assertArrayEquals(List.of(4).toArray(), type.toArray());
    }

    @Test
    void testGetCycleTypeOfPermutation_fixpunktfrei_02() {
        // see https://de.wikipedia.org/wiki/Fixpunktfreie_Permutation
        // Given
        int[] permutation = new int[]{2, 1, 4, 3};
        // When
        ArrayList<Integer> type = permutationCycleType(permutation);
        // Then
        assertArrayEquals(List.of(2, 2).toArray(), type.toArray());
    }

    @Test
    void testGetCycleTypeOfPermutation_transposition() {
        // Transpositionen = Vertauschung von genau zwei Elementen
        // Given
        int[] permutation = new int[]{1, 2, 4, 3};
        // When
        ArrayList<Integer> type = permutationCycleType(permutation);
        // Then
        assertArrayEquals(List.of(1, 1, 2).toArray(), type.toArray());
    }

    /*
        See  https://de.wikipedia.org/wiki/Selbstinverse_Permutation
        Eine Permutation genau dann selbstinvers, wenn ihre Zyklendarstellung
        ausschließlich aus Zyklen der Länge eins oder zwei besteht.
     */
    @Test
    void testGetCycleTypeOfPermutation_self_inverse_permutation() {
        // Given
        int[] permutation = new int[]{2, 1, 4, 3};
        // When
        ArrayList<Integer> type = permutationCycleType(permutation);
        System.out.println(type);
        // Then
        assertArrayEquals(List.of(2, 2).toArray(), type.toArray());
    }

    @Test
    void testArePermutationsInSameClass01() {
        // Given
        int[] permutation = new int[]{2, 1, 4, 3};
        int[] inverse = invertPermutation(permutation);
        // When
        boolean sameClass = arePermutationsInSameClass(permutation, inverse);
        // Then
        assertTrue(sameClass);
    }

    @Test
    void testArePermutationsInSameClass02() {
        // Given
        int[] permutation = new int[]{2, 1, 4, 3};
        int[] inverse = invertPermutation(permutation);
        // When
        boolean sameClass = arePermutationsInSameClass(permutation, inverse);
        // Then
        assertTrue(sameClass);
    }

    /*
    Komposition weist unabhängig von der Reihenfolge der Operanden den gleichen Zykeltyp auf.
     */
    @Test
    void testArePermutationsInSameClass_composed() {
        // Given
        int[] permutation1 = new int[]{2, 1, 4, 3};
        int[] permutation2 = new int[]{2, 3, 4, 1};
        var composed1 = composePermutations(permutation1, permutation2);
        var composed2 = composePermutations(permutation2, permutation1);
        // When
        boolean sameClass = arePermutationsInSameClass(composed1, composed2);
        // Then
        assertTrue(sameClass);
    }
}
