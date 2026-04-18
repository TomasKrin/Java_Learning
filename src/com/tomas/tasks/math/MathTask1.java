package com.tomas.tasks.math;

import com.tomas.tasks.TaskProcessor;
import java.util.Scanner;

public class MathTask1 implements TaskProcessor {
  @Override
  public void run() {
    Scanner scanner = new Scanner(System.in);
    int a;
    int b;
    int target;

    try {
      System.out.print("Enter number A: ");
      a = scanner.nextInt();

      System.out.print("Enter number B: ");
      b = scanner.nextInt();

      System.out.print("Enter target number: ");
      target = scanner.nextInt();

      if (Math.abs(target - a) < Math.abs(target - b)) {
        System.out.println("A is closer");
      } else if (Math.abs(target - a) == Math.abs(target - b)) {
        System.out.println("Both are equally close");
      } else {
        System.out.println("B is closer");
      }

    } catch (Exception e) {
      System.out.println("Invalid input");
    } finally {
      scanner.close();
    }
  }
}
