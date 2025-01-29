package com.avwaveaf.solutions.arrays;

import java.util.ArrayList;
import java.util.List;

public class StringCompression {
    public static int solution(char[] chars) {
        int write = 0;
        int read = 0;

        while (read < chars.length) {
            char currentChar = chars[read];
            int count = 0;

            // Count the number of occurrences of the current character
            while (read < chars.length && chars[read] == currentChar) {
                read++;
                count++;
            }

            // Write the character to the result
            chars[write++] = currentChar;

            // If the character occurred more than once, write the count
            if (count > 1) {
                for (char c : Integer.toString(count).toCharArray()) {
                    chars[write++] = c;
                }
            }
        }

        return write;
    }

}
