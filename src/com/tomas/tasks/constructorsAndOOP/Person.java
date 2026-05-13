package com.tomas.tasks.constructorsAndOOP;

public class Person {
	String name;
	int age;

	Person(String name , int age){
		this.name = name;
		this.age = age;
	}

	Person(String name){
		this(name , 18);
	}

	Person(){
		this("Unknown");
	}

	void getInfo(){
		System.out.println("Person{name='" + name + "', " + "age=" + age + "}");
	}
}
