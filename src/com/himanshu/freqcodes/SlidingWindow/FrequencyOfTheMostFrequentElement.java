package com.himanshu.freqcodes.SlidingWindow;

import java.util.Arrays;

public class FrequencyOfTheMostFrequentElement {

    public static void main(String[] args) {
        int[] arr = new int[20];
        System.out.println("Generating the arrays...");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * (10 - 1) + 1);
        }

        System.out.println(Arrays.toString(arr));

        int res = maxRep(arr, 7);
        System.out.println("Answer is:          " + res);

    }

    private static int maxRep(int[] arr, int k) {

        int n = arr.length;
        Arrays.sort(arr);
        int res = 0, left = 0, right = 0, sum = 0;

        while (right < n) {
            sum += arr[right];

            while (arr[right] * (right - left + 1) > sum + k) {

                sum -= arr[left++];
            }

            res = Math.max(res, right - left + 1);
            right++;

        }
        return res;

    }
}
