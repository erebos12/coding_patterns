package strings;

public class StringCompression {

    public static String compressString(final String s) {
        if (s.length() == 1) {
            return s;
        }
        int left = 0;
        int right = left + 1;
        int count = 1;
        StringBuilder result = new StringBuilder();
        while (right < s.length()) {
            char c = s.charAt(left);
            char n = s.charAt(right);
            if (c == n) {
                count++;
                right++;
                if (right == s.length()) {
                    result.append(c).append(count);
                }
            } else {
                result.append(c).append(count);
                left = right;
                right++;
                count = 1;
            }
        }
        return result.length() < s.length() ? result.toString() : s;
    }
}
