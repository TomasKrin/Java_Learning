package com.tomas.tasks;

import com.tomas.tasks.primitives.Task1;
import com.tomas.tasks.primitives.Task2;
import com.tomas.tasks.primitives.Task3;
import com.tomas.tasks.primitives.Task4;

public class Main {
    public static void main(String[] args) {
        System.out.println("_____TASK 1:_____");
        Task1 task1 = new Task1();
        task1.main(null);
        System.out.println("_____TASK 2:_____");
        Task2 task2 = new Task2();
        task2.main(null);
        System.out.println("_____TASK 3:_____");
        Task3 task3 = new Task3();
        task3.main(null);
        System.out.println("_____TASK 4:_____");
        Task4 task4 = new Task4();
        task4.main(null);
    }
}