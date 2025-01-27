package com.avwaveaf.solutions.hash;

import java.util.HashMap;

public class RansomNote {
    public static boolean solEf(String ransomNote, String magazine){
        int[] arr = new int[26];
        for (char c : ransomNote.toCharArray()) {
            int index = magazine.indexOf(c, arr[c - 'a']);
            if (index == -1) {
                return false;
            }

            arr[c - 'a'] = index + 1;
        }
        return true;
    }

    public static boolean sol1(String ransomNote, String magazine){
        HashMap<Character, Integer> magazineMap = new HashMap<>();

        // Count the frequency of characters in the magazine
        for (int i = 0; i < magazine.length(); i++) {
            char c = magazine.charAt(i);
            magazineMap.put(c, magazineMap.getOrDefault(c, 0) + 1);
        }

        // Check if the ransomNote can be constructed
        for (int i = 0; i < ransomNote.length(); i++) {
            char c = ransomNote.charAt(i);
            // If the magazine does not contain the character or has no more of that character
            if (!magazineMap.containsKey(c) || magazineMap.get(c) == 0) {
                return false;
            }
            // Decrease the frequency of the character in magazineMap
            magazineMap.put(c, magazineMap.get(c) - 1);
        }

        // If all characters of ransomNote are found in magazine
        return true;
    }
}
