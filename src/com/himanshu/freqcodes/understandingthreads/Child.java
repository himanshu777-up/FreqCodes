package com.himanshu.freqcodes.understandingthreads;

public class Child extends Parent{

    int roll;

    public Child(int age, String name, int roll) {
        super(age, name);
        this.roll = roll;
    }
}
