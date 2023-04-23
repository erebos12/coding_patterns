package strings;

public class CheckPermutation {

    public static boolean isPermutation(final String s1, final String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        int sumS1 = 0;
        for (int i = 0; i < s1.length(); i++) {
            sumS1 += s1.charAt(i);
        }
        int sumS2 = 0;
        for (int i = 0; i < s2.length(); i++) {
            sumS2 += s2.charAt(i);
        }
        String msg = "s1:%s s2=%s".formatted(sumS1, sumS2);
        System.out.println(msg);
        return sumS1 == sumS2;
    }
}
