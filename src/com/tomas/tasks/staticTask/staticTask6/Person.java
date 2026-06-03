package com.tomas.tasks.staticTask.staticTask6;

public class Person {
	String name;

	Person(String name){
		this.name = name;
	}

	static void printName(){
//		System.out.println(name); -> non-static variable name cannot be referenced from a static context

		Person person = new Person("Tom");
		System.out.println(person.name);
	}
}
