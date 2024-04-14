package AddTwoNumbers;

public class Solution {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        if (l1 != null && l2 != null) {
            ListNode result = new ListNode();
            result.val = l1.val + l2.val;
            if (result.val >= 10) {
                if (l2.next == null) {
                    l2.next = new ListNode();
                }

                l2.next.val += 1;
                if (l2.next.val == 10 && l2.next.next == null) {
                    l2.next.val = 0;
                    l2.next.next = new ListNode(1);
                }
            }

            l2.val = result.val % 10;
            addTwoNumbers(l1.next, l2.next);

        }
        return l2;
    }

    public static void main(String[] args) {
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(8);
        list1.next.next = new ListNode(3);
//        list1.next.next.next = new ListNode(6);


        ListNode list2 = new ListNode(0);
        list2.next = new ListNode(6);
        list2.next.next = new ListNode(4);
//        list2.next.next.next = new ListNode(6);
//        list2.next.next.next.next = new ListNode(7);
//        list2.next.next.next.next.next = new ListNode(8);
//        list2.next.next.next.next.next.next = new ListNode(9);

        addTwoNumbers(list1,list2);
        printNode(list2);
    }

    public static void printNode(ListNode list) {
        while (list != null) {
            System.out.print(list.val + " ");
            list = list.next;
        }
    }
}
