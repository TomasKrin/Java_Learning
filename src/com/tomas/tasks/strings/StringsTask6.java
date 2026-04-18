package com.tomas.tasks.strings;

import com.tomas.tasks.TaskProcessor;

import java.util.Scanner;

public class StringsTask6 implements TaskProcessor {
	@Override
	public void run () {
		Scanner scanner = new Scanner(System.in);
		StringBuilder compressedText = new StringBuilder();

		String text;

		System.out.print("Enter some text: ");
		text = scanner.nextLine().toLowerCase();

		char currentChar = text.toCharArray()[0];
		int count = 0;
		

		for (char c: text.toCharArray()) {
			if (currentChar == c) {
				System.out.println(currentChar);
				count++;
			} else {
				compressedText.append(currentChar).append(count);
				currentChar = c;
				count = 1;
			}
		}

		compressedText.append(currentChar).append(count);

		System.out.println(compressedText);

		scanner.close();
	}
}
