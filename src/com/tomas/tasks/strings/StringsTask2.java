package com.tomas.tasks.strings;

import com.tomas.tasks.TaskProcessor;

import java.util.Scanner;

public class StringsTask2 implements TaskProcessor {
	@Override
	public void run () {
		Scanner scanner = new Scanner(System.in);
		StringBuilder stringBuilder = new StringBuilder();

		String text;
		String reversedText;

		System.out.print("Enter some text: ");
		text = scanner.nextLine().trim().replaceAll("[\\p{Z}\\p{C}\\p{P}\\p{S}]" , "");

		reversedText = stringBuilder.append(text).reverse().toString();

		if (text.equalsIgnoreCase(reversedText)) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not a Palindrome");
		}

		scanner.close();
	}
}
