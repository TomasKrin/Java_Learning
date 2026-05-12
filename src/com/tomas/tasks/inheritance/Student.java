package com.tomas.tasks.inheritance;

public class Student {
	static int totalStudents = 0;
	private String name;
	private int age;

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
