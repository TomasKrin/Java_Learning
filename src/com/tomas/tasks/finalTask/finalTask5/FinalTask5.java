package com.tomas.tasks.finalTask.finalTask5;

import com.tomas.tasks.TaskProcessor;

public class FinalTask5 implements TaskProcessor {
	@Override
	public void run(){
		SecureConfig sc = new SecureConfig();
		sc.load();
	}
}
