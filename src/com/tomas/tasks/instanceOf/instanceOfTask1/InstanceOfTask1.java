package com.tomas.tasks.instanceOf.instanceOfTask1;

import com.tomas.tasks.TaskProcessor;

public class InstanceOfTask1 implements TaskProcessor {
	@Override
	public void run(){

		Book book = new Book("Dune");
		Movie movie = new Movie("Inception" , 148);
		Game game = new Game("Minecraft" , "PC");

		System.out.println(describe(book));
		System.out.println(describe(movie));
		System.out.println(describe(game));
		System.out.println(describe("Hello"));
	}

	String describe(Object item){
		if (item instanceof Book || item instanceof Movie || item instanceof Game) {
			return item.toString();
		} else {
			return "Unknown item";
		}
	}
}
