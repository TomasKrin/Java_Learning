package com.tomas.tasks.classes.classesTask1;

import com.tomas.tasks.TaskProcessor;

public class ClassesTask1 implements TaskProcessor {
	@Override
	public void run(){
		System.out.println(Car.Engine.info());
	}
}
