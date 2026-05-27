package com.tomas.tasks.classes.classesTask2;

import com.tomas.tasks.TaskProcessor;

public class ClassesTask2 implements TaskProcessor {
	@Override
	public void run(){
		Car car = new Car("Civic");
		Car.Wheel wheel = car.new Wheel();

		wheel.info();
	}
}
