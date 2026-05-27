package com.tomas.tasks.constructorsAndOOP;

public class Person {
	String name;
	int age;

	Person(){
		this.name = "Unknown";
		this.age = 0;
	}

	Person(String name){
		this.name = name;
		this.age = 18;
	}

	Person(String name , int age){
		this.name = name;
		this.age = age;
	}

	void display(){
		System.out.println("Name: " + name + ", " + "Age: " + age);
	}
}
