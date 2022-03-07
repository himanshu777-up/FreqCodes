package com.himanshu.freqcodes.Inheritance;

public class Man implements Person{
    @Override
    public void showDetails() {
        System.out.println("in the implemented method");
    }

    public Man() {

    }

    @Override
    public void fun() {
        System.out.println("deaule one updated");
    }

    public static void main(String[] args) {
        Man man = new Man();
        man.fun();
        man.fun2();
    }
}


