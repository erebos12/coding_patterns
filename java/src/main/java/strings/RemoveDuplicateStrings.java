package strings;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.function.Predicate;

public class RemoveDuplicateStrings {

    public static <T> List<T> removeDuplicates(List<T> list) {
        // LinkedHashSet preserves the order
        return new ArrayList<>(new LinkedHashSet<>(list));
    }

    public static <String> void removeDuplicates2(List<String> list) {

    }
}
