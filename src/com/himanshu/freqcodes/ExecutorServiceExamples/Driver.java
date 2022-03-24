package com.himanshu.freqcodes.ExecutorServiceExamples;

import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Driver {

    public static void main(String[] args) {



        Task task1 = new Task(1);
        Task task2 = new Task(2);
        Task task3 = new Task(3);
        Task task4 = new Task(4);
        Task task5 = new Task(5);

//        List<Integer> list = List.of(1, 2, 3);      //new way of initializing lists
//        System.out.println(list);

        ExecutorService executorService = Executors.newFixedThreadPool(2);

        executorService.execute(task1);
        executorService.execute(task2);
        executorService.execute(task3);
        executorService.execute(task4);
        executorService.execute(task5);

        executorService.shutdown();

    }
}
