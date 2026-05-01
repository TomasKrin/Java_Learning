package com.tomas.tasks.method;

import com.tomas.tasks.TaskProcessor;

public class MethodTask3 implements TaskProcessor {
	@Override
	public void run () {
		double base = 3.0;
		int exponent = 3;

		base = 2.0;
		exponent = 10;

		base = 5.0;
		exponent = 0;

		base = 1.0;
		exponent = 100;

		System.out.println("Squared: " + (long)power(base));
		System.out.println("Power: " + (long)power(base , exponent));
	}

	double power (double base) {
		return Math.pow(base , 2);
	}

	double power (double base , int exponent) {
		return Math.pow(base , exponent);
	}
}
