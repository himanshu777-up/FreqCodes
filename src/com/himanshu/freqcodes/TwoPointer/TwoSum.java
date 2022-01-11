package com.himanshu.freqcodes.TwoPointer;

import java.util.*;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = new int[10000];
        System.out.println("Generating the arrays...");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * (50 - 1) + 1);
            System.out.print(arr[i]+"  ");
        }

        System.out.println("   .......    ");

        int target = (int) (Math.random() * (100 - 1) + 1);

        System.out.println("Finding the indices which sum to the:    " + target);

        ArrayList<Integer> res = new ArrayList<>();
        findIndices(arr, target, res);
        if(res.size()!=0) {
            System.out.println(res);
            System.out.println(arr[res.get(0)]+"      "+arr[res.get(1)]);
        }
    }

    private static void findIndices(int[] arr, int target, ArrayList res) {

        Map<Integer, Integer> map = new HashMap<>();
        int n = arr.length;

        for (int i = 0; i < n; i++) {

            if (map.containsKey(target - arr[i])) {
                res.add(i);
                res.add(map.get(target - arr[i]));
                return;
            } else {
                map.put(arr[i], i);
            }

        }

        return;
    }
}
