package com.himanshu.freqcodes.Inheritance;

public class V2 implements V1 {


    //Necessary to implement all the mothods, which goes against the 'Interface Segregation Principle" of the SOLID priciples

    @Override
    public void func1() {
        System.out.println("func1");

    }

    @Override
    public void func1(int a, int b) {
        System.out.println("func1 with params");
    }

    @Override
    public void func2() {
        System.out.println("fnc2");

    }

    @Override
    public void func3() {
        System.out.println("func3");

    }


}
