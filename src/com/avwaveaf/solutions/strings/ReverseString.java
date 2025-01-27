package com.avwaveaf.solutions.strings;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ReverseString {
    public static String solution(String s){
        s.trim();
        String[] split = s.split(" ");

        int left = 0, right = split.length-1;

        while (left < right) {
            String temp = split[left];
            split[left] = split[right];
            split[right] = temp;
            left++;
            right--;
        }

        List<String> m = new ArrayList<>();
        for (String s1 : split) {
            if(!s1.isEmpty() || !s1.isBlank()){
                m.add(s1);
            }
        }


        return String.join(" ",m);
    }

    public static String solution2(String s) {
        String[] split = s.trim().split(" +");

        int left = 0, right = split.length-1;

        while (left < right) {
            String temp = split[left];
            split[left] = split[right];
            split[right] = temp;
            left++;
            right--;
        }

        return String.join(" ", split);
    }
}
