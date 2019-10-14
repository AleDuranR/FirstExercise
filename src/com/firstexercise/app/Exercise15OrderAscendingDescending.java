package com.firstexercise.app;

import java.util.Arrays;
public class Exercise15OrderAscendingDescending {

	public static void main(String[] args) {
		// Constants
		int NUM_VALUE = 10;
		
		// Variables
		int contadorReverse = 0;
		int[] Vector =  new int[NUM_VALUE];
		int[] AscendingVector =  new int[NUM_VALUE];
		int[] DescendingVector =  new int[NUM_VALUE];
		
		// Random array
		for(int i = 0; i < NUM_VALUE; i++) {
			Vector[i] = (int) Math.floor( Math.random() * 9);
		}
				
		// Copy an array with 'System.arraycopy'
		// System.arraycopy(Origin Array, start position, Destine Array, start position, number os elements)
		System.arraycopy(Vector,0,AscendingVector,0,Vector.length);
		System.arraycopy(Vector,0,DescendingVector,0,Vector.length);
		
		// Ascending
		Arrays.sort(AscendingVector);
		
		// Descending
		/* 1. Sort in ascending values
		 * 2. Flip the vector (start-end) to (end-end)
		 */
		Arrays.sort(DescendingVector);
		
		int[] ProvisionaVector =  new int[DescendingVector.length];
		contadorReverse = DescendingVector.length;
		for(int i = 0; i < DescendingVector.length; i++) {
			ProvisionaVector[contadorReverse - 1] = DescendingVector[i];
			contadorReverse--;
		}
		
		// Output
		System.out.format("\n Original Arrray \n");
		for(int i = 0; i < NUM_VALUE; i++) {
			System.out.format(" %d  ", Vector[i]);
		}
		
		System.out.format("\n Descending Array \n");
		for(int i = 0; i < NUM_VALUE; i++) {
			System.out.format(" %d  ", AscendingVector[i]);
		}
		
		System.out.format("\n Descending Array \n");
		for(int i = 0; i < NUM_VALUE; i++) {
			System.out.format(" %d  ", ProvisionaVector[i]);
		}
		
	}
}
