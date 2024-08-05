import java.util.*;

class Main {
    public static void main(String[] args) {
        /*
         * Leet Code Easy Question #2
         * #9 Leet Code Question
         * Question: A palindrome is the same when reversed
         * Solution: Convert the number "x" into a String, then compare each character,
         * one starting from the start of the String and one starting from the end of
         * the String, they should always equal if it is a Palindrome, otherwise it is
         * not a Palindrome
         */
        int x = 121;
        System.out.println(isPalindrome(x));
    }

    public static boolean isPalindrome(int x) {
        String str = Integer.toString(x);
        char c = ' ';
        char c2 = ' ';
        int j = str.length() - 1;

        for (int i = 0; i < str.length(); i++) {
            c = str.charAt(i);
            c2 = str.charAt(j);
            j--;
            if (!(c == c2)) {
                return false;
            }
        }
        return true;
    };
}