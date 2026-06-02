package com.tomas.tasks.staticTask.staticTask1;

public class Counter {
	static int totalCount = 0;
	private int id = totalCount;

	Counter(){
		totalCount++;
		id++;
	}

	int getId(){
		return id;
	}
}
