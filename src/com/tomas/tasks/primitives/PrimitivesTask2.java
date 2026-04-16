package com.tomas.tasks.primitives;

import com.tomas.tasks.TaskProcessor;

public class PrimitivesTask2 implements TaskProcessor {
    @Override
    public void run() {
        double c = 13.5;
        double f = (c * 9/5) + 32;

        System.out.println("Temperature in celcius is: " + c + "°");
        System.out.println("Temperature in fahrengheit is: " + f + "F");
    }
}
