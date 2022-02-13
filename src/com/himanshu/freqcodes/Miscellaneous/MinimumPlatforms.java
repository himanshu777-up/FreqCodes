package com.himanshu.freqcodes.Miscellaneous;

import java.util.Arrays;

public class MinimumPlatforms {
    public static void main(String[] args) {

        int n = 10;
        int[] arr = new int[n];
        int[] dep = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = (int) (Math.random() * (1800 - 900) + 900);
            dep[i] = (int) (Math.random() * (1800 - 900) + 900);
        }

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(dep));

        Arrays.sort(arr);
        Arrays.sort(dep);
        int trains = 0, res = 0;

        int i = 0, j = 0;

        while (i < n && j < n) {

            if (arr[i] <= dep[j]) {
                trains++;
                i++;
            } else {
                trains--;
                j++;
            }

            res = Math.max(res, trains);
        }

        System.out.println("Minimum platforms required:     " + res);


    }
}
