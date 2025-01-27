package com.avwaveaf.solutions.strings;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class KeyboardRow {
    public static String[] findWords(String[] words) {
        // Map each character to its respective row
        Map<Character, Integer> charToRow = Map.ofEntries(
                Map.entry('q', 1), Map.entry('w', 1), Map.entry('e', 1), Map.entry('r', 1), Map.entry('t', 1),
                Map.entry('y', 1), Map.entry('u', 1), Map.entry('i', 1), Map.entry('o', 1), Map.entry('p', 1),
                Map.entry('a', 2), Map.entry('s', 2), Map.entry('d', 2), Map.entry('f', 2), Map.entry('g', 2),
                Map.entry('h', 2), Map.entry('j', 2), Map.entry('k', 2), Map.entry('l', 2),
                Map.entry('z', 3), Map.entry('x', 3), Map.entry('c', 3), Map.entry('v', 3), Map.entry('b', 3),
                Map.entry('n', 3), Map.entry('m', 3)
        );

        List<String> result = new ArrayList<>();

        for (String word : words) {
            int row = charToRow.get(Character.toLowerCase(word.charAt(0))); // Row of the first char
            boolean isValid = true;

            for (char c : word.toLowerCase().toCharArray()) {
                if (charToRow.get(c) != row) {
                    isValid = false;
                    break;
                }
            }

            if (isValid) {
                result.add(word);
            }
        }

        return result.toArray(new String[0]);
    }
}
