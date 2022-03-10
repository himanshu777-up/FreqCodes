package com.himanshu.freqcodes.understandingthreads;

import java.util.*;

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

class Player{
    int age;
    int rank;
    Player(int age, int rank){
        this.age = age;
        this.rank = rank;
    }
}
class PlayerCom implements Comparator<Player>{

    @Override
    public int compare(Player o1, Player o2) {
        return o1.age - o2.age;
    }
}

class Cricket implements Comparable<Cricket>{
    int age;
    Cricket(int age){
        this.age = age;
    }

    @Override
    public int compareTo(Cricket o) {
        return Integer.compare(age , o.age);
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

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(1); pq.add(2);   pq.add(3);  pq.add(4); pq.offer(10);
        pq.remove(2);

        System.out.println(pq);

        List<Player> players = new ArrayList<>();
        players.add(new Player(1, 1));
        players.add(new Player(2, 5));
        players.add(new Player(3, 2));
        players.add(new Player(4, 9));
        PlayerCom playerCom = new PlayerCom();
        Collections.sort(players, playerCom);

        for(Player player: players){
            System.out.println(player.age+"    "+player.rank);
        }

        List<Cricket> crickets = new ArrayList<>();
        for(int i =0;i<10;i++){
            crickets.add(new Cricket(100-i));
        }
        Collections.sort(crickets);
        for(Cricket c: crickets){
            System.out.print(c.age+"   ");
        }


    }



}
