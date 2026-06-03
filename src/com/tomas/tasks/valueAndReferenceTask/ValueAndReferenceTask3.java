package com.tomas.tasks.valueAndReferenceTask;

import com.tomas.tasks.TaskProcessor;

import java.util.Arrays;

public class ValueAndReferenceTask3 implements TaskProcessor {
	@Override
	public void run(){
		int[] nums = {1 , 2 , 3};

		updateFirst(nums);
		System.out.println("After updateFirst: " + Arrays.toString(nums));

		swapArray(nums);
		System.out.println("After swapArray: " + Arrays.toString(nums));
	}

	void updateFirst(int[] arr){
		arr[0] = 99;
	}

	void swapArray(int[] arr){
		arr = new int[]{7 , 8 , 9};
	}
}
