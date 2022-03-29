package com.himanshu.freqcodes.UnderstandingExceptions;

import java.util.Scanner;
class MyExc extends Exception{
    public MyExc(String message) {
        super(message);
    }
}


public class ExcUnd {

    static int b;
    static int a;
    private static int fun(){
        b += a;
        return b;

    }

    static void validate(int a) throws MyExc {
        if(a<0){
            throw new MyExc("put a bigger number please");
        }
    }

    public static void main(String[] args) {


        int n;
        Scanner scn = new Scanner(System.in);
        n = scn.nextInt();

        try {
            validate(n);
        }
        catch (MyExc e){
            System.out.println("exc found");
            System.out.println(e.getMessage());
        }



    }
/*
    private static void func2(int n) {

        while (n-- > 0) {
            try {
                System.out.println(n);
                if (n == 6) {
                    throw new Exception("n==6 found");
                }
            } catch (Exception e) {
                System.out.println("came out");
            }
        }

    }

    private static void func(int n) {
        try {
            if (n == 5) {
                throw new Exception("ye kya kar rha hai");
            }

            while (n-- > 0) {
                System.out.println("no exception was found");
            }
        } catch (Exception e) {
            System.out.println("catch block");
        }


    }*/


}
