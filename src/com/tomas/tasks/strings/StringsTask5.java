package com.tomas.tasks.strings;

import com.tomas.tasks.TaskProcessor;

import java.util.Scanner;

public class StringsTask5 implements TaskProcessor {
	@Override
	public void run () {
		Scanner scanner = new Scanner(System.in);
		StringBuilder stringBuilder = new StringBuilder();

		String sentence;
		String[] sentenceSplitArr;

		System.out.print("Enter a sentence: ");
		sentence = scanner.nextLine().trim();
		sentenceSplitArr = sentence.split("\\s+");
		
		String[] tempSentenceArray = new String[sentenceSplitArr.length];

		for (int i = sentenceSplitArr.length - 1; i >= 0; i--) {
			stringBuilder.setLength(0);
			String word = sentenceSplitArr[i];
			String reversedWord = stringBuilder.append(word).reverse().toString();
			tempSentenceArray[i] = reversedWord;
		}

		System.out.println(String.join(" " , tempSentenceArray));

		scanner.close();
	}
}
