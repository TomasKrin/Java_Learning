package com.tomas.tasks.primitives;

import com.tomas.tasks.TaskProcessor;

public class PrimitivesTask4 implements TaskProcessor {

    @Override
    public void run() {
        int a;

        int b = 1;
        int c = 2;

        System.out.println("b value is: " + b);
        System.out.println("c value is: " + c);

        a = b;

        System.out.println("swap, third value a is: " + a);

        b = c;
        c = a;

        System.out.println("b value is: " + b);
        System.out.println("c value is: " + c);

        System.out.println("BONUS: ");
        int d = 3;
        int e = 4;

        System.out.println("d value is: " + d);
        System.out.println("e value is: " + e);
        System.out.println("SWAP");

        d = e + d;
        e = d - e;
        d = d - e;

        System.out.println("d value is: " + d);
        System.out.println("e value is: " + e);
    }
}
