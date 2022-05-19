import org.junit.jupiter.api.Test;

import static missing_number.FindMissingNumber.findOneMissingNumber;
import static missing_number.FindMissingNumber.sumOfArray;
import static org.junit.jupiter.api.Assertions.assertEquals;

class TestMissingNumber {

    @Test
    void testSumOfArray() {
        int[] array = {1, 3};
        assertEquals(4, sumOfArray(array));
        array = new int[]{1, 3, 4, 5, 7, 8, 2};
        assertEquals(30, sumOfArray(array));
        array = new int[]{1, 3, 4};
        assertEquals(8, sumOfArray(array));
        array = new int[]{};
        assertEquals(0, sumOfArray(array));
    }

    @Test
    void testMissingNumber() {
        int[] array = {1, 3};
        assertEquals(2, findOneMissingNumber(array));
        array = new int[]{1, 3, 4, 5, 7, 8, 2};
        assertEquals(6, findOneMissingNumber(array));
        array = new int[]{1, 3, 2, 5};
        assertEquals(4, findOneMissingNumber(array));
    }


}
