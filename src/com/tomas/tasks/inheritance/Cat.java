package com.tomas.tasks.inheritance;

public class Cat extends Animal {
	Cat(String name){
		super(name , "Cat");
	}

	@Override
	void makeSound(){
		System.out.println(name + " meows");
	}
}
