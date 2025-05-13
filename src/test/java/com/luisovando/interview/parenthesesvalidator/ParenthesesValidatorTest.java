package com.luisovando.interview.parenthesesvalidator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ParenthesesValidatorTest {
    // === Edge Cases ===

    @Test
    public void testNullInputIsInvalid() {
        assertFalse(ParenthesesValidator.isValid(null));
    }

    @Test
    public void testEmptyStringIsValid() {
        assertTrue(ParenthesesValidator.isValid(""));
    }

    @Test
    public void testWhitespaceOnlyInputIsInvalid() {
        assertFalse(ParenthesesValidator.isValid("   "));
    }

    @Test
    public void testNonBracketCharactersAreInvalid() {
        assertFalse(ParenthesesValidator.isValid("abc"));
    }


    // === Simple Valid Cases ===

    @Test
    public void testSinglePairIsValid() {
        assertTrue(ParenthesesValidator.isValid("()"));
    }

    @Test
    public void testMultipleValidPairs() {
        assertTrue(ParenthesesValidator.isValid("()[]{}"));
    }

    @Test
    public void testNestedValidBrackets() {
        assertTrue(ParenthesesValidator.isValid("{[()]}"));
    }

    @Test
    public void testDeeplyNestedValidBrackets() {
        assertTrue(ParenthesesValidator.isValid("((({[]})))"));
    }


    // === Invalid Cases ===

    @Test
    public void testUnmatchedOpeningBrackets() {
        assertFalse(ParenthesesValidator.isValid("((("));
    }

    @Test
    public void testUnmatchedClosingBrackets() {
        assertFalse(ParenthesesValidator.isValid("())"));
    }

    @Test
    public void testIncorrectlyOrderedBrackets() {
        assertFalse(ParenthesesValidator.isValid("([)]"));
    }

    @Test
    public void testMismatchedBracketTypes() {
        assertFalse(ParenthesesValidator.isValid("{[}]"));
    }
}
