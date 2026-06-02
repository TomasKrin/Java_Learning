package com.tomas.tasks.finalTask;

import com.tomas.tasks.TaskProcessor;

public class FinalTask2 implements TaskProcessor {
	@Override
	public void run(){
		final StringBuilder sb = new StringBuilder("Hello");
		sb.append(" World");
		// sb = new StringBuilder("No"); -> Cannot assign a value to final variable 'sb'
		System.out.println(sb);
	}
}
