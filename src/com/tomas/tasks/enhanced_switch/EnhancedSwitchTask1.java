package com.tomas.tasks.enhanced_switch;

import com.tomas.tasks.TaskProcessor;
import java.util.Scanner;

public class EnhancedSwitchTask1 implements TaskProcessor {
  @Override
  public void run() {
    Scanner scanner = new Scanner(System.in);

    String command = scanner.nextLine();

    switch (command) {
      case "start" -> System.out.println("System starting...");
      case "stop" -> System.out.println("System stopping...");
      case "restart" -> System.out.println("Restarting system...");
      case "status" -> System.out.println("System running normally");
      // galima case "help", logiskiau default, nes jeigu neteisingas inputas valid response
      default -> System.out.println("Available commands: start, stop, restart, status");
    }

    scanner.close();
  }
}
