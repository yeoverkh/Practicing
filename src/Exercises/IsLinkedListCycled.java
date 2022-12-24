package Exercises;

import Exercises.models.ListNode;

public class IsLinkedListCycled {
    public static void main(String[] args) {
        ListNode head = new ListNode(5);
        ListNode second = new ListNode(3);
        ListNode third = new ListNode(2);
        ListNode fourth = new ListNode(3);
        ListNode fifth = new ListNode(3);
        head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = third;
        System.out.println(hasCycle(head));
    }


    public static boolean hasCycle(ListNode head) {
        if (head == null) return false;
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) return true;
        }
        return false;
    }
}
