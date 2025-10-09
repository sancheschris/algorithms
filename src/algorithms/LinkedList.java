package algorithms;

import java.util.ArrayList;
import java.util.List;

public class LinkedList {


    public static void main(String[] args) {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, null)));
        ListNode reversedHead = reverseList(head);
        System.out.println(reversedHead); // 3

        ListNode head2 = new ListNode(1, new ListNode(2, new ListNode(3, null)));
        ListNode reversedHead2 = reverseListBruteForce(head2);

        for (ListNode curr = reversedHead2; curr != null; curr = curr.next) {
            System.out.print(curr.val + " ");
        }
    }

    public static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode temp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = temp;
        }
        return prev;
    }

    public static ListNode reverseListBruteForce(ListNode head) {

        List<Integer> values = new ArrayList<>();
        ListNode curr = head;

        while (curr != null) {
            values.add(curr.val);
            curr = curr.next;
        }

        ListNode newHead = null;
        for (int i = values.size() - 1; i >= 0; i--) {
            newHead = new ListNode(values.get(i), newHead);
        }
        return newHead;
    }

    static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }

        @Override
        public String toString() {
            return "ListNode{" +
                    "val=" + val +
                    ", next=" + next +
                    '}';
        }
    }
}
