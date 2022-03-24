package com.himanshu.freqcodes.ExecutorServiceExamples;

public class Task extends Thread {

    private int number;

    public Task(int number) {
        this.number = number;
    }
    @Override
    public void run(){
        for(int i =number*100;i<=number*100+5;i++){
            System.out.println(i+"  "+ "task with number"+ number+"   ");
        }

        System.out.println("task with number     "+number+"    done");
    }

}
