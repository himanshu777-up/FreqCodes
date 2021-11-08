package com.himanshu.freqcodes.iteration;

import java.util.*;

public class StudentWithHighAvg {

    public static void main(String[] args) {
        String[][] scores = {{"Bob", "87"}, {"Mike", "35"}, {"Bob", "502"}, {"Jason", "35"}, {"Mike", "55"}, {"Jessica", "99"}, {"Jason", "25"}};
        int res = 0;

        Map<String, ArrayList<Integer>> map = new HashMap<String, ArrayList<Integer>>();
        for (String[] s : scores) {

            if (map.containsKey(s[0])) {
                ArrayList<Integer> curr = new ArrayList<>(map.get(s[0]));
                curr.add(Integer.parseInt(s[1]));
                map.put(s[0], curr);
            } else {
                ArrayList<Integer> curr = new ArrayList<>();
                curr.add(Integer.parseInt(s[1]));
                map.put(s[0], curr);

            }
        }

        for (String s : map.keySet()) {
            System.out.println(s + "   " + map.get(s) + "    " + avg(map.get(s)));
        }

        PriorityQueue<String> pq = new PriorityQueue<>((b, a) -> avg(map.get(a)) - avg(map.get(b)));
        for (String s : map.keySet()) {
            pq.add(s);
        }
        System.out.println(pq.poll());
    }

    private static int avg(ArrayList<Integer> arr) {
        int sum = 0;
        for (int i : arr) sum += i;
        sum = sum / arr.size();

        return sum;
    }
}
