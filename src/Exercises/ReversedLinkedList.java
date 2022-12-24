package Exercises;

import Exercises.models.ListNode;

public class ReversedLinkedList {
    public static void main(String[] args) {
        System.out.println(reverseList(new ListNode(1, new ListNode(2, new ListNode(2, new ListNode(3,
                new ListNode(6, new ListNode(4, new ListNode(5, new ListNode(6))))))))));
    }

    public static ListNode reverseList(ListNode head) {
        ListNode current = head, reversed = null;
        while (current != null) {
            ListNode next = current.next;
            current.next = reversed;
            reversed = current;
            current = next;
        }
        return reversed;
    }
}
