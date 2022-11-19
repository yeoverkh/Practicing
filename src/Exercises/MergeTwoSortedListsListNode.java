package Exercises;

import java.util.*;

public class MergeTwoSortedListsListNode {
    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode listNode2 = new ListNode(1, new ListNode(3, new ListNode(4)));
        System.out.println(listNode1);
        System.out.println(listNode2);
        System.out.println(mergeTwoLists(listNode1, listNode2));
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null) return list2;
        if (list2 == null) return list1;
        ListNode dummy = new ListNode(0), result = dummy;
        while (list1 != null && list2 != null) {
            if (list1.val > list2.val) {
                result.next = list2;
                list2 = list2.next;
            } else {
                result.next = list1;
                list1 = list1.next;
            }
            result = result.next;
        }
        if (list1 == null) result.next = list2;
        if (list2 == null) result.next = list1;
        return dummy.next;
    }

}
