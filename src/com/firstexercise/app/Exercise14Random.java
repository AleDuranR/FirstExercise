package com.firstexercise.app;

public class Exercise14Random {

	public static void main(String[] args) {
		int LENGTH_VECTOR = 100;
		int [] VectorRandom = new int[LENGTH_VECTOR];
		
		// Process
					// Realization of the vector with random numbers
		for(int i = 0; i < LENGTH_VECTOR; i++) {
			VectorRandom[i] = (int) Math.floor( Math.random() * 9);
			System.out.print(VectorRandom[i] + " ");
		}

	}

}
