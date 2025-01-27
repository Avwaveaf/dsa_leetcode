package com.avwaveaf.solutions.two_pointers;

public class MoveZeroes {
    public static void solution(int[] nums){
       int lastFoundNonZero = 0;

       for(int i = 0; i< nums.length;i++){
           if(nums[i]!= 0){
               int temp = nums[lastFoundNonZero];
               nums[lastFoundNonZero] = nums[i];
               nums[i] = temp;
               lastFoundNonZero += 1;
           }
       }

    }
}
