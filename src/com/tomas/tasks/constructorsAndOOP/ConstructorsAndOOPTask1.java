package com.tomas.tasks.constructorsAndOOP;

import com.tomas.tasks.TaskProcessor;

public class ConstructorsAndOOPTask1 implements TaskProcessor {
	@Override
	public void run(){
//		Person p1 = new Person("Alice" , 25);
//		Person p2 = new Person("Bob");
//		Person p3 = new Person();

//		Person p1 = new Person("Charlie" , 30);
//		Person p2 = new Person("Diana");
//		Person p3 = new Person();

//		Person p1 = new Person("Eve" , 5);
//		Person p2 = new Person("Frank");
//		Person p3 = new Person();

		Person p1 = new Person("Grace" , 100);
		Person p2 = new Person("Henry");
		Person p3 = new Person();
		
		p1.display();
		p2.display();
		p3.display();
	}
}
