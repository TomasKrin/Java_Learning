package com.tomas.tasks.constructorsAndOOP.constructorsAndOOPTask3;

public class BankAccount {
	private final String accountHolder;
	private final String accountNumber;
	double balance = 0.0;

	BankAccount(String accountHolder , double initialBalance){
		this.accountHolder = accountHolder;
		this.accountNumber = "ACC_" + (System.nanoTime() % 100000);

		if (initialBalance >= 0) {
			this.balance = initialBalance;
		} else {
			System.out.println("Invalid balance");
		}

		getDetails();
	}

	void getDetails(){
		System.out.println("Account: " + this.accountNumber + ", Holder: " + accountHolder + ", Balance: $" + balance);
	}
}
