package com.tomas.tasks.inheritance.inheritanceTask1;

public class Student {
	static int totalStudents = 0;
	private final String name;
	private final int age;
	// immutable variables - variables of an object that cannot be changed
	// can be used here, to protect object state and saved data, which makes sense in this kind of task

	Student(String name , int age){
		this.name = name;
		this.age = age;

		totalStudents++;
	}

	static int getTotalStudents(){
		return totalStudents;
	}

	String info(){
		return "Student{" + "name=" + "'" + this.name + "', " + "age=" + this.age + "}";
	}
}
