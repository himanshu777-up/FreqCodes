package com.himanshu.freqcodes.Inheritance;

interface A {
    void funA();
}

interface B extends A{
    void funB();
}

class C implements B{


    @Override
    public void funB() {

    }

    @Override
    public void funA() {

    }
}


public class InterfaceUnderstand {
    public static void main(String[] args) {

    }
}
