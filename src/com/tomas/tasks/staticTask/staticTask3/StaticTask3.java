package com.tomas.tasks.staticTask.staticTask3;

import com.tomas.tasks.TaskProcessor;

public class StaticTask3 implements TaskProcessor {
	@Override
	public void run(){
		System.out.println("Version: " + Config.VERSION);
	}
}
