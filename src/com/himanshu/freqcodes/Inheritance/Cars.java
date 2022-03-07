package com.himanshu.freqcodes.Inheritance;

public class Cars extends Vehicle{

    int suspension;
    public void func(){
        System.out.println("tyres:  "+tyres+"     gears:    "+gears+"   suspension"+ suspension);
    }

//    public Cars(int tyres, int gears, int suspension) {
//        super(tyres, gears);
//        this.suspension = suspension;
//    }

    public Cars() {
    }

    public void printNow(){
        System.out.println("in child class");
    }

    public void printSome(){
        System.out.println("in child class");
    }

    @Override
    public int res (int x, int y){
        return (int) (x+y);
    }
}
