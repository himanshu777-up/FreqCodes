package com.himanshu.freqcodes.recursion;

import java.util.Scanner;

public class StairPaths {
    public static void main(String[] args) {
        //Print the ways to reach a stair from bottom to top

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the length of the total stairs...");
        int n = scn.nextInt();

        printpaths(n, "");
    }

    private static void printpaths(int n, String path) {

        if (n < 0) return;

        if (n == 0) {
            System.out.println(path);
            return;
        }

        printpaths(n - 10, path + "10->");
        printpaths(n - 5, path + "5->");
        printpaths(n - 2, path + "2->");

    }
}
