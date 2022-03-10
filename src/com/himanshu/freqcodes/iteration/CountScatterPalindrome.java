package com.himanshu.freqcodes.iteration;

import java.util.HashMap;
import java.util.Map;

public class CountScatterPalindrome {

    //basically we are counting the number of palindromic substrings


    public static void main(String[] args) {

        String s = "axyzbcnmlk";
        int n = s.length();
        int answer = 0;
        Map<Integer, Integer> m = new HashMap<>();
        m.put(0, 1);

        int x = 0;
        for (char c : s.toCharArray()) {
            int d = c - 'a';
            System.out.print(x+"   "+d+"     "+(long)(x + Math.pow(2, d))+"       ");
            x ^= 1 << d;
            System.out.print(1<<d);
            System.out.println("     "+x);
            System.out.println("---------------------");
            //a<<b means multiplying a with 2 raised to power b: a<<b = a*(2^b)
            //x^(1<<d) is equal to x + 2 raised to power d = x + 2^d
            answer = answer + m.getOrDefault(x, 0);
            for (int i = 0; i < 26; ++i) {
                answer += m.getOrDefault(x ^ (1 << i), 0);
            }
            m.put(x, m.getOrDefault(x, 0) + 1);
        }

        System.out.println(answer);


//        int q = 7^10;
//        System.out.println(q);
//
//        int w = 22<<2;
//        System.out.println(w);
//
//        int[] arr=new int[]{1,2,3,2,3,5,1};
//        int res= 0;
//        for(int i: arr){
//            res  ^= i;
//            System.out.print(res+" ");
//        }
//        System.out.println("");
//
//        int xorof2 = 0^2;
//        System.out.println(xorof2);


    }
}