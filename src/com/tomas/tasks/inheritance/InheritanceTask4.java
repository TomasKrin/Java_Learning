package com.tomas.tasks.inheritance;

import com.tomas.tasks.TaskProcessor;

public class InheritanceTask4 implements TaskProcessor {
	@Override
	public void run(){
//		String[] animalNames = {"Rex" , "Max" , "Whiskers" , "Mittens"};
//		String[] animalTypes = {"Dog" , "Dog" , "Cat" , "Cat"};

//		String[] animalNames = {"Buddy" , "Luna" , "Charlie" , "Shadow"};
//		String[] animalTypes = {"Dog" , "Cat" , "Dog" , "Cat"};

//		String[] animalNames = {"Daisy" , "Spot" , "Tiger" , "Smokey"};
//		String[] animalTypes = {"Dog" , "Dog" , "Cat" , "Cat"};

		String[] animalNames = {"Fluffy" , "Rover" , "Patches" , "Barkley"};
		String[] animalTypes = {"Cat" , "Dog" , "Cat" , "Dog"};

		Animal[] animals = new Animal[animalNames.length];

		for (int i = 0; i < animals.length; i++) {
			try {
				if (animalTypes[i].equals("Dog")) {
					animals[i] = new Dog(animalNames[i]);
				} else if (animalTypes[i].equals("Cat")) {
					animals[i] = new Cat(animalNames[i]);
				} else {
					System.out.println("Animal type has to be either Dog or Cat");
					continue;
				}
				System.out.println(animals[i].getDetails());
				animals[i].makeSound();
			} catch (ArrayIndexOutOfBoundsException _) {
				break;
			}
		}
	}
}
