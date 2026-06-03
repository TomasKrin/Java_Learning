package com.tomas.tasks.staticTask.staticTask5;

import com.tomas.tasks.TaskProcessor;

public class StaticTask5 implements TaskProcessor {
	@Override
	public void run(){
		Player player1 = new Player();
		Player player2 = new Player();
		Player player3 = new Player();
		Player player4 = new Player();
		Player player5 = new Player();

		System.out.println("Players: " + Player.getPlayerCount());
	}
}
