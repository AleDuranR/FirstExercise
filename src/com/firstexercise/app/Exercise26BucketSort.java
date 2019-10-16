package com.firstexercise.app;

import java.util.Random;

public class Exercise26BucketSort {

	public static void main(String[] args) {
		// Constant declaration
		final int ELEMENTS_NUMBER = 10;
		// Variable number
		
		// Array declaration
		int[] myArray = new int[ELEMENTS_NUMBER];
		
		// Object construction
		Random randomNumber = new Random(System.nanoTime());
		
		System.out.println("Disorder Array");
		// Fill array with random numbers and print
		for(int i = 0; i < ELEMENTS_NUMBER; i++) {
			myArray[i] = randomNumber.nextInt(10);
			System.out.format(" %d  ", myArray[i]);
		}
		// B U C K E T  S O R T
		// 1. Creation of buckets
		// This buckets are created to put elements into them
		
		// 2. Apply Sorting algorithm
		// Apply insertion sort to sort the elements in each bucket.
		
		// 3. Concatenate
		// Join them to get sorted array
		
		
		// Questions
		// ****** WTF?! I DON'T KNOW BEFOREHAND WHAT SIZE EACH BUCKET WILL BE!!!!! *********
		// There are rules for the creation of the buckets?
		// May I use a Switch case or which method is more appropriate?
		// Can I apply the concatenation with a '+'

	}

}
