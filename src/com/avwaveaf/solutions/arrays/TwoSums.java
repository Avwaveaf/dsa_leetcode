package com.avwaveaf.solutions.arrays;

import java.util.HashMap;

//new int[]{1, 2, 3, 4,}, targt: 6

public class TwoSums {
    public static int[] sol1(int[] nums, int target){
        // store di hashmap untuk kita storing index
        // key: nums sekarang
        // value: untuk indexnya
        HashMap<Integer, Integer> index = new HashMap<>();
        // hasil akhir
        int[] res = new int[2];

        // loop 1x
        for(int i = 0; i<nums.length; i++){
            // kita dapatkan dulu complementnya atau hasil pengurangan
            int complement = target - nums[i];
            // karna kita sudah mendapatkan semua data value dari
            // index sekarang di dalam array nums
            // maka selanjutnya kita cek hasil pengurangan target-nums[i]
            // jika ada maka kita akan build hasi akhir
            if(index.containsKey(complement)){
                // kita simpan pertama nilai dari complementnya
                // mengambil key valuenya yang mana index dari
                // value di array nums
                res[0] = index.get(complement);
                // dan kita simpan ke dua index dari sekarang
                res[1] = i;
            }else{
                // jika tidak ada maka simpan baru
                index.put(nums[i], i);
            }
            // Apip jelek
            // we love selene
        }


        return res;
    }

    public static int[] sol2(int[] nums, int target){
        return null;
    }
}

