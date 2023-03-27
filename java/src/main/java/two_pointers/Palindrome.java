package two_pointers;

public class Palindrome {

    // Time complexity: O(1/2*n) = O(n)
    public static boolean isPalindrome(String s) {
        char[] chars = s.toCharArray();
        int nbrSteps = 0;
        int start = 0;
        int end = chars.length - 1;
        while (start < end) {
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

}
