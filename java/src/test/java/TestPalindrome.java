import static org.junit.jupiter.api.Assertions.assertEquals;
import static two_pointers.Palindrome.isPalindrome;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class TestPalindrome {


  @ParameterizedTest
  @CsvSource({
      "'', true",                // leerer String
      "'a', true",               // einzelner Buchstabe
      "'radar', true",           // Palindrom
      "'reliefeiler', true",     // Palindrom
      "'hello', false",          // kein Palindrom
      "'Racecar', true",         // Palindrom mit gemischter Groß-/Kleinschreibung
      "'12321', true",           // numerisches Palindrom
      "'12345', false"           // keine numerische Palindrom
  })
  void testPalindrome(String input, boolean expected) {
    assertEquals(expected, isPalindrome(input));
  }
}
