package com.avwaveaf.solutions.arrays;

public class MaxArea {
    public static int solution(int[] height){
        int sisiKiri =0;
        int sisiKanan = height.length -1;
        int maxStretch = 0;

        while (sisiKiri<sisiKanan){
            int area = Math.min(height[sisiKiri], height[sisiKanan]) * (sisiKanan - sisiKiri);
            maxStretch = Math.max(maxStretch, area);
            if (height[sisiKiri] < height[sisiKanan]) {
                sisiKiri++;
            }
            else {
                sisiKanan--;
            }
        }
        return maxStretch;
    }
}
