package com.himanshu.freqcodes.understandingthreads;

class Task extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("## Printing doc number:    " + i + "      Printer 1");
        }
    }
}

class RunTask implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("** Printing doc number:    " + i + "      Printer 3");
        }
    }
}

class Printer{
    void printPapers(String name, int copy) {
        for(int i =1;i<=copy;i++){
//            Thread.sleep(100);
            System.out.println("Printing the doc of    "+name+"    copy number is :  "+ i);
        }
    }
}

class MyThread extends Thread{

    Printer p;
    MyThread(Printer p){
        this.p = p;
    }

    @Override
    public void run(){
        synchronized (p) {
            p.printPapers("Himanshu", 10);
        }
    }
}

class MyThread1 extends Thread{

    Printer p;
    MyThread1(Printer p){
        this.p = p;
    }

    @Override
    public void run(){
        synchronized (p) {
            p.printPapers("Golu", 10);
        }
    }
}

public class ThreadBasics {

    //Code to understand two things
    //1. Thread and runnable things
    //2. Executor service and countdown latch

    public static void main(String[] args) {

        System.out.println("App started");
//        Task task = new Task();
//        task.start();
//
//        Runnable r = new RunTask();
//        Thread task2 = new Thread(r);
//        task2.start();
//
//        new Thread(new RunTask()).start();
//
//        for (int i = 0; i < 10; i++) {
//            System.out.println("@@ Printing doc number:    " + i + "      Printer 2");
//        }

        Printer p = new Printer();
        MyThread1 m1 = new MyThread1(p);
        m1.start();
//        try {
//            m1.join();
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }

        MyThread m2= new MyThread(p);
        m2.start();
        System.out.println("App stopped");
    }

}
