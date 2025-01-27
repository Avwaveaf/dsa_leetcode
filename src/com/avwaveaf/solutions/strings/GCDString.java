package com.avwaveaf.solutions.strings;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class GCDString {
    public static String sol1(String str1, String str2) {
        char[] a = str1.toCharArray();
        char[] b = str2.toCharArray();
        int max = Math.max(a.length, b.length);
        Set<Character> l = new HashSet<>();

        for (int i = 0; i < max; i++) {
            if (i < a.length && i < b.length) {
                if (a[i] == b[i]) {
                    l.add(a[i]);
                }
            }
        }
        return l.stream().map(String::valueOf).collect(Collectors.joining());
    }
}
