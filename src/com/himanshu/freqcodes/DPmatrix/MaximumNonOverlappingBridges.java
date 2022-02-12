package com.himanshu.freqcodes.DPmatrix;

import java.util.Arrays;

class Bridge implements Comparable<Bridge> {
    int north;
    int south;

    public Bridge(int north, int south) {
        this.north = north;
        this.south = south;
    }

    @Override
    public int compareTo(Bridge o) {
        if (this.north != o.north) {
            return this.north - o.north;
        } else {
            return this.south - o.south;
        }
    }

    @Override
    public String toString() {
        return "Bridge{" +
                "north=" + north +
                ", south=" + south +
                '}';
    }
}


public class MaximumNonOverlappingBridges {

    //The ques was to find the maximum number of non-overlapping bridges

    public static void main(String[] args) {

        int numberOfBridges = (int)(Math.random()*(20-10)+10);

        System.out.println("numberOfBridges    : "+numberOfBridges);

        int[] north = new int[numberOfBridges];
        int[] south = new int[numberOfBridges];

        for (int i = 0; i < numberOfBridges; i++) {
            int x = (int) (Math.random() * (100 - 1) + 1);
            int y = (int) (Math.random() * (100 - 1) + 1);
            north[i] = x;
            south[i] = y;
        }

        System.out.println(Arrays.toString(north));
        System.out.println(Arrays.toString(south));

        Bridge[] bridges = new Bridge[numberOfBridges];
        for (int i = 0; i < numberOfBridges; i++) {
            bridges[i] = new Bridge(north[i], south[i]);
        }

        for (Bridge bridge : bridges) {
            System.out.print(bridge + "     ");
        }

        System.out.println("");

        Arrays.sort(bridges);

        for (Bridge bridge : bridges) {
            System.out.print(bridge + "     ");
        }
        System.out.println("");

        int[] DP = new int[numberOfBridges];
        int res = 0;

        for (int i = 0; i < numberOfBridges; i++) {
            int max = 0;
            for (int j = 0; j < i; j++) {
                if (bridges[j].south < bridges[i].south) {
                    max = Math.max(DP[j], max);
                }
            }

            DP[i] = 1 + max;
            res = Math.max(DP[i], res);
        }

        System.out.println("Max no of bridges is:      "+res);

    }
}
