package TwoSum;

import java.util.Arrays;

public class Solution {
    public static int[] twoSum(int[] nums, int target) {

        int indexes[] = new int[2];

        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    indexes[0] = i;
                    indexes[1] = j;
                }
            }
        }
        return indexes;
    }

    public static void main(String[] args) {
        int indexes[] = new int[4];
        indexes[0] = 2;
        indexes[1] = 5;
        indexes[2] = 5;
        indexes[3] = 11;

        System.out.println(Arrays.toString(twoSum(indexes, 10)));

    }

}
