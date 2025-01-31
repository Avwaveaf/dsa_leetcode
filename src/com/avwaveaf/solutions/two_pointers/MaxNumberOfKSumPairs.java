package com.avwaveaf.solutions.two_pointers;

import java.util.Arrays;

public class MaxNumberOfKSumPairs {
    public static int solution(int[] nums, int k) {
        Arrays.sort(nums);
        int c = 0, l = 0, r = nums.length - 1;
        while (l < r) {
            int sum = nums[l] + nums[r];
            if (sum == k) {
                c++;
                l++;
                r--;
            } else if (sum < k) {
                l++;  // Move left pointer to increase sum
            } else {
                r--;  // Move right pointer to decrease sum
            }
        }
        return c;
    }
}
