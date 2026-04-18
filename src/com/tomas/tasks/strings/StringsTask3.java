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


		if (emailPart1.length() >= 2) {
			for (int i = 1; i < emailPart1.length() - 1; i++) {
				emailPart1 = emailPart1.replace(emailPart1.charAt(i) , '*');
			}
			email = emailPart1 + emailPart2;
			System.out.println("Masked email: " + email);
		} else {
			System.out.println("Masked email: " + email);
		}


		scanner.close();
	}
}
