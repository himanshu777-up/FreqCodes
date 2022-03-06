package com.himanshu.freqcodes.recursion;

import java.util.ArrayList;
import java.util.List;

public class Subsets {
    //Creating all the possible subsets of an array
    public static void main(String[] args) {

        int[] nums = new int[]{1, 2, 3, 4, 5};
        List<List<Integer>> res = new ArrayList<>();

        subset(nums, 0, new ArrayList<>(), res);
        System.out.println(res);
        for (List<Integer> arr : res) {
            System.out.println(arr);
        }

    }

    private static void subset(int[] nums, int start, ArrayList<Integer> ans, List<List<Integer>> res) {

        if (start == nums.length) {
            res.add(new ArrayList<>(ans));
            return;
        }


        int num = nums[start];
        ArrayList<Integer> temp = new ArrayList<>(ans);
        temp.add(num);

        subset(nums, start + 1, ans, res);
        subset(nums, start + 1, temp, res);
    }

}
