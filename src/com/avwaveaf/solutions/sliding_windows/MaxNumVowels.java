package com.avwaveaf.solutions.sliding_windows;

public class MaxNumVowels {
    public static int solution(String s, int k){

        // intuition: core
        /**
         1. setiap window kita akan cek apakah matching dengan aiueo
         2. jika ya maka tambahkan ke count
         3. jika tidak skip
         4. lalu kita akan compare dengan MaxVowels

         Intuition :
         1. looping untuk mendapatkan first window max length < k
         2. kita hanya compare atau proses sebelum dan current max saja
         */

        char[] cCol = s.toCharArray();
        int count = 0;
        int maxCount = 0;

        // getting first window
        for(int i = 0; i<k; i++){
            if(isVowels(cCol[i])){
                count += 1;
            }
        }

        if(count > maxCount){
            maxCount = count;
        }

        count = 0;

        for(int i = k; i<s.length(); i++){


            if(isVowels(cCol[i-k])){
                count--;
            }

            if(isVowels(cCol[i])){
                count++;
            }

            if(i > k){
                if(count > maxCount){
                    maxCount = count;

                }
                count = 0;
            }
        }

        return maxCount;
        // Fail case
    }

    private static boolean isVowels(char c){
        char newC = Character.toLowerCase(c);
        return newC == 'a' || newC == 'i' || newC == 'u' || newC=='e' || newC=='o';
    }


    public static int solution2(String s, int k){
        if(s.length() == 1){
            return isVowels(s.charAt(0))? 1 : 0;
        }
        int totalVowInWf = 0;

        // first compare within window
        for(int i =0; i < k; i++){
            if(isVowels(s.charAt(i))){
                ++totalVowInWf;
            }
        }

        int maxVow = totalVowInWf;

        for(int i = k; i<s.length(); i++){
            if(isVowels(s.charAt(i))){
                ++totalVowInWf;
            }
            if(isVowels(s.charAt(i-k))){
                --totalVowInWf;
            }

            if(totalVowInWf >= maxVow){
                maxVow = totalVowInWf;
            }
        }

        return maxVow;
    }
}
