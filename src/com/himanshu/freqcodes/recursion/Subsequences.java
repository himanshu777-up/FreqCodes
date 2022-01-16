package com.himanshu.freqcodes.recursion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Subsequences {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the string to print subsequences...");
        String str = scn.next();
        List<String> res = new ArrayList<>();

        subseq(res, str, "");

        System.out.println(res);
        System.out.println(res.size());
    }

    private static void subseq(List<String> res, String ques, String ans) {

        System.out.println("ques is   "+ ques+"   and ans is    "+ans);
        if (ques.length() == 0) {
            res.add(ans);
            return;
        }

        char ch = ques.charAt(0);
        subseq(res, ques.substring(1), ans + ch);
        subseq(res, ques.substring(1), ans);
    }
}
