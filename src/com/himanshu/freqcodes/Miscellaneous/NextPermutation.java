package com.himanshu.freqcodes.Miscellaneous;

import java.util.Arrays;

public class NextPermutation {
    public static void main(String[] args) {
        int n = (int) (Math.random() * (20 - 10) + 10);

        int[] arr = new int[n];
        System.out.println("Generating the arrays...");
        for (int i = 0; i < n; i++) {
            arr[i] = (int) (Math.random() * (9 - 1) + 1);
        }

        System.out.println(Arrays.toString(arr));

        nextPerm(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void nextPerm(int[] arr) {

        int len = arr.length;
        int i = len - 2;

        //Finding where the graph starts descending
        while (i >= 0 && arr[i] >= arr[i + 1]) {
            i--;
        }

        //If no permutation is possible, i reaches to -1
        if (i == -1) {
            System.out.println("No next permutation possible here");
            return;
        }

        //Find the smallest number greater than the arr[i]
        int k = len - 1;
        while (arr[k] <= arr[i]) k--;

        //Swap these two elements
        swap(arr, i, k);

        //Now sort the remaining of the array, but since it is already sorted in descending order, we need to just reverse it
        int l = len - 1;
        while (l > i) {
            swap(arr, i + 1, l);  //starting with (i+1) as we don't want to swap the ith element
            l--;
            i++;
        }
    }

    private static void swap(int[] arr, int i, int k) {
        int temp = arr[i];
        arr[i] = arr[k];
        arr[k] = temp;
    }
}
