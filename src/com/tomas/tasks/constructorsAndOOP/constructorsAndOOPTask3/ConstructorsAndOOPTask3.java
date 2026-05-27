package com.tomas.tasks.constructorsAndOOP.constructorsAndOOPTask3;

import com.tomas.tasks.TaskProcessor;

public class ConstructorsAndOOPTask3 implements TaskProcessor {
	@Override
	public void run(){
		new BankAccount("Alice" , 100.0);
		new BankAccount("Bob" , -50.0);
		new BankAccount("Charlie" , 0.0);

		new BankAccount("Diana" , 5000.0);
		new BankAccount("Eve" , -100.0);
		new BankAccount("Frank" , 1.5);

		new BankAccount("Grace" , 999999.99);
		new BankAccount("Henry" , -0.01);

		new BankAccount("Ivy" , 42.0);
		new BankAccount("Jack" , -1000.0);
	}
}
