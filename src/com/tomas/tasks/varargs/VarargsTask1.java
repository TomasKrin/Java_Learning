package com.tomas.tasks.varargs;

import com.tomas.tasks.TaskProcessor;

public class VarargsTask1 implements TaskProcessor {
	@Override
	public void run () {

		report(4 , 7 , 2 , 9 , 1);
		System.out.println("\n************");
		report(42);
		System.out.println("\n************");
		report(-5 , -5 , -5);
		System.out.println("\n************");
		report();

	}

//	void report (int... scores) {
//		if (scores.length != 0) {
//			int count = scores.length;
//			int sum = Arrays.stream(scores).sum();
//			int min = Arrays.stream(scores).min().getAsInt();
//			int max = Arrays.stream(scores).max().getAsInt();
//			double avg = Arrays.stream(scores).average().getAsDouble();
//
//			System.out.println("Count: " + count);
//			System.out.println("Sum: " + sum);
//			System.out.println("Min: " + min);
//			System.out.println("Max: " + max);
//			System.out.printf("Avg: %.2f" , avg);
//
//		} else {
//			System.out.println("No scores provided");
//		}
//	}

	void report (int... scores) {
		if (scores.length != 0) {
			int count = scores.length;
			int sum = 0;
			int min = scores[0];
			int max = scores[0];
			double avg;

			for (int score: scores) {
				sum += score;
				min = Math.min(min , score);
				max = Math.max(max , score);
			}

			avg = (double)sum / scores.length;

			System.out.println("Count: " + count);
			System.out.println("Sum: " + sum);
			System.out.println("Min: " + min);
			System.out.println("Max: " + max);
			System.out.printf("Avg: %.2f" , avg);
		} else {
			System.out.println("No scores provided");
		}
	}
}
