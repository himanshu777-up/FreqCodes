package com.himanshu.freqcodes.SlidingWindow;

import java.util.HashMap;

public class LongestSubstringWithoutRepeatingCharacters {

    public static void main(String[] args) {

        char[] arr = new char[100];
        System.out.println("Generating the string...");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (char) (Math.random() * (122 - 97) + 97);
//            System.out.println(arr[i]);
        }

        String str = String.valueOf(arr);
        System.out.println(str);

        int res = longestSubstring(str);
        System.out.println(res);

    }

    private static int longestSubstring(String str) {

        int n = str.length();
        if (n == 0) return 0;

        HashMap<Character, Integer> map = new HashMap<>();
        for (char ch : str.toCharArray()) {
            map.put(ch, 0);
        }

        map.put(str.charAt(0), 1);
        int res = 1;

        int i = 0, j = 1;

        while (true) {

            if (j == n) break;

            if (map.get(str.charAt(j)) == 0) {
                map.put(str.charAt(j), 1);
                res = Math.max(res, j - i + 1);
                System.out.println(str.substring(i, j + 1));
                j++;
            } else {
                map.put(str.charAt(i), 0);
                i++;
            }
        }

        return res;
    }

}