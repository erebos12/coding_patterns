package heaps;

import org.junit.jupiter.api.Test;

import static heaps.TwoHeapsCapitalProblem.maximumCapital;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TwoHeapsCapitalProblemTest {

    @Test
    void testMaximumCapital01() {
        int k = 2;
        int c = 1;
        int[] capitals = {1, 2, 3};
        int[] profits = {2, 3, 5};
        assertEquals(8, maximumCapital(c, k, capitals, profits));
    }

    @Test
    void testMaximumCapital02() {
        int k = 1;
        int c = 3;
        int[] capitals = {0, 2, 3, 4};
        int[] profits = {7, 3, 5, 2};
        assertEquals(10, maximumCapital(c, k, capitals, profits));
    }

    @Test
    void testMaximumCapital03() {
        int k = 2;
        int c = 1;
        int[] capitals = {1, 2, 2, 3};
        int[] profits = {2, 4, 6, 8};
        assertEquals(11, maximumCapital(c, k, capitals, profits));
    }

    @Test
    void testMaximumCapital04() {
        int k = 3;
        int c = 2;
        int[] capitals = {1, 2, 3, 4};
        int[] profits = {1, 3, 5, 7};
        assertEquals(17, maximumCapital(c, k, capitals, profits));
    }

    @Test
    void testMaximumCapital05() {
        int k = 3;
        int c = 2;
        int[] capitals = {1, 3, 4, 5, 6};
        int[] profits = {1, 2, 3, 4, 5};
        assertEquals(9, maximumCapital(c, k, capitals, profits));
    }
}
