package com.firstexercise.app;

import java.lang.Math;
import java.util.Arrays;
public class Exercise13MeanMedianMode {
	public static void main(String[] args) {
		// Constants
		int NUM_VALUE = 10;
		// Variables
		int sumVector = 0;
		int median = 0;
		int indexVector = 0;
		int indexMode = 0;
		double mean = 0;
		int endMode = 0;
		int times = 1;
		int[] Vector =  new int[NUM_VALUE];
		int[][] Mode = new int[NUM_VALUE][2];
		
		// Process
			// Realization of the vector with random numbers
		for(int i = 0; i < NUM_VALUE; i++) {
			Vector[i] = (int) Math.floor( Math.random() * 9);
			System.out.print(Vector[i] + " ");
		}
		 
			// Calculate M E A N
		for(int i=1; i < Vector.length; i++) {
			sumVector += Vector[i];
		}
		mean = sumVector/Vector.length;
		
			// Calculate M E D I A N
		Arrays.parallelSort(Vector);
		median =  Vector[(int) Math.floor(Vector.length/2)];
		
			// Calculate M O D E
		while(endMode == 0) {
			while(indexVector < Vector.length-1) {
				// if the number in 'indexVector' is the SAME number in the next position
				// a value is add to the counter 'times'  
				if(Vector[indexVector] == Vector[indexVector + 1]) {
					times++;
				}
				// if the number in 'indexVector' is DIFFERENT number in the next position
				// a value that is compared and 'times' is save in 'Mode' and all the variables are reset 
				else {
					Mode[indexMode][0] = Vector[indexVector];
					Mode[indexMode][1] = times;
					indexMode ++;
					times = 1;
				}
				indexVector ++;
			}
			Mode[indexMode][0] = Vector[indexVector];
			Mode[indexMode][1] = times;
			endMode = 1;
		}
		
		// Output
		System.out.format("\n The mean of the vector is %.2f", mean);
		System.out.format("\n The median of the vector is number %d", median);	
		for(int i = 0; i < NUM_VALUE && Mode[i][1] != 0; i++) {
			System.out.format("\n The number %d is %d times ", Mode[i][0],Mode[i][1]);
		}
	}
}
