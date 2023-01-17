package easy.Longest_Common_Prefix;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Solution {

    public static String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder("");
        for (int i = 0; i < strs.length; i++)  {
            for (int j = 0; j < strs[i].length(); j++) {
                System.out.println(strs[i].charAt(i));

            }
        }
        System.out.println(sb);
        return "end";
    }

    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[]{"flower", "flow", "flight"}));
        System.out.println(longestCommonPrefix(new String[]{"dog","racecar","car"}));
    }

}
