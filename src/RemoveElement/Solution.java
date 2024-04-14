package RemoveElement;
import java.util.Arrays;
import java.util.stream.IntStream;
public class Solution {
    public static int removeElement(int[] nums, int val) {

        int count = nums.length;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                nums[i] = Arrays.stream(nums).max().getAsInt() + i;
                count -= 1;
            }
        }
        Arrays.sort(nums);
        return count;
    }

    public static void main(String[] args) {
        int[] numbers = {0,1,2,2,3,0,4,2};
        int val = 2;

        System.out.println(removeElement(numbers, val));
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}
