package ValidParentheses;

import java.awt.desktop.SystemSleepEvent;
import java.util.*;

public class Solution {
    public boolean isValid(String s) {
        boolean isTrue = false;
//        for (int i = 1; i < s.length(); i++) {
//            if (s.charAt(i-1) == '{') {
//                if (s.charAt(i) == '}') {
//                    isTrue = true;
//                }
//                else {
//                    isTrue = false;
//                    break;
//                }
//            }
//            else if (s.charAt(i-1) == '[') {
//                if (s.charAt(i) == ']') {
//                    isTrue = true;
//                }
//                else {
//                    isTrue = false;
//                    break;
//                }
//            }
//            else if (s.charAt(i-1) == '(') {
//                if (s.charAt(i) == ')') {
//                    isTrue = true;
//                }
//                else {
//                    isTrue = false;
//                    break;
//                }
//            }
//        }
//        return isTrue;


        Stack<Character> stack = new Stack<>();


        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.push(')');
            }
            else if (c == '{') {
                stack.push('}');
            }
            else if (c == '[') {
                stack.push(']');
            }
            else if (stack.isEmpty() || stack.pop() != c) {
                return false;
            }
        }
        return stack.isEmpty();
    }




//        Deque<Character> deque = new ArrayDeque<>();
//        for (int i=0; i < s.length(); i++) {
//            deque.add(s.charAt(i));
//        }
//        for (int i=0; i < deque.size(); i++) {
//            if (deque.peekFirst() == deque.peekLast()) {
//                char first = deque.pollFirst();
//                char last = deque.pollLast();
//                isTrue = true;
//            }
//            else {
//                isTrue = false;
//                break;
//            }
//        }
//        return isTrue;

    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "(";
        System.out.println(solution.isValid(s));
//        Deque<Character> deque = new ArrayDeque();
//        for (int i=0; i < s.length(); i++) {
//            deque.add(s.charAt(i));
//        }
//        for (int i=0; i < deque.size(); i++) {
//            System.out.println(deque.pollFirst());
//            System.out.println(deque.pollLast());
//        }

    }
}
