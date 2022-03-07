package com.himanshu.freqcodes.Inheritance;

public interface Person {

    public void showDetails();
    default void fun(){
        System.out.println("this is a default method");
    }

    default public void fun2(){
        System.out.println("default");;
    }
    int age =21;
}
