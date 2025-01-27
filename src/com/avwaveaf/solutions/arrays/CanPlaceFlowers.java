package com.avwaveaf.solutions.arrays;

public class CanPlaceFlowers {
    public static boolean solution(int[] flowerbed, int n) {
        int prev = 0;
        int after = 0;
        for (int i = 0; i < flowerbed.length; i++) {
            if(i + 1< flowerbed.length ){
                after = flowerbed[i + 1];

            }else{
                after = 0;
            }

            if(flowerbed[i] == 0 ){
                if(prev == 0 && after == 0){
                    flowerbed[i] = 1;
                    n -= 1;
                }
                if(n == 0) return true;

            }
            prev = flowerbed[i];
        }

        return n <= 0;
    }
    public static boolean solution2(int[] flowerbed, int n) {
        int len=flowerbed.length;
        for(int i=0;i<len;i+=2){
            if(flowerbed[i]==0){
                if(i==len-1 || flowerbed[i]==flowerbed[i+1]){
                    n--;
                }
                else{
                    i++;
                }
            }
        }
        if(n<=0){
            return true;
        }
        return false;
    }
}
