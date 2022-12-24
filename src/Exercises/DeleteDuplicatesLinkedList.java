package Exercises;

import Exercises.models.ListNode;

public class DeleteDuplicatesLinkedList {
    public static void main(String[] args) {
        System.out.println(removeDuplicates(new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(3,
                new ListNode(3, new ListNode(4, new ListNode(5, new ListNode(5))))))))));
    }

    public static ListNode removeDuplicates(ListNode head) {
        while (head != null && head.next != null && head.val == head.next.val) {
            head = head.next;
        }
        if (head == null) return null;
        ListNode current = head;
        while (current.next != null) {
            if (current.val == current.next.val) {
                current.next = current.next.next;
                continue;
            }
            current = current.next;
        }
        return head;
    }
}
