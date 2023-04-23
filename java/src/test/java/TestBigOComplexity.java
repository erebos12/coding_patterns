import org.junit.jupiter.api.Test;

import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestBigOComplexity {

    @Test
    void big_o_log_of_n() {
        int n = 32;
        int nbrOfStep = 0;
        // 2^i = 32 => log(32) = 5, meaning 5 steps needed !
        // 2^i = 16 => log(16) = 4, meaning 4 steps needed !
        // 2^i = 8 => log(8) = 3, meaning 3 steps needed !
        for (int i = 1; i < n; i = i * 2) {
            nbrOfStep++;
        }
        System.out.println(nbrOfStep + " steps for " + n + " elements");
    }

    @Test
    void big_o_n_square() {
        int n = 10;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("> " + i + j);
            }
        }
    }

    @Test
    void testSet() {
        assertFalse(isUniqueChars("dddd"));
        assertTrue(isUniqueChars("Alex"));
    }

    boolean isUniqueChars(String s) {
        HashSet<Character> set = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);
            if (set.contains(c)) {
                return false;
            }
            set.add(c);
        }
        return true;
    }
}
