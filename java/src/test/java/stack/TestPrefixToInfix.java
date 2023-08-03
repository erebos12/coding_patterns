package stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static stack.PrefixToInfix.convert;

public class TestPrefixToInfix {

    @Test
    void testPrefixToInfix01() {
        String prefix = "*+AB-CD";
        String expectedInfix = "((A+B)*(C-D))";
        assertEquals(expectedInfix, convert(prefix));
    }

    @Test
    void testPrefixToInfix02() {
        String prefix = "*-A/BC-/AKL";
        String expectedInfix = "((A-(B/C))*((A/K)-L))";
        assertEquals(expectedInfix, convert(prefix));
    }

    @Test
    void testPrefixToInfix03() {
        String prefix = "+ab";
        String expectedInfix = "(a+b)";
        assertEquals(expectedInfix, convert(prefix));
    }
}
