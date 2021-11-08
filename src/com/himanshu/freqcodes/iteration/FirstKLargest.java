package com.himanshu.freqcodes.iteration;

import java.util.*;

public class FirstKLargest {
    public static void main(String[] args) {
        //printing first 10 largest numbers
        int[] arr = new int[100];
        for (int i = 0; i < 100; i++) {
            arr[i] = (int) (Math.random() * (100000 - 1) + 1);
        }
        System.out.println("The array is.........");

        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println(" ");

        ArrayList<Integer> res = new ArrayList<>();
        PriorityQueue<Integer> pq = new PriorityQueue<>(); //min heap to find max 10 numbers

        for (int i : arr) {
            pq.add(i);
            if (pq.size() > 10) {
                pq.poll();
            }
        }

        while (!pq.isEmpty()) {
            res.add(pq.poll());
        }

        System.out.println(res);

    }
}
