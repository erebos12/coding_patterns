package array;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static arrays.Permutation.*;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

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
}
