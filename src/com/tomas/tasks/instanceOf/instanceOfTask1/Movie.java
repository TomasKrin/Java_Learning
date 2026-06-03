package com.tomas.tasks.instanceOf.instanceOfTask1;

public class Movie {
	String title;
	int duration;

	Movie(String title , int duration){
		this.title = title;
		this.duration = duration;
	}

	@Override
	public String toString(){
		return "Movie: " + title + " (" + duration + "min)";
	}
}
