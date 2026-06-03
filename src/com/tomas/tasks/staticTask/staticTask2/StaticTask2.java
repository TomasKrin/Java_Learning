package com.tomas.tasks.staticTask.staticTask2;

import com.tomas.tasks.TaskProcessor;

public class StaticTask2 implements TaskProcessor {
	@Override
	public void run(){
//		int a = 10;
//		int b = 20;

		int a = 7;
		int b = 3;

		System.out.println(MathUtils.max(a , b));
	}
}
