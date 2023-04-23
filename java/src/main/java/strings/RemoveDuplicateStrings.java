package strings;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;

public class RemoveDuplicateStrings {

    public static <T> List<T> removeDuplicates(List<T> list) {
        // LinkedHashSet preserves the order
        return new ArrayList<>(new LinkedHashSet<>(list));
    }

    public static <String> void removeDuplicates2(String[] list) {
        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < list.length; i++) {
            set.add(list[i]);
        }
        
    }
}
