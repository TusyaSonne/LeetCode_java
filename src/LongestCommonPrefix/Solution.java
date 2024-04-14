package LongestCommonPrefix;

import java.util.Arrays;

public class Solution {
    public static String longestCommonPrefix(String[] strs) {

        StringBuilder ans = new StringBuilder();
        Arrays.sort(strs); //ЕБАТЬ короче сделано для того чтобы потом можно было сразу понять одинаковые ли строки все или нет (они сортируются по азбуке, если равны первые и последние, то промежуточные тоже)
        String first = strs[0];
        String last = strs[strs.length-1];
        for (int i=0; i < Math.min(first.length(), last.length()); i++) {
            if (first.charAt(i) != last.charAt(i)) {
                return ans.toString();
            }
            ans.append(first.charAt(i));
        }
        return ans.toString();
    }

    public static void main(String[] args) {
        String[] ans = new String[] {"flower","flow","flight"};
        System.out.println(longestCommonPrefix(ans));
    }

}
