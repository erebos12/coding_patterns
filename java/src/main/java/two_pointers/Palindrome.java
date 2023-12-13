package two_pointers;

public class Palindrome {

    // Time complexity: O(n) + O(1/2*n) ~ O(n)
    public static boolean isPalindrome(String s) {
        char[] chars = s.toCharArray(); // O(n)
        int nbrSteps = 0;
        int start = 0;
        int end = chars.length - 1;
        while (start < end) { // O(n/2)
            nbrSteps++;
            String charLeft = String.valueOf(chars[start]);
            String charRight = String.valueOf(chars[end]);
            if (!charLeft.equalsIgnoreCase(charRight)) {
                return false;
            }
            start++;
            end--;
        }
        System.out.println(nbrSteps + " steps for " + s.length() + " elements");
        return true;
    }

    // Time complexity: 4*O(n) = O(4n) ~ O(n)
    public static boolean isPalindrome2(String s) {
        StringBuilder sb = new StringBuilder(s); // O(n)
        String reversed = sb.reverse().toString(); // reverse = O(n) + toString = O(n)
        return reversed.equalsIgnoreCase(s); // equalsIgnoreCase = O(n)
    }
}
