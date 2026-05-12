package com.tomas.tasks.inheritance;

import com.tomas.tasks.TaskProcessor;

public class InheritanceTask1 implements TaskProcessor {
	@Override
	public void run(){
//		String[] studentNames = {"Alice" , "Bob" , "Charlie" , "Diana"};
//		int[] studentAges = {20 , 21 , 19 , 22};

//		String[] studentNames = {"Eve" , "Frank" , "Grace" , "Henry"};
//		int[] studentAges = {18 , 19 , 20 , 18};

//		String[] studentNames = {"Ivy" , "Jack" , "Kate" , "Leo"};
//		int[] studentAges = {21 , 20 , 22 , 19};

		String[] studentNames = {"Maya" , "Noah" , "Oscar" , "Piper"};
		int[] studentAges = {19 , 20 , 21 , 18};


		Student[] students = new Student[studentNames.length];

		for (int i = 0; i < students.length; i++) {
			try {
				students[i] = new Student(studentNames[i] , studentAges[i]);
				System.out.println(students[i].info());
			} catch (ArrayIndexOutOfBoundsException _) {
				break;
			}
		}

		System.out.println("Total Students: " + students[0].getTotalStudents());

	}
}
