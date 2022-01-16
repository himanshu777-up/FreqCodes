package com.himanshu.freqcodes.recursion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringPermutations {

    public static void main(String[] args) {

        //Permutations of a given string
//        Scanner scn = new Scanner(System.in);
//        System.out.println("Enter the string to permute...");
//        String str = scn.next();

        char[] arr = new char[4];
        System.out.println("Generating the string...");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (char) (Math.random() * (122 - 97) + 97);
//            System.out.println(arr[i]);
        }

        String str = String.valueOf(arr);
        System.out.println(str);

        List<String> res = new ArrayList<String>();
        permute(str, res, "");

        System.out.println(res);
        System.out.println(res.size());

    }

    private static void permute(String ques, List<String> res, String ans) {
        if (ques.length() == 0) {
            res.add(ans);
        } else {
            for (int i = 0; i < ques.length(); i++) {
                char ch = ques.charAt(i);
                String rest_ques = ques.substring(0, i) + ques.substring(i + 1);
                permute(rest_ques, res, ans + ch);
            }
        }
    }
}
