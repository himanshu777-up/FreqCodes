package com.himanshu.freqcodes.Inheritance;

import java.sql.SQLOutput;

public class Vehicle {

    int tyres;
    int gears;
    public int res (int a, int b){
        return a+b;
    }

    public Vehicle(int tyres, int gears) {
        this.tyres = tyres;
        this.gears = gears;
    }

    public Vehicle() {
    }

    public void showDet(){
        System.out.println("Tyres:    "+tyres+"     Gears:   "+gears);
    }

    public void printSome(){
        System.out.println("in parent class");
    }

}
