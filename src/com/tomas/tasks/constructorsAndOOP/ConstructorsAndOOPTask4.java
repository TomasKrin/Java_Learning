package com.tomas.tasks.constructorsAndOOP;

import com.tomas.tasks.TaskProcessor;

public class ConstructorsAndOOPTask4 implements TaskProcessor {
	@Override
	public void run(){
		new User("alice123" , "alice@test.com" , 25);
		new User("bob user" , "bob@invalid" , 30);
		new User("charlie" , "charlie@test.org" , 150);

		new User("diana_special" , "diana@test.com" , 20);
		new User("eve" , "eve@gmail.com" , 17);

		new User("frank" , "frank@test.com" , 12);
		new User("grace" , "grace@test.com" , 50);

		new User("henry99" , "henry@test.org" , 35);
		new User("ivy" , "ivy@test.net" , 28);
	}
}
