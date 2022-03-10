package com.himanshu.freqcodes.recursion;

import java.util.Scanner;

public class CheckPalindrome {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();

        if(ifPal(str)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not palindrome");
        }
    }

    private static boolean ifPal(String str) {
        int n = str.length();
        if(n==1 || n==0)    return true;
//        if(n==2){
//            return (str.charAt(0) == str.charAt(1));
//        }
        if(str.charAt(0)!=str.charAt(n-1)){
            return false;
        }
        else {
            return ifPal(str.substring(1, n - 1));
        }
    }
}
