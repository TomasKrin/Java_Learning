package com.tomas.tasks.conditions;

import com.tomas.tasks.TaskProcessor;

public class ConditionsTask1 implements TaskProcessor {

    @Override
    public void run() {
        int a = 1;
        int b = 2;

        if (a > b) {
            System.out.println("Variable a is greater than variable b");
        } else {
            System.out.println("Variable a is lesser than variable b");
        }
    }
}