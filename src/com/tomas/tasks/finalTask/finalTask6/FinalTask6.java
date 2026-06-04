package com.tomas.tasks.finalTask.finalTask6;

import com.tomas.tasks.TaskProcessor;

public class FinalTask6 implements TaskProcessor {
	@Override
	public void run(){
		UserProfile profile1 = new UserProfile("Alice" , 25);
		UserProfile profile2 = new UserProfile("Bob" , 18);

		System.out.println(profile1.getInfo());
		System.out.println(profile2.getInfo());
	}
}
