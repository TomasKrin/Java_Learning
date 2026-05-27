package com.tomas.tasks.classes.classesTask3;

public class Messenger {
	static void greet(String name){
		class Greeter {
			String message(){
				return "Hello, " + name;
			}
		}
		System.out.println(new Greeter().message());
	}
}
