package com.himanshu.freqcodes.binarysearch;

import java.awt.*;
import java.util.Arrays;

public class BinarySearchBasic {
    public static void main(String[] args) {
        int[] arr = new int[1000];
        System.out.println("Generating the arrays...");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * (1000 - 1) + 1);
        }

        Arrays.sort(arr);
        System.out.println("The array is:...");
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println("");
        System.out.println("Generating the numbers to find...");
        int[] findNum = new int[1000];
        for (int i = 0; i < findNum.length; i++) {
            findNum[i] = (int) (Math.random() * (1000 - 1) + 1);
        }
        int sum=0;

        for(int key:findNum) {
            System.out.print("Finding the number:  "+ key+"     ");
            System.out.println(bsearch(arr, key, 0, arr.length-1));

        }



    }

    private static int bsearch(int[] arr, int key, int low, int high) {

        if (high >= low) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == key)
                return mid;

            else if (arr[mid] > key) {
                return bsearch(arr, key, 0, mid - 1);
            } else {
                return bsearch(arr, key, mid + 1, high);
            }


        }

        return -1;
    }


}
