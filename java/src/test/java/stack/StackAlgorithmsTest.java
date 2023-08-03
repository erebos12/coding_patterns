package stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static stack.StackAlgorithms.infixToPostfix;

public class StackAlgorithmsTest {

    @Test
    void testInfixToPostfix01() {
        String infix = "A+B*C+D";
        String expectedPostfix = "ABC*+D+";
        assertEquals(expectedPostfix, infixToPostfix(infix));
    }

    @Test
    void testInfixToPostfix02() {
        String infix = "a+b*(c^d-e)^(f+g*h)-i";
        String expectedPostfix = "abcd^e-fgh*+^*+i-";
        assertEquals(expectedPostfix, infixToPostfix(infix));
    }

    @Test
    void testInfixToPostfix03() {
        String infix = "a+b*c";
        String expectedPostfix = "abc*+";
        assertEquals(expectedPostfix, infixToPostfix(infix));
    }

    @Test
    void testInfixToPostfix04() {
        String infix = "a*b+c";
        String expectedPostfix = "ab*c+";
        assertEquals(expectedPostfix, infixToPostfix(infix));
    }
}
