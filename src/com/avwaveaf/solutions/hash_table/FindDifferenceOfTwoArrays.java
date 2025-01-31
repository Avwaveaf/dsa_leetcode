package com.avwaveaf.solutions.hash_table;

import java.util.*;
import java.util.stream.Collectors;

public class FindDifferenceOfTwoArrays {
    public static List<List<Integer>> solution(int[] num1, int[] nums2) {
        Set<Integer> u1 = new HashSet<>();

        Set<Integer> u2 = new HashSet<>();
        for (int i : num1) {
            u1.add(i);
        }
        for (int i : nums2) {
            u2.add(i);
        }

        Set<Integer> u1c = new HashSet<>(u1);
        u1.removeAll(u2);
        u2.removeAll(u1c);

        List<List<Integer>> res = new ArrayList<>();
        res.add(new ArrayList<>(u1));
        res.add(new ArrayList<>(u2));
        return res;
    }
    public static List<List<Integer>> solution2(int[] nums1, int[] nums2) {
        return new java.util.AbstractList<List<Integer>>() {
            List<Integer> list1;
            List<Integer> list2;

            @Override
            public int size() {
                return 2;
            }

            @Override
            public List<Integer> get(int index) {
                if (list1 == null || list2 == null) {
                    process();
                }
                return index == 0 ? list1 : list2;
            }

            private void process() {
                HashSet<Integer> s1 = Arrays.stream(nums1)
                        .boxed()
                        .collect(Collectors.toCollection(HashSet::new));
                HashSet<Integer> s2 = Arrays.stream(nums2)
                        .boxed()
                        .collect(Collectors.toCollection(HashSet::new));
                list1 = new ArrayList<>();
                list2 = new ArrayList<>();

                for (var i : s1) {
                    if (!s2.contains(i)) {
                        list1.add(i);
                    }
                }
                for (var i : s2) {
                    if (!s1.contains(i)) {
                        list2.add(i);
                    }
                }
            }
        };
    }
}
