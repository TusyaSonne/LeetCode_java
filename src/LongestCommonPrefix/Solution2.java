package LongestCommonPrefix;

import java.util.Arrays;

public class Solution2 {
    public static String longestCommonPrefix(String[] strs) {

        String answer = "";

        Arrays.sort(strs);

        String first = strs[0];
        String last = strs[strs.length - 1];

        for (int i = 0; i < Math.min(first.length(), last.length()); i++) {
            if (first.charAt(i) != last.charAt(i)) {
                return answer;
            }
            answer += first.charAt(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        String[] ans = new String[] {"flower","flow","flight"};
        System.out.println(longestCommonPrefix(ans));
    }
}
