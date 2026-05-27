package com.tomas.tasks.inheritance;

import com.tomas.tasks.TaskProcessor;

public class InheritanceTask2 implements TaskProcessor {
	@Override
	public void run(){
//		Circle c = new Circle(5.0);
//		Rectangle r = new Rectangle(4.0 , 6.0);

//		Circle c = new Circle(3.0);
//		Rectangle r = new Rectangle(2.0 , 8.0);

//		Circle c = new Circle(10.0);
//		Rectangle r = new Rectangle(5.0 , 5.0);

		Circle c = new Circle(1.0);
		Rectangle r = new Rectangle(7.0 , 3.0);

		c.describe();
		r.describe();

		System.out.printf("%s area: %.2f\n" , c.name , c.getArea());
		System.out.printf("%s area: %.2f\n" , r.name , r.getArea());
	}
}
