package com.tomas.tasks.loops;

import com.tomas.tasks.TaskProcessor;

import java.util.Scanner;

public class LoopsAtmApp implements TaskProcessor {
	Scanner scanner = new Scanner(System.in);

	public static void menu () {
		System.out.println("\n1. Deposit to balance");
		System.out.println("2. Withdraw from balance");
		System.out.println("3. Show balance");
		System.out.println("4. Exit");
	}

	public void pressEnterToContinue () {
		scanner.nextLine();
		System.out.println("\nPress enter to continue..");
		scanner.nextLine();
		System.out.print("\033[H\033[2J");
		System.out.flush();
	}

	@Override
	public void run () {

		int menuSelection = 0;
		double balance = 1000.00;
		double depositAmount;
		double withdrawalAmount;

		do {
			try {
				menu();
				System.out.print("\nWhat would you like to do? : ");
				menuSelection = scanner.nextInt();

				switch (menuSelection) {
					case 1 -> {
						System.out.print("How much would you like to deposit?: ");
						depositAmount = scanner.nextDouble();

						if (depositAmount >= 0) {
							balance = balance + depositAmount;
							System.out.printf("\nYou have deposited %.2f$ to your balance\n" , depositAmount);
							pressEnterToContinue();
						} else {
							System.out.println("\nYou can't deposit a negative amount!");
							pressEnterToContinue();
						}
					}
					case 2 -> {
						System.out.print("How much would you like to withdraw?: ");
						withdrawalAmount = scanner.nextDouble();

						if (withdrawalAmount >= 0) {
							if (balance > 0 && withdrawalAmount <= balance) {
								balance = balance - withdrawalAmount;
								System.out.printf("\nYou have withdrawn %.2f$ from your balance\n" , withdrawalAmount);
								pressEnterToContinue();
							} else {
								System.out.println("\nYou can't withdraw more than your current balance!");
								pressEnterToContinue();
							}
						} else {
							System.out.println("\nYou can't withdraw a negative amount!");
							pressEnterToContinue();
						}
					}
					case 3 -> {
						System.out.printf("\nYour current balance is: %.2f$\n" , balance);
						pressEnterToContinue();
					}
					case 4 -> System.out.println("\nHave a nice day!");
					default -> {
						System.out.println("\nPlease select valid menu option..");
						pressEnterToContinue();
					}
				}
			} catch (Exception e) {
				System.out.println("\nInvalid Input");
				pressEnterToContinue();
			}
		} while (menuSelection != 4);
		scanner.close();
	}

}
