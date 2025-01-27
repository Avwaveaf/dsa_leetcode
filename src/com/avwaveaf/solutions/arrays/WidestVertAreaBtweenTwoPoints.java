package com.avwaveaf.solutions.arrays;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.stream.Collectors;

public class WidestVertAreaBtweenTwoPoints {
    public static int sol(int[][] nums) {
        PriorityQueue<Integer> x = Arrays.stream(nums).map(num -> num[0]).collect(Collectors.toCollection(PriorityQueue::new));

        // populate

        Integer prev = x.poll();
        int currMax = 0;
 
        while (!x.isEmpty()) {
            int current = x.poll(); // Next element
            Integer leap = current - prev;
            currMax = Math.max(currMax, leap);
            prev = current; // Update previous element
        }


        return currMax;
    }

    public static int sol2 (int[][] points){
        int n = points.length;
        int[] xAxis = new int[n];

        for (int i = 0; i < n; i++) {
            xAxis[i] = points[i][0];
        }

        int max = xAxis[0];
        int min = xAxis[0];
        for (int i = 0; i < n; i++) {
            max = Math.max(max, xAxis[i]);
            min = Math.min(min, xAxis[i]);
        }

        int bucketSize = (int) Math.ceil((double)(max - min) / (n-1));
        int[] minBucket = new int[n];
        int[] maxBucket = new int[n];

        Arrays.fill(minBucket, Integer.MAX_VALUE);
        Arrays.fill(maxBucket, Integer.MIN_VALUE);

        if (min == max)
            return 0;

        for (int x : xAxis) {
            int index = (x - min) / bucketSize;
            minBucket[index] = Math.min(x, minBucket[index]);
            maxBucket[index] = Math.max(x, maxBucket[index]);
        }

        int maxWidth = bucketSize;
        int prev = maxBucket[0];
        for (int i = 0; i < xAxis.length; i++) {
            if (minBucket[i] == Integer.MAX_VALUE)
                continue;
            maxWidth = Math.max(maxWidth, minBucket[i] - prev);
            prev = maxBucket[i];
        }

        return maxWidth;
    }
}
