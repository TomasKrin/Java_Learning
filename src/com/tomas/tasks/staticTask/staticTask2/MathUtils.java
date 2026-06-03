package com.tomas.tasks.staticTask.staticTask2;

public class MathUtils {
	static String max(int a , int b){
		int max = a > b ? a : b; // OR Math.max();
		return "Max: " + max;
	}
}
