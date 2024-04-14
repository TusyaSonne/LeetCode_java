package longest_substring;

import java.util.HashSet;
import java.util.Set;

import static java.lang.Math.max;

public class Solution {
    public static int lengthOfLongestSubstring(String s) {
        Set<Character> sequence = new HashSet<>();

        int maxcount = 0;
        int count = 0;
        String s_help = "";
        for (int i = 0; i < s.length(); i++) {
            if (sequence.contains(s.charAt(i))) {

                i = i - sequence.size() + 1;

                s_help = "";
                sequence.clear();
                count = 0;
            }
            sequence.add(s.charAt(i));
            s_help += s.charAt(i);
            count+= 1;
            maxcount = max(maxcount, count);
        }
        return maxcount;
    }

    public static void main(String[] args) {
        String s = "bcdefazvghma894";
        System.out.println(lengthOfLongestSubstring(s));
    }
}
