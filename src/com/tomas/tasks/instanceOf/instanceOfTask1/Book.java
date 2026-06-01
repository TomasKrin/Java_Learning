package com.tomas.tasks.instanceOf.instanceOfTask1;

public class Book {
	String title;

	Book(String title){
		this.title = title;
	}

	@Override
	public String toString(){
		return "Book: " + title;
	}
}
