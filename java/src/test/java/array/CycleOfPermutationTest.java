package array;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static arrays.Permutation.createIdentityPermutation;
import static arrays.Permutation.getPermutationCycles;
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
        ArrayList<Integer> cycle1 = new ArrayList<>(Arrays.asList(3, 2, 4, 1));
        ArrayList<ArrayList<Integer>> expected = new ArrayList<>();
        expected.add(cycle1);
        assertArrayEquals(expected.get(0).toArray(), cycles.get(0).toArray());
    }


    @Test
    void testPermutationCycles_02() {
        // Given
        int[] permutation = new int[]{3, 1, 2, 4};
        // When
        ArrayList<ArrayList<Integer>> cycles = getPermutationCycles(permutation);
        // Then
        assertEquals(1, cycles.size());
        ArrayList<Integer> cycle1 = new ArrayList<>(Arrays.asList(3, 2, 1));
        ArrayList<ArrayList<Integer>> expected = new ArrayList<>();
        expected.add(cycle1);
        assertArrayEquals(expected.get(0).toArray(), cycles.get(0).toArray());
    }

    @Test
    void testPermutationCycles_03() {
        // Given
        int[] permutation = new int[]{3, 4, 1, 2};
        // When
        ArrayList<ArrayList<Integer>> actual = getPermutationCycles(permutation);
        // Then
        assertEquals(2, actual.size());
        ArrayList<Integer> cycle1 = new ArrayList<>(Arrays.asList(3, 1));
        ArrayList<Integer> cycle2 = new ArrayList<>(Arrays.asList(4, 2));
        ArrayList<ArrayList<Integer>> expected = new ArrayList<>();
        expected.add(cycle1);
        expected.add(cycle2);
        assertArrayEquals(expected.get(0).toArray(), actual.get(0).toArray());
        assertArrayEquals(expected.get(1).toArray(), actual.get(1).toArray());
    }


    @Test
    void testPermutationCycles_04() {
        // Given
        int[] permutation = new int[]{1, 4, 2, 3};
        // When
        ArrayList<ArrayList<Integer>> cycles = getPermutationCycles(permutation);
        // Then
        assertEquals(1, cycles.size());
        ArrayList<Integer> cycle1 = new ArrayList<>(Arrays.asList(4, 3, 2));
        ArrayList<ArrayList<Integer>> expected = new ArrayList<>();
        expected.add(cycle1);
        assertArrayEquals(expected.get(0).toArray(), cycles.get(0).toArray());
    }

    @Test
    void testPermutationCycles_05() {
        // Given
        int[] permutation = new int[]{5, 3, 4, 1, 2};
        // When
        ArrayList<ArrayList<Integer>> cycles = getPermutationCycles(permutation);
        // Then
        assertEquals(1, cycles.size());
        ArrayList<Integer> cycle1 = new ArrayList<>(Arrays.asList(5, 2, 3, 4, 1));
        ArrayList<ArrayList<Integer>> expected = new ArrayList<>();
        expected.add(cycle1);
        assertArrayEquals(expected.get(0).toArray(), cycles.get(0).toArray());
    }

    @Test
    void testPermutationCycles_06() {
        // Given
        int[] permutation = new int[]{1, 3, 2, 4, 5};
        // When
        ArrayList<ArrayList<Integer>> cycles = getPermutationCycles(permutation);
        // Then
        assertEquals(1, cycles.size());
        ArrayList<Integer> cycle1 = new ArrayList<>(Arrays.asList(3, 2));
        ArrayList<ArrayList<Integer>> expected = new ArrayList<>();
        expected.add(cycle1);
        assertArrayEquals(expected.get(0).toArray(), cycles.get(0).toArray());
    }

    @Test
    void testPermutationCycles_07() {
        // Given
        int[] permutation = new int[]{1, 3, 2, 5, 4};
        // When
        ArrayList<ArrayList<Integer>> actual = getPermutationCycles(permutation);
        // Then
        assertEquals(2, actual.size());
        ArrayList<Integer> cycle1 = new ArrayList<>(Arrays.asList(3, 2));
        ArrayList<Integer> cycle2 = new ArrayList<>(Arrays.asList(5, 4));
        ArrayList<ArrayList<Integer>> expected = new ArrayList<>();
        expected.add(cycle1);
        expected.add(cycle2);
        var ec1 = expected.get(0);
        assertArrayEquals(ec1.toArray(), actual.get(0).toArray());
        var ec2 = expected.get(1);
        assertArrayEquals(ec2.toArray(), actual.get(1).toArray());
    }

    @Test
    void testPermutationCycles_08() {
        // Given
        int[] permutation = new int[]{3, 6, 4, 1, 5, 2};
        // When
        ArrayList<ArrayList<Integer>> actual = getPermutationCycles(permutation);
        // Then
        assertEquals(2, actual.size());
        ArrayList<Integer> cycle1 = new ArrayList<>(Arrays.asList(3, 4, 1));
        ArrayList<Integer> cycle2 = new ArrayList<>(Arrays.asList(6, 2));
        ArrayList<ArrayList<Integer>> expected = new ArrayList<>();
        expected.add(cycle1);
        expected.add(cycle2);
        var ec1 = expected.get(0);
        assertArrayEquals(ec1.toArray(), actual.get(0).toArray());
        var ec2 = expected.get(1);
        assertArrayEquals(ec2.toArray(), actual.get(1).toArray());
    }

    @Test
    void testPermutationCycles_id_8() {
        ArrayList<ArrayList<Integer>> cycles = getPermutationCycles(createIdentityPermutation(8));
        assertEquals(0, cycles.size());
    }

    @Test
    void testPermutationCycles_id_20() {
        ArrayList<ArrayList<Integer>> cycles = getPermutationCycles(createIdentityPermutation(20));
        assertEquals(0, cycles.size());
    }
}
