import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static two_pointers.TwoPointers.isPairSum;

class TestTwoPointers {

    @Test
    void sumLowerUpper() {
        int[] arr = {2, 3, 5, 8, 9, 10, 11};
        boolean found = isPairSum(arr, 17);
        assertTrue(found);

        int[] arr2 = {2, 3, 5, 8, 9, 10, 16, 20, 33};
        found = isPairSum(arr2, 19);
        assertTrue(found);
    }
}



