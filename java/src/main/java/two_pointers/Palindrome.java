package two_pointers;

public class Palindrome {

    // Time complexity: O(1/2*n) ~ O(n)
    public static boolean isPalindrome(String s) {
        int start = 0;
        int end = s.length() - 1;
        while (start < end) {
            char charLeft = s.charAt(start);
            char charRight = s.charAt(end);
            if (Character.toLowerCase(charLeft) != Character.toLowerCase(charRight)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }


    // Time complexity: 4*O(n) = O(4n) ~ O(n)
    public static boolean isPalindrome2(String s) {
        StringBuilder sb = new StringBuilder(s); // O(n)
        String reversed = sb.reverse().toString(); // reverse = O(n) + toString = O(n)
        return reversed.equalsIgnoreCase(s); // equalsIgnoreCase = O(n)
    }
}
