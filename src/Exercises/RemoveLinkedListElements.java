package Exercises;

public class RemoveLinkedListElements {
    public static void main(String[] args) {
        System.out.println(removeElements(new ListNode(1, new ListNode(6, new ListNode(2, new ListNode(3,
                new ListNode(6, new ListNode(4, new ListNode(5, new ListNode(6)))))))), 6));
    }

    public static ListNode removeElements(ListNode head, int val) {
        while (head != null && head.val == val) head = head.next;
        if (head == null) return null;
        ListNode result = head;
        while (result.next != null) {
            if (result.next.val == val) {
                result.next = result.next.next;
                continue;
            }
            result = result.next;
        }
        return head;
    }
}
