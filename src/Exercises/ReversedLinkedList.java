package Exercises;

public class ReversedLinkedList {
    public static void main(String[] args) {

    }

    public static ListNode reverseList(ListNode head) {
        ListNode reversed = null;
        ListNode current = head;

        while (current != null) {
            ListNode next = current.next;
            current.next = reversed;
            reversed = current;
            current = next;
        }
        return reversed;
    }
}
