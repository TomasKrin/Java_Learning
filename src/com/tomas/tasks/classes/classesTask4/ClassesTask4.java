package com.tomas.tasks.classes.classesTask4;

import com.tomas.tasks.TaskProcessor;

public class ClassesTask4 implements TaskProcessor {
	@Override
	public void run(){
		String text = "Java";

		Printer p = new Printer() {
			@Override
			public String print(String text){
				return "Printed: " + text;
			}
		};

		System.out.println(p.print(text));
	}
}
