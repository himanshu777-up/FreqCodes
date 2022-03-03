package com.himanshu.freqcodes.JAVAConcepts;

import java.util.HashMap;
import java.util.Map;

public class UnderstansingMaps {

    public static void main(String[] args) {
        Map<Person, Integer> map = new HashMap<>();
        Person p1 = new Person(1, "1");
        Person p2 = new Person(2, "2");
        Person p3 = new Person(3, "3");
        Person p4 = new Person(4, "4");
        Person p5 = p1;
        map.put(p1, 1);
        map.put(p2, 2);
        map.put(p3, 3);
        map.put(p4, 4);
        map.put(p5, 5);

        System.out.println(map.size());

        Map<Integer, Object> m = new HashMap<>();
        m.put(1, null);
        m.put(5, null);
        m.put(2, null);

        System.out.println(m);

        String s1 = "hello";
        s1 += " world";
        String s2 = "hello ";
        s2 += "world";
        System.out.println(s1);
        System.out.println(s1.intern());
        boolean flag = s1.intern()==s2.intern();
        System.out.println(flag);
        System.out.println(s1.equals(s2));

        String s3 = s1.intern();
        String s4 = s2.intern();
        System.out.println(s3.equals(s4));
    }


}
