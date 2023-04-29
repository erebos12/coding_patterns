import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static strings.StringCompression.compressString;

public class TestStringCompression {

    @Test
    void testStringCompression() {
        assertEquals("a", compressString("a"));
        assertEquals("aa", compressString("aa"));
        assertEquals("a4", compressString("aaaa"));
        assertEquals("aabs", compressString("aabs"));
        assertEquals("a2b1c4a3", compressString("aabccccaaa"));
        assertEquals("b5s3", compressString("bbbbbsss"));
        assertEquals("aabbcc", compressString("aabbcc"));
        assertEquals("a2b5", compressString("aabbbbb"));
        assertEquals("abc", compressString("abc"));
    }
}
