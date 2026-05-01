package com.tomas.tasks.method;

import com.tomas.tasks.TaskProcessor;

import java.util.Arrays;

public class MethodTask2 implements TaskProcessor {
	public void run () {
		String word = "ha";
		int times = 3;
		String separator = "-";

		word = "go";
		times = 1;
		separator = ", ";

		word = "ab";
		times = 4;
		separator = ".";

		word = "!";
		times = 2;
		separator = " ";

		System.out.println("No separator: " + repeat(word , times));
		System.out.println("With Separator: " + repeat(word , times , separator));
	}

	String repeat (String word , int times) {
		// #1.
//		String conStr;
//		String[] words = new String[times];
//		Arrays.fill(words , word);
//		conStr = String.join("" , words);

		// #2.
		String conStr = "";
		for (int i = 1; i <= times; i++) {
			if (i > 2) {
				conStr = conStr.concat(word);
			} else {
				conStr = word.concat(word);
			}
		}
		return times == 1 ? word : conStr;
	}

	String repeat (String word , int times , String separator) {
		String[] words = new String[times];
		String joinStr;

		Arrays.fill(words , word);
		joinStr = String.join(separator , words);
		return times == 1 ? word : joinStr;
	}
}
