package com.tomas.tasks.inheritance;

import com.tomas.tasks.TaskProcessor;

public class InheritanceTask3 implements TaskProcessor {
	@Override
	public void run(){
		Employee e1 = new Employee("Alice" , 30 , "EMP001" , 50000.0);
		Employee e2 = new Employee("Bob" , 35 , "EMP002" , 60000.0);
		Employee e3 = new Employee("Charlie" , 28 , "EMP003" , 45000.0);
		Employee e4 = new Employee("Diana" , 32 , "EMP004" , 55000.0);
		Employee e5 = new Employee("Eve" , 29 , "EMP005" , 52000.0);
		Employee e6 = new Employee("Frank" , 40 , "EMP006" , 70000.0);
		Employee e7 = new Employee("Grace" , 26 , "EMP007" , 43000.0);
		Employee e8 = new Employee("Henry" , 45 , "EMP008" , 80000.0);

		System.out.println(e1.info());
		System.out.println(e2.info());
		System.out.println(e3.info());
		System.out.println(e4.info());
		System.out.println(e5.info());
		System.out.println(e6.info());
		System.out.println(e7.info());
		System.out.println(e8.info());
	}
}
