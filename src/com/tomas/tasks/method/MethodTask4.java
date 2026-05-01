package com.tomas.tasks.method;

import com.tomas.tasks.TaskProcessor;

public class MethodTask4 implements TaskProcessor {
	// BONUS METHOD TASK
	@Override
	public void run () {
		int a = 4;
		int b = 7;
		int c = 1;

		a = -3;
		b = -3;
		c = -3;

		a = 0;
		b = -1;
		c = 100;

		a = Integer.MAX_VALUE;
		b = Integer.MAX_VALUE - 1;
		c = Integer.MAX_VALUE - 2;

		System.out.println("Min of two: " + min(a , b));
		System.out.println("Min of three: " + min(a , b , c));
	}

	int min (int a , int b) {
		// #1.
		return a <= b ? a : b;

		// #2.
		//return Math.min(a , b);
	}

	int min (int a , int b , int c) {
		return min(min(a , b) , c);
	}
}
