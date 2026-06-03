package com.tomas.tasks.valueAndReferenceTask;

import com.tomas.tasks.TaskProcessor;

public class ValueAndReferenceTask2 implements TaskProcessor {
	@Override
	public void run(){
		StringBuilder sb = new StringBuilder("Hi");

		changeText(sb);
		System.out.println("After changeText: " + sb);

		reassign(sb);
		System.out.println("After reassign: " + sb);

	}

	void changeText(StringBuilder b){
		b.append("!");
	}

	void reassign(StringBuilder b){
		b = new StringBuilder("Bye");
	}
}
