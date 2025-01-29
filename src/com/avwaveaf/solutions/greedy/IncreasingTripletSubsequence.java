package com.avwaveaf.solutions.greedy;

public class IncreasingTripletSubsequence {
    /* INTUITION
        1. just use greedy algorithm
    * */
    public static boolean solution(int[] nums) {
        if (nums.length < 3) return false;
        int first = Integer.MAX_VALUE, second = Integer.MAX_VALUE;

        for (int num : nums) {
            if (num < first) {
                first = num;
            } else if (num < second && num != first) {
                second = num;
            } else if (num != first && num != second) {
                return true;
            }

        }
        return false;
    }
}
