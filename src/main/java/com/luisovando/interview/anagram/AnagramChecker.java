package com.luisovando.interview.anagram;

import java.util.HashMap;
import java.util.Map;

public class AnagramChecker {
    public static boolean areAnagrams(String a, String b) {

        if (isNullOrEmpty(a, b)) return false;

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < a.length(); i++) {
            char c = a.charAt(i);
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (int i = 0; i < b.length(); i++) {
            char c = b.charAt(i);
            if (!map.containsKey(c) || map.get(c) == 0) {
                return false;
            } else {
                map.put(c, map.get(c) - 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() != 0) return false;
        }

        return true;
    }

    private static boolean isNullOrEmpty(String a, String b) {
        if (a == null || b == null || a.isEmpty() || b.isEmpty()) return true;

        return a.length() != b.length();
    }
}
