package com.tomas.tasks.constructorsAndOOP;

public class BankAccount {
	String accountHolder;
	double balance = 0.0;
	String accountNumber;

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
