package com.avwaveaf.solutions.strings;

public class MergeStringAlternately {
    public static String sol1(String word1, String word2){
        int max = Math.max(word1.length(), word2.length());
        char[] a = new char[word1.length() + word2.length()];
        int k = 0; // Index for the merged char array

        for (int i = 0; i < max; i++) {
            if (i < word1.length()) {
                a[k++] = word1.charAt(i);
            }
            if (i < word2.length()) {
                a[k++] = word2.charAt(i);
            }
        }

        return new String(a);
    }

    public static String sol2(String word1, String word2) {
        char[] a = word1.toCharArray();
        char[] b = word2.toCharArray();

        char[] c = new char[a.length + b.length];

        int k = 0;

        for(int i = 0; i< c.length;i++){
            if(i<a.length){
                c[k++] = a[i];
            }
            if(i<b.length){
                c[k++] = b[i];
            }
        }

        return String.valueOf(c);
    }
}
