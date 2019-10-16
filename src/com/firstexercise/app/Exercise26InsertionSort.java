package com.firstexercise.app;

import java.util.Random;
public class Exercise26InsertionSort {

	public static void main(String[] args) {
		// Constant declaration
		final int ELEMENTS_NUMBER = 10;
		// Variable number
		int disorderNumber = 0;
		int index = 0;
		
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
	
        for (int i = 1; i < ELEMENTS_NUMBER; ++i) { 
            disorderNumber = myArray[i]; 
            index = i - 1; 
            /* Move through the array elements, that are greater than disordedNumber,
             * to one position ahead of their current position
            */
            while (index >= 0 && myArray[index] > disorderNumber) { 
            	myArray[index + 1] = myArray[index]; 
            	index = index-1; 
            } 
            myArray[index + 1] = disorderNumber; 
        } 
        
        System.out.println("\nOrganized Array with Insertion Sort");
        for(int i = 0; i < myArray.length; i++) {
			System.out.format(" %d  ", myArray[i]);
		}
	

	}

}
