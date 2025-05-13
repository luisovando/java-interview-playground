package com.luisovando.interview.addtwonumbers;

public class AddTwoNumbers {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int v1 = l1.val;
        int v2 = l2.val;

        int result = v1 + v2;

        return new ListNode(result);
    }
}
