package com.tomas.tasks.valueAndReferenceTask;

import com.tomas.tasks.TaskProcessor;

public class ValueAndReferenceTask1 implements TaskProcessor {
	@Override
	public void run(){
		int x = 10;
		modify(x);
		System.out.println("x = " + x);
	}

	int modify(int value){
		return value + 5;
	}
}
