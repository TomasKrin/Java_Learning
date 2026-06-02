package com.tomas.tasks.finalTask.finalTask4;

import com.tomas.tasks.TaskProcessor;

public class FinalTask4 implements TaskProcessor {
	@Override
	public void run(){
		Child child = new Child();
		child.show();
	}
}
