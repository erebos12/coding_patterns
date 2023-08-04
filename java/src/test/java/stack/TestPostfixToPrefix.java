package stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static stack.PostfixToPrefix.convert;

public class TestPostfixToPrefix {

    @Test
    void testPostfixToPrefix01() {
        String postfix = "AB+CD-*";
        String expectedPrefix = "*+AB-CD";
        assertEquals(expectedPrefix, convert(postfix));
    }

    @Test
    void testPostfixToPrefix02() {
        String postfix = "ABC/-AK/L-*";
        String expectedPrefix = "*-A/BC-/AKL";
        assertEquals(expectedPrefix, convert(postfix));
    }

    @Test
    void testPostfixToPrefix03() {
        String postfix = "ABC*+D+";
        String expectedPrefix = "++A*BCD";
        assertEquals(expectedPrefix, convert(postfix));
    }
    
    @Test
    void testPostfixToPrefix04() {
        String postfix = "AB+C+D+";
        String expectedPrefix = "+++ABCD";
        assertEquals(expectedPrefix, convert(postfix));
    }
}
