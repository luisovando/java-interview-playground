package com.luisovando.interview.addtwonumbers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AddTwoNumbersTest {

    @Test
    public void testSingleDigitAdditionWithoutCarry() {
        ListNode l1 = new ListNode(2);
        ListNode l2 = new ListNode(3);

        ListNode result = AddTwoNumbers.addTwoNumbers(l1, l2);

        assertNotNull(result);
        assertEquals(5, result.val);
        assertNull(result.next);
    }

    @Test
    public void testSingleDigitAdditionWithCarry() {
        ListNode l1 = new ListNode(5);
        ListNode l2 = new ListNode(5);

        ListNode result = AddTwoNumbers.addTwoNumbers(l1, l2);

        assertNotNull(result);
        assertEquals(0, result.val);
        assertNotNull(result.next);
        assertEquals(1, result.next.val);
        assertNull(result.next.next);
    }

    @Test
    public void testMultipleDigitAddition() {
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        ListNode result = AddTwoNumbers.addTwoNumbers(l1, l2);

        assertNotNull(result);
        assertEquals(7, result.val);
        assertEquals(0, result.next.val);
        assertEquals(8, result.next.next.val);
        assertNull(result.next.next.next);
    }

    @Test
    public void testAdditionWithDifferentLengthLists() {
        ListNode l1 = new ListNode(9);
        l1.next = new ListNode(9);

        ListNode l2 = new ListNode(1);

        ListNode result = AddTwoNumbers.addTwoNumbers(l1, l2);

        assertNotNull(result);
        assertEquals(0, result.val);
        assertEquals(0, result.next.val);
        assertEquals(1, result.next.next.val);
        assertNull(result.next.next.next);
    }
}
