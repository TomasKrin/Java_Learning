package com.tomas.tasks.conditions;

import com.tomas.tasks.TaskProcessor;
import java.util.Scanner;

public class ConditionsTask2 implements TaskProcessor {
  @Override
  public void run() {
    Scanner scanner = new Scanner(System.in);

    int hour;
    boolean hasCard;
    boolean isEmployee;

    try {
      System.out.print("Do you have a card? (true/false): ");
      hasCard = scanner.nextBoolean();

      if (hasCard) {
        System.out.print("Are you an employee? (true/false): ");
        isEmployee = scanner.nextBoolean();

        System.out.print("What hour is there currently? (number 0-23): ");
        hour = scanner.nextInt();

        if (isEmployee) {
          if (hour >= 6 && hour < 12) {
            System.out.println("Access granted");
          } else {
            System.out.println("Access denied: Outside allowed hours");
          }

        } else {
          if (hour >= 9 && hour < 18) {
            System.out.println("Access granted");
          } else {
            System.out.println("Access denied: Outside allowed hours");
          }
        }

      } else {
        System.out.println("Access denied: No card");
      }
    } catch (Exception e) {
      System.out.println("Invalid input");
    }

    scanner.close();
  }
}
