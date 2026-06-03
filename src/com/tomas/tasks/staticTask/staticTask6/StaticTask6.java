package com.tomas.tasks.staticTask.staticTask6;

import com.tomas.tasks.TaskProcessor;

public class StaticTask6 implements TaskProcessor {
	@Override
	public void run(){
		Person.printName();
	}
}
