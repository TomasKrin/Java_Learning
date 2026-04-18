package com.tomas.tasks.strings;

import com.tomas.tasks.TaskProcessor;

import java.util.Scanner;

public class StringsTask4 implements TaskProcessor {
	@Override
	public void run () {
		Scanner scanner = new Scanner(System.in);

		String sentence;
		int vowels = 0;
		int consonants = 0;

		System.out.print("Enter a sentence: ");
		sentence = scanner.nextLine().toLowerCase();

		// First way:

		//	for (int i = 0; i <= sentence.length() - 1; i++) {
		//		if (sentence.charAt(i) == 'a' || sentence.charAt(i) == 'e' || sentence.charAt(i) == 'i'
		//				|| sentence.charAt(i) == 'o' || sentence.charAt(i) == 'u') {
		//			vowels++;
		//		} else if (Character.isLetter(sentence.charAt(i))) {
		//			consonants++;
		//		}
		//	}

		// Second way:

		for (char c: sentence.toLowerCase().toCharArray()) {
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
				vowels++;
			} else if (Character.isLetter(c)) {
				consonants++;
			}
		}


		System.out.println("Vowels: " + vowels);
		System.out.println("Consonants: " + consonants);

		scanner.close();
	}
}
