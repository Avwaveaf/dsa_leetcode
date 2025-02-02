package com.avwaveaf.solutions.sliding_windows;

/*
* Example 1:

    Input: nums = [1,1,1,0,0,0,1,1,1,1,0], k = 2
    Output: 6                v         v
    Explanation:  [1,1,1,0,0,1,1,1,1,1,1]
    Bolded numbers were flipped from 0 to 1. The longest subarray is underlined.
*
* */

public class MaxConsecutiveOnesIII {
    public static int solution(int[] nums, int k) {
            int left = 0, maxLength = 0, zeroCount = 0;

            for (int i = 0; i < nums.length - 1; i++) {
                if (nums[i] == 0) {
                    zeroCount += 1;
                }

                while (zeroCount > k) {
                    if (nums[left] == 0) {
                        zeroCount -= 1;
                        left += 1;
                    }
                }

                maxLength = Math.max(maxLength, i - left + 1);
            }

            return maxLength;
    }
}
