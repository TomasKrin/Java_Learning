package com.tomas.tasks.constructorsAndOOP;

import com.tomas.tasks.TaskProcessor;

public class ConstructorsAndOOPTask2 implements TaskProcessor {
	@Override
	public void run(){
//		Person p1 = new Person("Alice" , 25);
//		Person p2 = new Person("Bob");
//		Person p3 = new Person();

//		Person p1 = new Person("Charlie" , 42);
//		Person p2 = new Person("Diana");
//		Person p3 = new Person();

//		Person p1 = new Person("Eve" , 1);
//		Person p2 = new Person("Frank");
//		Person p3 = new Person();

		Person p1 = new Person("Grace" , 99);
		Person p2 = new Person("Henry");
		Person p3 = new Person();

		p1.getInfo();
		p2.getInfo();
		p3.getInfo();
	}
}
