package com.himanshu.freqcodes.Inheritance;

public class Driver {

    public static void main(String[] args) {

        Cars car = new Cars();
//        Cars c1 = new Vehicle();
        Vehicle vehicle = new Cars();

        car.printNow();
        car.printSome();

        System.out.println("-------------------------------------");
        vehicle.printSome();
        ((Cars) vehicle).printNow();


    }
}
