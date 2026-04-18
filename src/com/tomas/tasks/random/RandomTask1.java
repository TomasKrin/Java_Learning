package com.tomas.tasks.random;

import com.tomas.tasks.TaskProcessor;

import java.util.Random;
import java.util.Scanner;

public class RandomTask1 implements TaskProcessor {
	@Override
	public void run () {
		int userGuess;
		int randomNumber;

		Scanner scanner = new Scanner(System.in);
		Random random = new Random();

		randomNumber = random.nextInt(1 , 11);

		try {
			System.out.print("Guess the number (1-10): ");
			userGuess = scanner.nextInt();

			if (userGuess >= 1 && userGuess <= 10) {
				System.out.println("Random number: " + randomNumber);
				System.out.println("Your guess: " + userGuess);

				if (randomNumber == userGuess) {
					System.out.println("Exact match! You win!");
				} else if (Math.abs(randomNumber - userGuess) == 1) {
					System.out.println("Close!");
				} else {
					System.out.println("Wrong guess");
				}

			} else {
				System.out.println("The value you entered is outside of range 1-10.");
			}

		} catch (Exception e) {
			System.out.println("Invalid input");

		} finally {
			scanner.close();
		}
	}
}
