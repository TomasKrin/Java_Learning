package com.tomas.tasks.inheritance;

public class Circle extends Shape {
	private double radius;

	Circle(double radius){
		super("Circle");
		this.radius = radius;
	}

	@Override
	double getArea(){
		return Math.PI * Math.pow(radius , 2);
	}
}
