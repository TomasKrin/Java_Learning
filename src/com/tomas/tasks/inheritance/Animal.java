package com.tomas.tasks.inheritance;

// abstraction doesn't make sense, because of task requirements
// interface can't have constructors, which task requires
public class Animal {
	protected String name;
	protected String type;

	Animal(String name , String type){
		this.name = name;
		this.type = type;
	}

	void makeSound(){
		System.out.println(name + " makes a generic sound");
	}

	String getDetails(){
		return "Animal{" + "name=" + "'" + name + "', " + "type=" + "'" + type + "'" + "}";
	}
}
