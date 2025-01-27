package com.avwaveaf.solutions.strings;

/*  INTUITION
 *   1. we want to have length of smallest string
 *   2. the length of smallest string will be the index for
 *       traversal in s string
 *   3. we want traverse and compare if curr char match curr index
 *       of s char
 *   4. if does decrement the pointer 1
 *   5. result determined by if pointer 1 is 0;
 * */

public class IsSubsequence {
    public static boolean solution(String s, String t) {
        char[] sChars = s.toCharArray();
        char[] tChars = t.toCharArray();

        int p1 = 0;

        for (char tChar : tChars) {
            if (p1 < sChars.length) {
                if (tChar == sChars[p1]) {

                    p1 += 1;

                }
            }
        }
        return p1 == sChars.length;
    }

    // karena kita tidak akan menggaunakan isi dari masing2 string
    // kita hanya akan menghitung saja
    public static boolean solution2(String s, String t){
        if (s.isEmpty()) {
            return true;
        }
        int cv = 0;
        for (char c : t.toCharArray()) {
            if (c == s.charAt(cv)) {
                cv += 1;
            }

            if (cv == s.length()) {
                return true;
            }
        }

        return false;
    }
}
