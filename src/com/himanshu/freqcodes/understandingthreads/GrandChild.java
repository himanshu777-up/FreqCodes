package com.himanshu.freqcodes.understandingthreads;

public class GrandChild extends Child{

    String surname;

    public GrandChild(int age, String name, int roll, String surname) {
        super(age, name, roll);
        this.surname = surname;
    }
}
