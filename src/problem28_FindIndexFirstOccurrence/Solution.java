package problem28_FindIndexFirstOccurrence;

public class Solution {
    public static int strStr(String haystack, String needle) {
        if (haystack.contains(needle)) {
            return haystack.indexOf(needle);
        }
        return -1;
    }

    public static void main(String[] args) {
        String str1 = "leetcode";
        String str2 = "leeto";
        System.out.println(strStr(str1, str2));
    }
}
