package com.tomas.tasks.stackAndHeap;

import com.tomas.tasks.TaskProcessor;

import java.util.ArrayList;
import java.util.List;

public class StackAndHeapTask2 implements TaskProcessor {
	@Override
	public void run(){
		List<byte[]> list = new ArrayList<>();

		while (true) {
			byte[] b = new byte[1048576];
			list.add(b);
		}

		// Exception in thread "main" java.lang.OutOfMemoryError
	}
}
