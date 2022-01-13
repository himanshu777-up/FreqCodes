package com.himanshu.freqcodes.binarysearch;

import java.util.Arrays;

public class MedianOfTwoSortedArrays {
    public static void main(String[] args) {

        int n1 = (int) (Math.random() * (15 - 10) + 10);
        int n2 = (int) (Math.random() * (15 - 10) + 10);

        int[] arr1 = new int[n1];
        System.out.println("Generating the arrays...");
        for (int i = 0; i < n1; i++) {
            arr1[i] = (int) (Math.random() * (100 - 1) + 1);
        }
        Arrays.sort(arr1);

        int[] arr2 = new int[n2];
        System.out.println("Generating the arrays...");
        for (int i = 0; i < n2; i++) {
            arr2[i] = (int) (Math.random() * (100 - 1) + 1);
        }
        Arrays.sort(arr2);

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        int n = n1 + n2;
        int[] arr3 = new int[n];
        int j = 0;
        for (int num : arr1) {
            arr3[j] = num;
            j++;
        }
        for (int num : arr2) {
            arr3[j] = num;
            j++;
        }
        Arrays.sort(arr3);
        System.out.println(Arrays.toString(arr3));

        int median = -1;

        if (n % 2 != 0) {
            median = arr3[n / 2];
        } else {
            median = arr3[n / 2] + arr3[(n - 1) / 2];
            median /= 2;
        }

        System.out.println("Median is    :    " + median + "      size is:    " + n);

        int medByFunc = medSorted(arr1, arr2);

        System.out.println("Median found by function is: " + medByFunc);

    }

    private static int medSorted(int[] arr1, int[] arr2) {

        int n1 = arr1.length;
        int n2 = arr2.length;

        if (n1 > n2) return medSorted(arr2, arr1);

        int low = 0, high = n1;

        while (low <= high) {

            int part1 = (low + high) / 2;
            int part2 = (n1 + n2 + 1) / 2 - part1;

            int left1 = (part1 == 0) ? Integer.MIN_VALUE : arr1[part1 - 1];
            int right1 = (part1 == n1) ? Integer.MAX_VALUE : arr1[part1];

            int left2 = (part2 == 0) ? Integer.MIN_VALUE : arr2[part2 - 1];
            int right2 = (part2 == n2) ? Integer.MAX_VALUE : arr2[part2];

            if (left1 <= right2 && left2 <= right1) {
                if ((n1 + n2) % 2 != 0) {
                    return Math.max(left1, left2);
                } else {
                    return (Math.max(left1, left2) + Math.min(right1, right2)) / 2;
                }
            } else if (left1 > right2) {
                high = part1 - 1;
            } else {
                low = part1 + 1;
            }

        }
        return -1;

    }

}
