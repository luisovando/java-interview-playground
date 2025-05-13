package com.luisovando.interview.firstuniquecharacterfinder;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Write a function that takes a string input and returns the first non-repeating character in that string.
 * If every character in the string repeats, return the null character '\0'.
 */

public class FirstUniqueCharacterFinderTest {
    @Test
    public void testInputIsEmpty() {
        String input = "";
        char expected = '\0';

        assertEquals(expected, FirstUniqueCharacterFinder.findFirstUniqueChar(input));
    }

    @Test
    public void testInputIsNull() {
        String input = null;
        char expected = '\0';

        assertEquals(expected, FirstUniqueCharacterFinder.findFirstUniqueChar(input));
    }

    @Test
    public void testInputOnlySpaces() {
        String input = "     ";
        char expected = '\0';

        assertEquals(expected, FirstUniqueCharacterFinder.findFirstUniqueChar(input));
    }

    @Test
    public void testInputOnlySpecialCharactersRepeated() {
        String input = "!!@@##";
        char expected = '\0';

        assertEquals(expected, FirstUniqueCharacterFinder.findFirstUniqueChar(input));
    }

    @Test
    public void testAllUniqueCharacters() {
        String input = "abcd";
        char expected = 'a';

        assertEquals(expected, FirstUniqueCharacterFinder.findFirstUniqueChar(input));
    }

    @Test
    public void testLastCharacterIsUnique() {
        String input = "aabbccz";
        char expected = 'z';

        assertEquals(expected, FirstUniqueCharacterFinder.findFirstUniqueChar(input));
    }

    @Test
    public void testMiddleCharacterIsUnique() {
        String input = "aabbcddd";
        char expected = 'c';

        assertEquals(expected, FirstUniqueCharacterFinder.findFirstUniqueChar(input));
    }

    @Test
    public void testUniqueCharacterAmongManyRepeats () {
        String input = "aabccdeff";
        char expected = 'b';

        assertEquals(expected, FirstUniqueCharacterFinder.findFirstUniqueChar(input));
    }

    @Test
    public void testUniqueCharacterAtEnd() {
        String input = "aab";
        char expected = 'b';

        assertEquals(expected, FirstUniqueCharacterFinder.findFirstUniqueChar(input));
    }

    @Test
    public void testSingleCharacterString() {
        String input = "l";
        char expected = 'l';

        assertEquals(expected, FirstUniqueCharacterFinder.findFirstUniqueChar(input));
    }

    @Test
    public void testMixedLettersAndSymbols() {
        String input = "a!a@b#b$%";
        char expected = '!';

        assertEquals(expected, FirstUniqueCharacterFinder.findFirstUniqueChar(input));
    }
}
