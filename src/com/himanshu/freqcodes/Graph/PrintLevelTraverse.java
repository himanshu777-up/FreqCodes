package com.himanshu.freqcodes.Graph;

import java.util.*;

public class PrintLevelTraverse {

    public static void main(String[] args) {

        Set<String> Parents = new HashSet<>();
        Map<String, HashSet<String>> treeMap = new HashMap<>();

        String[] stringList = new String[]{"java.util.vector",
                                            "java.util.date",
                                            "org.json.JSONObject",
                                            "java.util.regex.Pattern",
                                            "org.writequit.Strings"};

        for (String string : stringList) {
            String[] temp = string.split("[.]");
            Parents.add(temp[0]);
            for (int i = 0; i < temp.length - 1; i++) {
                String curr = temp[i];
                String next = temp[i + 1];
                treeMap.putIfAbsent(curr, new HashSet<>());
                treeMap.get(curr).add(next);

            }
        }
/*
        for(String str: treeMap.keySet()){
            System.out.println(str+"     "+ treeMap.get(str));
        }

        for(String parent: Parents){
            System.out.println(treeMap.get(parent));
        }
*/
        System.out.println(Parents.toString());

        for (String parent : Parents) {

            display(parent, 0, treeMap);

        }

    }

    private static void display(String parent, int count, Map<String, HashSet<String>> treeMap) {

        for (int i = 0; i < count; i++) {
            System.out.print("  ");
        }
        System.out.print("-");
        System.out.println(parent);
        count++;
        if (treeMap.get(parent) == null) return;

        for (String child : treeMap.get(parent)) {
            display(child, count, treeMap);
        }

    }
}
