package stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static stack.PrefixToPostfix.convert;

public class TestPrefixToPostfix {

    @Test
    void testPrefixToPostfix01() {
        String prefix = "*+AB-CD";
        String expectedPostfix = "AB+CD-*";
        assertEquals(expectedPostfix, convert(prefix));
    }

    @Test
    void testPrefixToPostfix02() {
        String prefix = "*-A/BC-/AKL";
        String expectedPostfix = "ABC/-AK/L-*";
        assertEquals(expectedPostfix, convert(prefix));
    }

    @Test
    void testPrefixToPostfix03() {
        String prefix = "+A*B/C-EF";
        String expectedPostfix = "ABCEF-/*+";
        assertEquals(expectedPostfix, convert(prefix));
    }
}
