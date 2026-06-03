package com.tomas.tasks.finalTask;

import com.tomas.tasks.TaskProcessor;

public class FinalTask1 implements TaskProcessor {
	@Override
	public void run(){
		final double PI = Math.PI;
		System.out.printf("PI = %.5f" , PI);
		// PI = 3.1; -> Cannot assign a value to final variable 'PI'
	}
}
