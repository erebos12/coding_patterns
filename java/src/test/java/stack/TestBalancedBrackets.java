package stack;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static stack.BalancedBrackets.bracketsBalanced;

public class TestBalancedBrackets {

    @ParameterizedTest
    @ValueSource(strings = {"[(])", "(", ")", "{}(", "{[(])}"})
    void testBalancedBrackets_all_false(String strings) {
        assertFalse(bracketsBalanced(strings));
    }

    @ParameterizedTest
    @ValueSource(strings = {"[()]{}{[()()]()}", "()", "()[]", "{[()]}"})
    void testBalancedBrackets_all_true(String strings) {
        assertTrue(bracketsBalanced(strings));
    }
}
