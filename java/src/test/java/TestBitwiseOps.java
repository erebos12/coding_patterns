import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestBitwiseOps {

    /*
      In general, left shifting a number by n positions is equivalent to multiplication by 2^n.
    */
    int multiplyBy2(final int value) {
        // 2^1 = 2, so value x 2
        return value << 1;
    }

    int multiplyBy4(final int value) {
        // 2^2 = 4, so value x 4
        return value << 2;
    }

    int bitwiseOR(int number1, int number2) {
        return number1 | number2;
    }

    int bitwiseAND(int number1, int number2) {
        return number1 & number2;
    }

    int bitwiseXOR(int number1, int number2) {
        return number1 ^ number2;
    }

    @Test
    void testMultiplyBy2() {
        assertEquals(multiplyBy2(12), 24);
        assertEquals(multiplyBy2(2), 4);
        assertEquals(multiplyBy2(-2), -4);
        assertEquals(multiplyBy4(2), 8);
        assertEquals(multiplyBy4(4), 16);
        /*
        The binary equivalent of 12 is 00001100.
        After shifting to the left by 2 places, the result is 00110000,
        which is equivalent to 48 in decimal.
         */
        assertEquals(multiplyBy4(12), 48);
    }

    @Test
    void testBitwiseOR() {
        // 10 OR 10 = 10
        assertEquals(bitwiseOR(2, 2), 2);
        // 11 OR 10 = 11
        assertEquals(bitwiseOR(3, 2), 3);
        /*
           01100 = 12
           11001 = 25
           ------
           11101 = 29
         */
        assertEquals(bitwiseOR(12, 25), 29);
    }

    @Test
    void testBitwiseAND() {
        // 10 AND 10 = 10
        assertEquals(bitwiseAND(2, 2), 2);
        // 11 AND 10 = 10
        assertEquals(bitwiseAND(3, 2), 2);
        /*
           01100 = 12
           11001 = 25
           ------
           01000 = 8
         */
        assertEquals(bitwiseAND(12, 25), 8);
    }

    @Test
    void testBitwiseXOR() {
        // 10 XOR 10 = 00
        assertEquals(bitwiseXOR(2, 2), 0);
        // 11 XOR 10 = 01
        assertEquals(bitwiseXOR(3, 2), 1);
        /*
           01100 = 12
           11001 = 25
           ------
           10101 = 21
         */
        assertEquals(bitwiseXOR(12, 25), 21);
    }
}
