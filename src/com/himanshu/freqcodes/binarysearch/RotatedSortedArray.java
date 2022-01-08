package com.himanshu.freqcodes.binarysearch;

import java.util.Arrays;

public class RotatedSortedArray {
    public static void main(String[] args) {

        int[] arr = new int[10000];
        System.out.println("Generating the arrays...");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * (1000 - 1) + 1);
        }

        Arrays.sort(arr);

        int[] temp = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[i];
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = temp[(i + 30) % arr.length];
        }

        System.out.println("The array is:...");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println("");
        //Array generated till this point

        System.out.println("Generating the numbers to find...");
        int[] findNum = new int[arr.length];
        for (int i = 0; i < findNum.length; i++) {
            findNum[i] = (int) (Math.random() * (1000 - 1) + 1);
        }
        int sum = 0;

        for (int key : findNum) {
            System.out.print("Finding the number:  " + key + "     ");
            int res = pivot(arr, key, 0, arr.length - 1);
            if (res == -1) {
                System.out.println("Not found");
            } else {
                System.out.println(arr[res]);
            }
        }
    }

    private static int pivot(int[] arr, int key, int low, int high) {
        if (low <= high) {

            int mid = low + (high - low) / 2;

            if (arr[mid] == key) return mid;

            else if (arr[mid] > arr[low]) {
                if (key <= arr[mid] && key >= arr[low]) {
                    return pivot(arr, key, low, mid - 1);
                } else {
                    return pivot(arr, key, mid + 1, high);
                }
            } else {
                if (key >= arr[mid] && key <= arr[high]) {
                    return pivot(arr, key, mid + 1, high);
                } else {
                    return pivot(arr, key, low, mid - 1);
                }
            }
        }
        return -1;
    }
}