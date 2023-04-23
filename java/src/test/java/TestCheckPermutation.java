import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static strings.CheckPermutation.isPermutation;

public class TestCheckPermutation {

    @Test
    void testIsPermutation() {
        assertTrue(isPermutation("alex", "xlae"));
        assertTrue(isPermutation("alex", "xela"));
        assertTrue(isPermutation("ii", "ii"));
        assertFalse(isPermutation("alex", "lala"));
        assertFalse(isPermutation("alex", "alexa"));
        assertFalse(isPermutation("iii", "ooo"));
    }
}
