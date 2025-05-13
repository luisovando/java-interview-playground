package com.luisovando.interview.parenthesesvalidator;

import java.util.Stack;

public class ParenthesesValidator {
    public static boolean isValid (String input) {
        if (input == null) return false;
        if (input.isEmpty()) return true;

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            if ('(' == c || '[' == c || '{' == c) {
                stack.push(c);
            } else if (')' == c || ']' == c || '}' == c) {
                if (stack.isEmpty()) return false;

                char top = stack.pop();
                if ((c == ')' && top != '(') ||
                    (c == ']' && top != '[') ||
                    (c == '}' && top != '{')) {
                    return false;
                }
            } else {
                return false;
            }
        }

        return stack.isEmpty();
    }
}
