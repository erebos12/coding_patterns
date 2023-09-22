package array;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static arrays.Permutation.getPermutationCycles;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CycleOfPermutationTest {

    @Test
    void testPermutationCycles_01() {
        int[] permutation = new int[]{3, 4, 2, 1};
        ArrayList<ArrayList<Integer>> cycles = getPermutationCycles(permutation);
        assertEquals(1, cycles.size());
        var cycle = cycles.get(0);
        assertEquals(3, cycle.get(0));
        assertEquals(2, cycle.get(1));
        assertEquals(4, cycle.get(2));
        assertEquals(1, cycle.get(3));
    }


    @Test
    void testPermutationCycles_02() {
        int[] permutation = new int[]{3, 1, 2, 4};
        ArrayList<ArrayList<Integer>> cycles = getPermutationCycles(permutation);
        assertEquals(1, cycles.size());
        var cycle = cycles.get(0);
        assertEquals(3, cycle.get(0));
        assertEquals(2, cycle.get(1));
        assertEquals(1, cycle.get(2));
    }

    @Test
    void testPermutationCycles_03() {
        int[] permutation = new int[]{3, 4, 1, 2};
        ArrayList<ArrayList<Integer>> cycles = getPermutationCycles(permutation);
        assertEquals(2, cycles.size());
        var cycle1 = cycles.get(0);
        assertEquals(3, cycle1.get(0));
        assertEquals(1, cycle1.get(1));
        var cycle2 = cycles.get(1);
        assertEquals(4, cycle2.get(0));
        assertEquals(2, cycle2.get(1));
    }


    @Test
    void testPermutationCycles_04() {
        int[] permutation = new int[]{1, 4, 2, 3};
        ArrayList<ArrayList<Integer>> cycles = getPermutationCycles(permutation);
        assertEquals(1, cycles.size());
        var cycle = cycles.get(0);
        assertEquals(4, cycle.get(0));
        assertEquals(3, cycle.get(1));
        assertEquals(2, cycle.get(2));
    }

    @Test
    void testPermutationCycles_05() {
        int[] permutation = new int[]{5, 3, 4, 1, 2};
        ArrayList<ArrayList<Integer>> cycles = getPermutationCycles(permutation);
        assertEquals(1, cycles.size());
        var cycle = cycles.get(0);
        assertEquals(5, cycle.get(0));
        assertEquals(2, cycle.get(1));
        assertEquals(3, cycle.get(2));
        assertEquals(4, cycle.get(3));
        assertEquals(1, cycle.get(4));
    }

    @Test
    void testPermutationCycles_06() {
        int[] permutation = new int[]{1, 3, 2, 4, 5};
        ArrayList<ArrayList<Integer>> cycles = getPermutationCycles(permutation);
        assertEquals(1, cycles.size());
        var cycle = cycles.get(0);
        assertEquals(3, cycle.get(0));
        assertEquals(2, cycle.get(1));
    }

    @Test
    void testPermutationCycles_07() {
        int[] permutation = new int[]{1, 3, 2, 5, 4};
        ArrayList<ArrayList<Integer>> cycles = getPermutationCycles(permutation);
        assertEquals(2, cycles.size());
        var cycle1 = cycles.get(0);
        assertEquals(3, cycle1.get(0));
        assertEquals(2, cycle1.get(1));
        var cycle2 = cycles.get(1);
        assertEquals(5, cycle2.get(0));
        assertEquals(4, cycle2.get(1));
    }

    @Test
    void testPermutationCycles_08() {
        int[] permutation = new int[]{3, 6, 4, 1, 5, 2};
        ArrayList<ArrayList<Integer>> cycles = getPermutationCycles(permutation);
        assertEquals(2, cycles.size());
        var cycle1 = cycles.get(0);
        assertEquals(3, cycle1.get(0));
        assertEquals(4, cycle1.get(1));
        assertEquals(1, cycle1.get(2));
        var cycle2 = cycles.get(1);
        assertEquals(6, cycle2.get(0));
        assertEquals(2, cycle2.get(1));
    }

    @Test
    void testPermutationCycles_id() {
        int[] permutation = new int[]{1, 2, 3, 4};
        ArrayList<ArrayList<Integer>> cycles = getPermutationCycles(permutation);
        assertEquals(0, cycles.size());
    }
}
