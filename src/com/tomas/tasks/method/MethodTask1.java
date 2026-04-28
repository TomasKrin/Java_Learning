package com.tomas.tasks.method;

import com.tomas.tasks.TaskProcessor;

public class MethodTask1 implements TaskProcessor {
	@Override
	public void run () {
		int intVal = 7;
		double doubleVal = 3.5;

//		intVal = -1;
//		doubleVal = 0.1;

//		intVal = 100;
//		doubleVal = 99.999;

//		intVal = 0;
//		doubleVal = 0.0;

		describe(intVal);
		describe(doubleVal);
	}

	void describe (int number) {
		System.out.println("Integer: " + number);
	}

	void describe (double number) {
		System.out.printf("Decimal: %.2f" , number);
	}
}
