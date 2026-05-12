package com.tomas.tasks.inheritance;

public class Shape {
	protected String name;

	Shape(String name){
		this.name = name;
	}

	double getArea(){
		return 0.0;
	}

	void describe(){
		System.out.println("Shape: " + name);
	}
}
