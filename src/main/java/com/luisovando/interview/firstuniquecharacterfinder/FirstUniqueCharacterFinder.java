package com.luisovando.interview.firstuniquecharacterfinder;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstUniqueCharacterFinder {
    public static char findFirstUniqueChar(String input) {
        if (input == null || input.trim().isEmpty()) return '\0';

        Map<Character, Integer> map = new LinkedHashMap<>();

        for (char c : input.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) return entry.getKey();
        }

        return '\0';
    }
}
