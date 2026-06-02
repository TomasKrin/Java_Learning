package com.tomas.tasks.staticTask.staticTask4;

import com.tomas.tasks.TaskProcessor;

import static com.tomas.tasks.staticTask.staticTask4.MathConstants.PI;

public class StaticTask4 implements TaskProcessor {
	@Override
	public void run(){
//		int radius = 2;
		int radius = 5;
		double area = PI * radius * radius;
		System.out.println("Area: " + area);
	}
}
