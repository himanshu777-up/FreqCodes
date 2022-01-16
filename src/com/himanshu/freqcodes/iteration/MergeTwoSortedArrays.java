package com.himanshu.freqcodes.iteration;

import java.util.Arrays;

public class MergeTwoSortedArrays {
    public static void main(String[] args) {

        int n1 = (int) (Math.random() * (10 - 1) + 1);
        int n2 = (int) (Math.random() * (10 - 1) + 1);

        int[] arr1 = new int[n1];
        int[] arr2 = new int[n2];

        for (int i = 0; i < n1; i++) {
            arr1[i] = (int) (Math.random() * (100 - 1) + 1);
        }

        for (int i = 0; i < n2; i++) {
            arr2[i] = (int) (Math.random() * (100 - 1) + 1);
        }

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        sortWithoutExtraSpace(arr1, arr2, n1, n2);
        System.out.println("-----------------------------------------------------");
        System.out.println("-----------------------------------------------------");
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));


    }

    private static void sortWithoutExtraSpace(int[] arr1, int[] arr2, int n1, int n2) {

        //The trick here is to decide which element should reside in which array
        //once that's done, sort the arrays at the end
        int i = n1 - 1, j = 0;

        while (i >= 0 && j < n2) {
            if (arr1[i] > arr2[j]) {
                int temp = arr1[i];
                arr1[i] = arr2[j];
                arr2[j] = temp;
                i--;
                j++;
            } else {
                break;
            }
        }
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        Arrays.sort(arr1);
        Arrays.sort(arr2);


    }
}
