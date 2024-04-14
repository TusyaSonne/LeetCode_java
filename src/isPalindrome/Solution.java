package isPalindrome;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Solution {
    public static boolean isPalindrome(int x) {
        Stack<Integer> stack = new Stack<>();
        Queue<Integer> queue = new LinkedList<>();

        boolean isP = false;
        int temp = 0;

        if (x < 0) {
            return isP;
        }
        if (x == 0) {
            isP = true;
            return isP;
        }
        while (x != 0) {
            temp = x % 10;
            stack.push(x % 10);
            queue.add(x % 10);
            x = x / 10;
        }
        while (!stack.isEmpty() && !queue.isEmpty()) {
            if (stack.pop() == queue.poll()) {
                isP = true;
            }
            else {
                isP = false;
                break;
            }
        }
        return isP;
    }

    public static void main(String[] args) {
        int x = 0;
        System.out.println(isPalindrome(x));
    }
}
