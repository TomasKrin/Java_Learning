package com.tomas.tasks.strings;

import com.tomas.tasks.TaskProcessor;

import java.util.Scanner;

public class StringsTask3 implements TaskProcessor {
	@Override
	public void run () {
		Scanner scanner = new Scanner(System.in);

		String email;
		int atSymbolIndex;
		String emailPart1;
		String emailPart2;

		System.out.print("Enter your email: ");
		email = scanner.nextLine();

		atSymbolIndex = email.indexOf("@");
		emailPart1 = email.substring(0 , atSymbolIndex);
		emailPart2 = email.substring(atSymbolIndex);
		
		if (emailPart1.length() > 2) {
			char firstLetter = emailPart1.charAt(0);
			char lastLetter = emailPart1.charAt(emailPart1.length() - 1);
			emailPart1 = firstLetter + "***" + lastLetter;

			email = emailPart1 + emailPart2;
			System.out.println("Masked email: " + email);
		} else {
			System.out.println("Masked email: " + email);
		}

		scanner.close();
	}
}
