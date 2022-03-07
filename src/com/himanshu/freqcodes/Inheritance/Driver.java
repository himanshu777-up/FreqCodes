package com.himanshu.freqcodes.Inheritance;

class Demo {

    static void show() {
        System.out.println("static method of the parent");
    }

}

class Sample extends Demo {

    static void show() {
        System.out.println("Static method of the child");
    }
}


public class Driver {

    public static void main(String[] args) {

        /*Cars car = new Cars();
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
        System.out.println(c+"   "+d);*/

        Demo d1 = new Demo();
        Demo d2 = new Sample();
        Sample d3 = new Sample();

        d1.show();
        d2.show();
        d3.show();

        //Method hiding is resolved by the reference types, as static methods are resolved by reference types

        Cars car = new Cars();
        Vehicle v1 = new Cars();
        Vehicle v2 = new Vehicle();
        car.printSome();
        v1.printSome();
        v2.printSome();

        Man man = new Man();
        System.out.println(man.age);
        man.showDetails();

    }
}