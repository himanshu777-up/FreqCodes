package com.himanshu.freqcodes.iteration;

public class ReverseInteger {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            int num = (int) (Math.random() * (100000 - 1) + 1);
            int rev_num = reverseNum(num);
            System.out.println("Original Number: " + num);
            System.out.println("Reversed one: " + rev_num);

        }
    }

    private static int reverseNum(int num) {
        int res = 0;
        while (num != 0) {
            int val = num % 10;
            num /= 10;
            res = res * 10 + val;
        }
        return res;
    }
}
