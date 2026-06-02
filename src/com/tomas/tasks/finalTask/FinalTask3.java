package com.tomas.tasks.finalTask;

import com.tomas.tasks.TaskProcessor;

public class FinalTask3 implements TaskProcessor {
	@Override
	public void run(){
		int number = 5;

		System.out.println("Result: " + increase(number));
	}

	int increase(final int n){
		//n = 1; -> Cannot assign a value to final variable 'n'
		return n + 1;
	}
}
