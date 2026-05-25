package com.tomas.tasks.inheritance;

public class Person {
	protected String name;
	protected int age;

	Person(String name , int age){
		this.name = name;
		this.age = age;
	}

	String info(){
		return "Person{" + "name=" + "'" + this.name + "', " + "age=" + this.age + "}";
	}
}
