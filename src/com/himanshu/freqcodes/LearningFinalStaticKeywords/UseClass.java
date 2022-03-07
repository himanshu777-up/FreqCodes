package com.himanshu.freqcodes.LearningFinalStaticKeywords;

class Parent {
    static int age;
    final int limit;
    static final int num = 5;

    Parent() {
        limit = 500;

    }
}


public class UseClass {

    public static void main(String[] args) {


        Sample s1 = new Sample();
//        s1.idStatic = 1;
        System.out.println(s1.idFinal);
        System.out.println(s1.idStatic);
//        s1.idStatic += 1;

        System.out.println(s1);
        System.out.println("------------------------------------------------------------------------");

        Sample s2 = new Sample();
        System.out.println(s2.idFinal);
        System.out.println(s2.idStatic);
        System.out.println(s2);
        System.out.println("------------------------------------------------------------------------");

        final Sample s3 = new Sample();
        System.out.println(s3.idFinal);
        System.out.println(s3.idStatic);

        s3.setMarks(99);
        s3.setRollNo(5);
        System.out.println(s3);
        System.out.println("------------------------------------------------------------------------");

        System.out.println("**************************************************************************************");

        System.out.println(s1.idFinalStatic);
        System.out.println("----------------------------------------------------------------------------------");
        System.out.println("----------------------------------------------------------------------------------");

        Parent p1 = new Parent();
        Parent p2 = new Parent();
        Parent.age = 100;
        p1.age++;
        p2.age++;


        System.out.println(Parent.age);
        System.out.println(p1.age);
        System.out.println(p2.age);
        System.out.println(p1.limit);
        System.out.println(p2.limit);
        System.out.println(p1.num);

    }
}
