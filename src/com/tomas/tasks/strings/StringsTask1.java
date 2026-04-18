package com.tomas.tasks.strings;

import com.tomas.tasks.TaskProcessor;
import java.util.Scanner;

public class StringsTask1 implements TaskProcessor {
  @Override
  public void run() {
    Scanner scanner = new Scanner(System.in);

    String username;

    System.out.print("Enter username: ");
    username = scanner.nextLine().trim().toLowerCase();

    System.out.println("Cleaned username: " + username);

    scanner.close();
  }
}
