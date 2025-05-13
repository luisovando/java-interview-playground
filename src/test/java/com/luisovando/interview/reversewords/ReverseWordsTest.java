package com.luisovando.interview.reversewords;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ReverseWordsTest {
    @Test
    public void testEmptyString() {
        String input = "";
        String expected = "";
        Assertions.assertEquals(expected, ReverseWords.reverseWords(input));
    }

    @Test
    public void testSingleWord() {
        String input = "hello";
        String expected = "hello";
        assertEquals(expected, ReverseWords.reverseWords(input));
    }

    @Test
    public void testMultipleWords() {
        String input = "the sky is blue";
        String expected = "blue is sky the";
        assertEquals(expected, ReverseWords.reverseWords(input));
    }

    @Test
    public void testExtraSpaces() {
        String input = "  the   sky is  blue  ";
        String expected = "blue is sky the";
        assertEquals(expected, ReverseWords.reverseWords(input));
    }
}
