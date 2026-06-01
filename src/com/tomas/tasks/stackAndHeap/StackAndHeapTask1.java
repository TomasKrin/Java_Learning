package com.tomas.tasks.stackAndHeap;

import com.tomas.tasks.TaskProcessor;

public class StackAndHeapTask1 implements TaskProcessor {
	@Override
	public void run(){
		call();
		// Exception in thread "main" java.lang.StackOverflowError
	}

	void call(){
		while (true) {
			this.call();
		}
	}
}
