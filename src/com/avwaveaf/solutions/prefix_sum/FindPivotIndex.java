package com.avwaveaf.solutions.prefix_sum;

/*
*   Input: nums = [1,7,3,6,5,6]
    Output: 3
    Explanation:
        The pivot index is 3.
        Left sum = nums[0] + nums[1] + nums[2] = 1 + 7 + 3 = 11
        Right sum = nums[4] + nums[5] = 5 + 6 = 11
* */

public class FindPivotIndex {
    public static int solution(int[] nums){
        int sum = 0;
        for (int i : nums) {
            sum += i;
        }
        int left = 0, right =0;
        for (int i = 0; i<nums.length;i++){
           right = sum - left  - nums[i];
            if (left == right) {
                return i;
            }

            left += nums[i];
        }
        return -1;
    }
}
