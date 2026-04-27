package com.tomas.tasks.array;

import com.tomas.tasks.TaskProcessor;

public class ArrayTask2 implements TaskProcessor {
	@Override
	public void run () {
		int[][] grid1 = {
				{1 , 2 , 3} ,
				{4 , 5 , 6} ,
				{7 , 8 , 9}
		};

		int[][] grid2 = {
				{10 , -10} ,
				{5 , 5}
		};

		int[][] grid3 = {
				{0 , 0 , 0}
		};

		int[][] grid4 = {
				{-3 , 4} ,
				{-1 , 2} ,
				{2 , -6}
		};

		int[] colSumArr = columnSums(grid4);

		for (int i = 0; i < colSumArr.length; i++) {
			System.out.println("Column " + i + ": " + colSumArr[i]);
		}

	}

	int[] columnSums (int[][] grid) {
		int columns = grid[0].length;
		int[] colSumArr = new int[columns];

		for (int i = 0; i < columns; i++) {
			int sum = 0;

			for (int[] element: grid) {
				sum += element[i];
			}

			colSumArr[i] = sum;
		}

		return colSumArr;
	}
}
