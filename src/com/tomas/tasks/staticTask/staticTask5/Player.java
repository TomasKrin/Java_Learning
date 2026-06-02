package com.tomas.tasks.staticTask.staticTask5;

public class Player {
	private static int playerCount;

	Player(){
		playerCount++;
	}

	static int getPlayerCount(){
		return playerCount;
	}
}
