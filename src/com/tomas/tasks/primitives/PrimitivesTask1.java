package com.tomas.tasks.primitives;

import com.tomas.tasks.TaskProcessor;

public class PrimitivesTask1 implements TaskProcessor {

  @Override
  public void run() {
    int a = 1;
    int b = 2;
    System.out.println(a + b);
  }
}
