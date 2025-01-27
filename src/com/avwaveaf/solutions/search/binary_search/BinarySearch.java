package com.avwaveaf.solutions.search.binary_search;

import java.util.Arrays;

public class BinarySearch {
    public static int sol1(int[] nums, int target) {
        int mid = nums.length/2;
        if(nums[mid] != target){
            if ( target < nums[mid] ) {
                sol1(Arrays.copyOfRange(nums, 0, mid), target);
            } else {
                sol1(Arrays.copyOfRange(nums, nums[mid], nums.length - 1), target);
            }
        }
        return mid;
    }

}
