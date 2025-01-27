package com.avwaveaf.solutions.strings;

import javax.xml.stream.events.Characters;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseVowels {
    public static String solution(String s) {
        // Convert the string into a char array for easier manipulation
        char[] col = s.toCharArray();

        // Define two pointers: one starting at the beginning, and the other at the end
        int left = 0, right = col.length - 1;

        // Use the two-pointer technique to find and swap vowels
        while (left < right) {
            // Find the next vowel from the left
            if (!isVowel(col[left])) {
                left++;
                continue;
            }

            // Find the next vowel from the right
            if (!isVowel(col[right])) {
                right--;
                continue;
            }

            // Swap the vowels
            char temp = col[left];
            col[left] = col[right];
            col[right] = temp;

            // Move both pointers inward
            left++;
            right--;
        }

        // Convert the char array back to a string and return it
        return new String(col);
    }

    // Helper method to check if a character is a vowel
    private static boolean isVowel(char c) {
        c = Character.toLowerCase(c);  // Normalize to lowercase for comparison
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }
}

