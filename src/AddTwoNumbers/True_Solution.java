package AddTwoNumbers;

import java.util.List;

public class True_Solution {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode resultedList = new ListNode(0);
        ListNode tail = resultedList;
        int carry = 0;
        while (l1 != null || l2 != null || carry != 0) {
            int digit1 = 0;
            int digit2 = 0;
            if (l1 != null) {
                digit1 = l1.val;
            }
            if (l2 != null) {
                digit2 = l2.val;
            }
            int sum = digit1 + digit2 + carry;
            int sumToAdd = sum % 10;
            carry = sum / 10;
            ListNode resultNode = new ListNode(sumToAdd);
            tail.next = resultNode;
            tail = resultNode;

            if (l1 != null) {
                l1 = l1.next;
            }
            if (l2 != null) {
                l2 = l2.next;
            }
        }
        ListNode result = resultedList.next;
        resultedList.next = null;
        return result;
    }

    public static void main(String[] args) {
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(8);
//        list1.next.next.next = new ListNode(6);


        ListNode list2 = new ListNode(0);
//        list2.next.next.next = new ListNode(6);
//        list2.next.next.next.next = new ListNode(7);
//        list2.next.next.next.next.next = new ListNode(8);
//        list2.next.next.next.next.next.next = new ListNode(9);

        ListNode result = addTwoNumbers(list1, list2);
        printNode(result);
    }

    public static void printNode(ListNode list) {
        while (list != null) {
            System.out.print(list.val + " ");
            list = list.next;
        }
    }

}
