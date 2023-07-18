import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static two_pointers.Palindrome.isPalindrome;

public class TestPalindrome {

    @Test
    void testPalindrome() {
        assertTrue(isPalindrome("relieffeiler"));
        assertTrue(isPalindrome("anna"));
        assertTrue(isPalindrome("Otto"));
        assertTrue(isPalindrome("OttTo"));
        assertFalse(isPalindrome("Alexa"));
        assertTrue(isPalindrome("mmmmmmm"));
        assertTrue(isPalindrome("iiiiiiiiiiiiiiii"));
        assertTrue(isPalindrome("iiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii"));
        assertFalse(isPalindrome("hgj"));
    }
}
