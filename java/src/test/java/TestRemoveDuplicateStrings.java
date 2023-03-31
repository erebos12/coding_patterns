import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static strings.RemoveDuplicateStrings.removeDuplicates;

public class TestRemoveDuplicateStrings {

    @Test
    void testRemoveDupStringsFromList() {
        List<String> l = List.of("1", "2", "3", "1", "2");
        l = removeDuplicates(l);
        assertEquals(3, l.size());
        assertEquals("1", l.get(0));
        assertEquals("2", l.get(1));
        assertEquals("3", l.get(2));
        List<Integer> l2 = List.of(1, 2, 3, 1, 2);
        l2 = removeDuplicates(l2);
        assertEquals(3, l2.size());
        assertEquals(1, l2.get(0));
        assertEquals(2, l2.get(1));
        assertEquals(3, l2.get(2));
    }
}
