package com.avwaveaf.solutions.math;

public class NumberOfSteps {
    public static int numberOfSteps(int num) {
        int stepC = step(num, 0);

        return stepC -1;
    }

    private static int step(int num, int count){
        int mCount = count;
        mCount +=1;
        return num != 0? num%2==0? step(num/2, mCount) : step(num-1, mCount) : mCount;
    }

}
