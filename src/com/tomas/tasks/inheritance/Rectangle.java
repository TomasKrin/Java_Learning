package com.tomas.tasks.inheritance;

public class Rectangle extends Shape {
	private double length;
	private double width;

	Rectangle(double length , double width){
		super("Rectangle");
		this.length = length;
		this.width = width;
	}

	@Override
	double getArea(){
		return length * width;
	}
}
