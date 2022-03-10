package com.himanshu.freqcodes.Graph;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class PrintLevelTraverse_copy {

    public static void main(String[] args) {

        String[] stringList = new String[]{"java.util.vector",
                "java.util.date",
                "org.json.JSONObject",
                "java.util.regex.Pattern",
                "org.writequit.Strings"};


        Set<String> parents = new HashSet<String>();
        Map<String, HashSet<String>> map = new HashMap<String, HashSet<String>>();

        for (String str : stringList) {
            String[] child = str.split("[.]");
            parents.add(child[0]);

            for (int i = 0; i < child.length - 1; i++) {
                String par = child[i];
                String chil = child[i + 1];
                map.putIfAbsent(par, new HashSet<>());
                map.get(par).add(chil);
            }
        }

        for (String parent : parents) {
            display(parent, 0, map);
        }


    }

    private static void display(String parent, int count, Map<String, HashSet<String>> map) {
        for(int i=0;i<count;i++){
            System.out.print("--");
        }
        System.out.println(parent);
        count++;
        if(map.get(parent)==null)   return;

        for(String child: map.get(parent)){
            display(child, count, map);
        }


    }


}