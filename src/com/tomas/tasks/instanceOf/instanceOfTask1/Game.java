package com.tomas.tasks.instanceOf.instanceOfTask1;

public class Game {
	String title;
	String platform;

	Game(String title , String platform){
		this.title = title;
		this.platform = platform;
	}

	@Override
	public String toString(){
		return "Game: " + title + " [" + platform + "]";
	}
}
