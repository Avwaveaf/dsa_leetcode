package com.avwaveaf.solutions.sliding_windows;

public class FindMaxAverage {
    public static double solution(int[] nums, int k){
        if(nums.length == 1){
            return (double) nums[0] / k;
        }

        int start = 0;
        int sum = 0;
        double avg;
        double max = 0.0;
        int pointerRight = k;
        for(int i = start; i< pointerRight; i++){
            if(nums.length == k){
                sum += nums[i];
                continue;
            }
            if(pointerRight > nums.length){
                break;
            }
            sum += nums[i];
            if(i == pointerRight-1){
                avg = (double) sum /k;
                pointerRight+=1;
                start += 1;
                i = start;
                if(i > 0){
                    i -= 1;
                }
                if(avg>max){
                    max = avg;
                }
                sum = 0;
            }
        }

        if(nums.length == k){
            return (double) sum/k;
        }

        return max;
    }

    public static double solution2(int[] nums, int k){
        int sum = 0;

        for(int i = 0; i<k;i++){
            sum += nums[i];
        }

        double max = sum;

        for(int i = k; i< nums.length; i++){
            sum = sum - nums[i - k] + nums[i];
            if(max < sum){
                max = sum;
            }
        }

        return max / k;
    }
}
