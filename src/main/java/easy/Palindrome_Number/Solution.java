package easy.Palindrome_Number;

import java.util.Objects;

public class Solution {
    public static boolean isPalindrome(int x) {
        StringBuilder sb = new StringBuilder(Integer.toString(x));
        return sb.toString().equals(sb.reverse().toString());
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(-121));
        System.out.println(isPalindrome(10));

    }
}
