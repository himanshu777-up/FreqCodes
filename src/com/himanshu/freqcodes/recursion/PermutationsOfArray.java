package com.himanshu.freqcodes.recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PermutationsOfArray {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3};

        System.out.println(Arrays.toString(arr));
        List<List<Integer>> res = new ArrayList<>();
        permute(arr, 0, arr.length, res);
        System.out.println(res);

    }

    private static void permute(int[] arr, int idx, int n, List<List<Integer>> res) {

        if (idx == n - 1) {
            List<Integer> temp = new ArrayList<>();
            for (int num : arr) temp.add(num);
            res.add(temp);
            return;
        }

        for (int i = idx; i < n; i++) {
            swap(arr, i, idx);
            permute(arr, idx + 1, n, res);
            swap(arr, idx, i);
        }

    }

    private static void swap(int[] arr, int i, int idx) {
        int temp = arr[i];
        arr[i] = arr[idx];
        arr[idx] = temp;
    }
}
