package com.tomas.tasks.staticTask.staticTask1;

import com.tomas.tasks.TaskProcessor;

public class StaticTask1 implements TaskProcessor {
	@Override
	public void run(){
		Counter count1 = new Counter();
		Counter count2 = new Counter();
		Counter count3 = new Counter();

		System.out.println("Counter{id=" + count1.getId() + ", total=" + Counter.totalCount + "}");
		System.out.println("Counter{id=" + count2.getId() + ", total=" + Counter.totalCount + "}");
		System.out.println("Counter{id=" + count3.getId() + ", total=" + Counter.totalCount + "}");
	}
}
