package com.himanshu.freqcodes.recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class NumberUsingGivenNumbers {

    //Number of ways to create a number using given set of numbers
    public static void main(String[] args) {

        System.out.println("Enter the number to be formed...");
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        System.out.println("Enter the resources...");
        int[] resource = new int[3];
        resource[0] = scn.nextInt();
        resource[1] = scn.nextInt();
        resource[2] = scn.nextInt();

        Arrays.sort(resource);
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();

        printways(res, n, resource, new ArrayList<Integer>(), 1);
        System.out.println("Number of ways is:   " + res.size());
//        System.out.println(res);
        for (ArrayList arr : res) {
            System.out.println(arr);
        }
    }

    private static void printways(ArrayList<ArrayList<Integer>> res, int n, int[] resource, ArrayList<Integer> ans, int min) {

        if (n == 0) {
            res.add(new ArrayList<>(ans));
            return;
        }

        for (int i : resource) {
            if (i <= n && i >= min) { //added min to have only unique comninations (non repeating), so its an increasing sequence
                ans.add(i);
                printways(res, n - i, resource, ans, i);
                ans.remove(ans.size() - 1);
            }
        }
    }
}
