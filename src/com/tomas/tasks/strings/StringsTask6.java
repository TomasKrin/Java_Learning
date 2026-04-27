package com.tomas.tasks.strings;

import com.tomas.tasks.TaskProcessor;

import java.util.Scanner;

public class StringsTask6 implements TaskProcessor {
	StringBuilder compressedText = new StringBuilder();

	@Override
	public void run () {
		Scanner scanner = new Scanner(System.in);
		String text;

		System.out.print("Enter some text: ");
		text = scanner.nextLine().toLowerCase();

		char currentChar = text.toCharArray()[0];
		int count = 0;

		for (char c: text.toCharArray()) {
			if (currentChar == c) {
				count++;
			} else {
				updateString(currentChar , count);
				currentChar = c;
				count = 1;
			}
		}

		updateString(currentChar , count);
		System.out.println("Compressed: " + compressedText);

		scanner.close();
	}

	void updateString (char currentChar , int count) {
		if (count > 1) {
			compressedText.append(currentChar).append(count);
		} else {
			compressedText.append(currentChar);
		}
	}
}
