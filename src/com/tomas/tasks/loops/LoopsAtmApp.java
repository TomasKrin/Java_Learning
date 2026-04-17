package com.tomas.tasks.loops;

import com.tomas.tasks.TaskProcessor;
import java.util.Scanner;

public class LoopsAtmApp implements TaskProcessor {
  Scanner scanner = new Scanner(System.in);

  @Override
  public void run() {

    int menuSelection;
    double balance = 1000.00;
    double depositAmout;
    double withdrawalAmout;

    try {
      do {
        menu();
        System.out.print("\nWhat would you like to do? : ");
        menuSelection = scanner.nextInt();

        switch (menuSelection) {
          case 1 -> {
            System.out.print("How much would you like to deposit?: ");
            depositAmout = scanner.nextDouble();

            balance = balance + depositAmout;

            System.out.printf("\nYou have deposited %.2f$ to your balance\n", depositAmout);
            pressEnterToContinue();
          }
          case 2 -> {
            System.out.print("How much would you like to withdraw?: ");
            withdrawalAmout = scanner.nextDouble();

            balance = balance - withdrawalAmout;

            System.out.printf("\nYou have withdrawn %.2f$ from your balance\n", withdrawalAmout);
            pressEnterToContinue();
          }
          case 3 -> {
            System.out.printf("\nYour current balance is: %.2f$\n", balance);
            pressEnterToContinue();
          }
          case 4 -> System.out.println("\nHave a nice day!");
          default -> {
            System.out.println("\nPlease select valid menu option..");
            pressEnterToContinue();
          }
        }

      } while (menuSelection != 4);
    } catch (Exception e) {
      System.out.println("Invalid Input");
    }

    scanner.close();
  }

  void menu() {
    System.out.println("\n1. Deposit to balance");
    System.out.println("2. Withdraw from balance");
    System.out.println("3. Show balance");
    System.out.println("4. Exit");
  }

  void pressEnterToContinue() {
    scanner.nextLine();
    System.out.println("\nPress enter to continue..");
    scanner.nextLine();
    System.out.print("\033[H\033[2J");
    System.out.flush();
  }
}
