package com.tomas.tasks.classes.classesTask3;

import com.tomas.tasks.TaskProcessor;

public class ClassesTask3 implements TaskProcessor {
	@Override
	public void run(){
		Messenger.greet("Tom");
	}
}
