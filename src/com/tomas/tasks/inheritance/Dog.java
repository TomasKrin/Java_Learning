package com.tomas.tasks.inheritance;

public class Dog extends Animal {
	Dog(String name){
		super(name , "Dog");
	}

	@Override
	void makeSound(){
		System.out.println(name + " barks");
	}
}
