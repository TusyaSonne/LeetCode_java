package MergeTwoSortedLists;

import java.util.List;

public class Solution {
    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        if (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                list1.next = mergeTwoLists(list1.next, list2);
                return list1;
                // мы сохраняем наименьшее из двух текущих значений узла и идём дальше соединять список из того, что осталось
            }
            else {
                list2.next = mergeTwoLists(list1, list2.next);
                return list2;
            }
        }
        if (list1 == null) {
            return list2;
        }
        else {
            return list2;
        }
    }

    public static void main(String[] args) {
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(3);
        list1.next.next = new ListNode(5);
//        list1.next.next.next = new ListNode(6);


        ListNode list2 = new ListNode(1);
        list2.next = new ListNode(2);
        list2.next.next = new ListNode(7);
//        list2.next.next.next = new ListNode(6);
//        list2.next.next.next.next = new ListNode(7);
//        list2.next.next.next.next.next = new ListNode(8);
//        list2.next.next.next.next.next.next = new ListNode(9);

        System.out.println(mergeTwoLists(list1,list2));
    }
}
