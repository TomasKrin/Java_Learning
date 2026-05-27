package com.tomas.tasks.classes.classesTask2;

public class Car {
	private String model;

	Car(String model){
		this.model = model;
	}

	class Wheel {
		void info(){
			System.out.println("Wheels for " + model);
		}
	}
}
