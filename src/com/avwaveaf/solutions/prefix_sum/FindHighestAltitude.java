package com.avwaveaf.solutions.prefix_sum;

public class FindHighestAltitude {
    public static int solution(int[] gain){
        int curr = 0, max = 0;
        for(int i = 0; i<gain.length; i++){
            curr += gain[i];
            if (curr > max) {
                max = curr;
            }
        }
        return max;
    }
}
