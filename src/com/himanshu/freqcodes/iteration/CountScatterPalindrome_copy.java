package com.himanshu.freqcodes.iteration;

import java.util.HashMap;
import java.util.Map;

public class CountScatterPalindrome_copy {

    //basically we are counting the number of palindromic substrings


    public static void main(String[] args) {

        String s = "abzcdzzzzz";
        int answer = 0;
        Map<Integer, Integer> m = new HashMap<>();
        m.put(0, 1);

        int x = 0;
        for (char c : s.toCharArray()) {
            int d = c - 'a';
            x ^= 1 << d;
            answer = answer + m.getOrDefault(x, 0);
            for (int i = 0; i < 26; ++i) {
                answer += m.getOrDefault(x ^ (1 << i), 0);
            }
            m.put(x, m.getOrDefault(x, 0) + 1);
            System.out.println(m);
        }

//        System.out.println(m);

        System.out.println(answer);
    }
}