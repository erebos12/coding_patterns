package stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static stack.PrefixToInfix.prefixToInfix;

public class TestPrefixToInfix {

    @Test
    void testPrefixToInfix01() {
        String prefix = "*+AB-CD";
        String expectedInfix = "((A+B)*(C-D))";
        assertEquals(expectedInfix, prefixToInfix(prefix));
    }

    @Test
    void testPrefixToInfix02() {
        String prefix = "*-A/BC-/AKL";
        String expectedInfix = "((A-(B/C))*((A/K)-L))";
        assertEquals(expectedInfix, prefixToInfix(prefix));
    }
}
