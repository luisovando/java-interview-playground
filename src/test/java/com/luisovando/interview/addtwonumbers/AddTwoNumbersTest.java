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
}
