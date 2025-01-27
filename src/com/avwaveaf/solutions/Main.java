package com.avwaveaf.solutions;

import com.avwaveaf.solutions.arrays.CanPlaceFlowers;
import com.avwaveaf.solutions.arrays.ProductOfArrayExceptSelf;
import com.avwaveaf.solutions.arrays.TwoSums;
import com.avwaveaf.solutions.arrays.WidestVertAreaBtweenTwoPoints;
import com.avwaveaf.solutions.math.NumberOfSteps;
import com.avwaveaf.solutions.search.binary_search.BinarySearch;
import com.avwaveaf.solutions.strings.*;
import com.avwaveaf.solutions.two_pointers.MoveZeroes;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // call the method here.
//        twoSumsImpl();
//        binarySearchImpl();
//        numberOfStepsImpl();
//        mergeStringAlternatelyImpl();
//        mergeStringAlternatelyImpl2();
//        greatedCommonDivisorStringImpl();
//        keyBoardRowImpl();
//        validParenthesisImpl();
//        wVABTPImpl();
//        cpfImpl();
//        reverseVowelsImpl();
//        reverseStringImpl();
//        poaesImpl();
        moveZeroes();
    }



    private static void twoSumsImpl() {
        System.out.println(
                Arrays.toString(
                        TwoSums.sol1(
                                new int[]{1, 26, 38, 42, 2, 18, 4, 17, 19, 72},
                                74
                        )
                )
        );
    }

    private static void binarySearchImpl() {
        System.out.println(
                Integer.toString(
                        BinarySearch.sol1(
                                new int[]{1, 17, 26, 28, 32, 42, 56, 64, 78, 92, 100},
                                42
                        )
                )
        );
    }

    private static void numberOfStepsImpl() {
        System.out.println(
                String.valueOf(NumberOfSteps.numberOfSteps(14))
        );
    }

    private static void mergeStringAlternatelyImpl() {
        System.out.println(
                MergeStringAlternately.sol1("abc", "pqrs")
        );

    }

    private static void mergeStringAlternatelyImpl2() {
        System.out.println(
                MergeStringAlternately.sol2("abc", "pqrs")
        );
    }

    private static void greatedCommonDivisorStringImpl() {
        System.out.println(
                GCDString.sol1("LEET", "CODE")
        );
    }

    private static void keyBoardRowImpl() {
        System.out.println(
                Arrays.toString(KeyboardRow.findWords(new String[]{"Hello", "Alaska", "Dad", "Peace"}))
        );
    }

    private static void validParenthesisImpl() {
        System.out.println(
                String.valueOf(ValidParenthesis.sol1("([])"))
        );
    }

    private static void wVABTPImpl() {
        System.out.println(
                WidestVertAreaBtweenTwoPoints.sol2(new int[][]{
                        {3, 1}, {9, 0}, {1, 0}, {1, 4}, {5, 3}, {8, 8}
                })
        );
    }

    private static void cpfImpl() {
        System.out.println(
                CanPlaceFlowers.solution2(new int[]{1, 0, 0, 0, 1}, 2)
        );
    }

    private static void reverseVowelsImpl() {
        System.out.println(
                ReverseVowels.solution("leetcode")
        );
    }

    private static void reverseStringImpl() {
        System.out.println(
                ReverseString.solution2("a good   example")
        );

    }

    private static void poaesImpl() {
        System.out.println(
                Arrays.toString(ProductOfArrayExceptSelf.solution(new int[]{1,2,3,4,5}))
        );
    }

    private static void moveZeroes(){
        int[] nums = new int[]{0, 1, 0, 3, 12};
        MoveZeroes.solution(nums);
        System.out.println(
                Arrays.toString(nums)
        );
    }

}
