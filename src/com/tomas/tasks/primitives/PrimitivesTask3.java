package com.tomas.tasks.primitives;

import com.tomas.tasks.TaskProcessor;

public class PrimitivesTask3 implements TaskProcessor {

  @Override
  public void run() {
    char t = 't';
    int ascii = (int) t;

    System.out.println("Character is: " + t);
    System.out.println("ASCII number is: " + ascii);
  }
}
