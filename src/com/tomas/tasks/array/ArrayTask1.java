package com.tomas.tasks.array;

import com.tomas.tasks.TaskProcessor;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ArrayTask1 implements TaskProcessor {
	Scanner scanner = new Scanner(System.in);

	@Override
	public void run () {
		int[] arr;
		int length;

		try {
			System.out.print("Enter the length of the array (integer): ");
			length = scanner.nextInt();
			scanner.nextLine();

			arr = new int[length];
			addToArray(arr);
			shiftLeft(arr);

			for (int e: arr) {
				System.out.print(e + " ");
			}

		} catch (InputMismatchException _) {
			System.out.println("Invalid input");
		}

		scanner.close();
	}

	void addToArray (int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(i + 1);
			System.out.print("Enter #" + (i + 1) + " number (integer): ");
			arr[i] = scanner.nextInt();
		}
	}

	void shiftLeft (int[] arr) {
		int temp = arr[0];
		for (int i = 0; i < arr.length - 1; i++) {
			arr[i] = arr[i + 1];
		}
		arr[arr.length - 1] = temp;
	}
}