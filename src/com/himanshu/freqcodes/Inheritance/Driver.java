package com.himanshu.freqcodes.Inheritance;

public class Driver {

    public static void main(String[] args) {

        Cars car = new Cars();
//        Cars c1 = (Cars) new Vehicle();
        Vehicle vehicle = new Cars();

        car.printNow();
        car.printSome();

        System.out.println("-------------------------------------");
        vehicle.printSome();
        ((Cars) vehicle).printNow();

        int a = 100;
        double b = 200.5;

        int c = (int)b;
        double d = (double)a;
        System.out.println(c+"   "+d);

    }
}