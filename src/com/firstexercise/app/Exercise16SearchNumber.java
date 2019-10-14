package com.firstexercise.app;

import java.util.Arrays;
import java.util.Scanner;
public class Exercise16SearchNumber {

	public static void main(String[] args) {
		// Constants
		int NUM_VALUE = 50;
		
		// Variables
		int[] Vector =  new int[NUM_VALUE];
		int searchNumber = 0;
		int opc = 0;
		
		// Object Declaration
		Scanner scan = new Scanner(System.in);

		// Random array
		for(int i = 0; i < NUM_VALUE; i++) {
			Vector[i] = (int) Math.floor( Math.random() * 9);
		}
		
		do {
			// Input
			System.out.print("Input the number you will like to find ");
			searchNumber = scan.nextInt();
			System.out.format("Method to be used: \n - Sequential Search (1) \n - Binary Search (2) \n - Exit (3) \n");
			opc = scan.nextInt();
			// Process
			switch(opc) {
				case 1:
					// Sequential Search
					System.out.format("Array \n");
					PrintArray(Vector);
					System.out.format("\nNumbers find by sequential search \n");
					SequentialSearch(Vector,searchNumber);
					break;
				case 2:
					// Binary Search
					System.out.format("Array \n");
					PrintArray(Vector);
					System.out.format("\nNumbers find by binary search \n");
					BinarySearch(Vector,searchNumber);
					break;
				case 3:
					break;
				default:
					System.out.format("Method to be used: \n - Sequential Search (1) \n - Binary Search (2) \n - Exit (3) \n");
					opc = scan.nextInt();		
			}
		} while(opc !=3);
		scan.close();
	}
	
	// Method Print Array
	public static void PrintArray(int[] array) {
		for(int i = 0; i < array.length; i++) {
			System.out.format(" %d  ", array[i]);
		}
	
	}
	
	// Method Sequential Search
	public static void SequentialSearch(int[] array, int searchNumber) {
		for(int i = 0; i < array.length; i++) {
			if(array[i] == searchNumber) {
				System.out.format(" The number %d is in position %d \n", searchNumber, i+1);
			}
		}
	}
	
	// Method Sequential Search
	public static void BinarySearch(int[] array, int searchNumber) {
		int topLimit = array.length;
		int lowLimit = 0;
		int middle = 0;
		boolean flag = false;
		
		Arrays.sort(array);
		System.out.format("Organized Array \n");
		PrintArray(array);
		
		while(lowLimit <= topLimit) {
			// Calculate the middle point
			middle = (int) Math.floor((lowLimit + topLimit)/2);		
			if(array[middle] == searchNumber) {
				// Find and print all the positions BEFORE the point equals the search number
				for(int i= middle-1; i >= lowLimit && array[i] == searchNumber; i--) {
					System.out.format("\n The number %d was found in position %d", searchNumber, i);
				}
				// Print the point that equals the search number
				System.out.format("\n The number %d was found in position %d", searchNumber, middle);
				// Find and print all the positions AFTER the point equals the search number
				for(int i= middle+1; i < topLimit && array[i] == searchNumber ; i++) {
					System.out.format("\n The number %d was found in position %d", searchNumber, i);
				}
				flag = true;
				break;
			}
			// Adjusting limits of search
			else if(array[middle] > searchNumber) {
				topLimit = middle;
				middle = (int) Math.floor((lowLimit + topLimit)/2);
			}
			else if(array[middle] < searchNumber) {
				lowLimit = middle;
				middle = (int) Math.floor((lowLimit + topLimit)/2);
			}
		}
		// If anything is found print a message
		if(flag == false) {
			System.out.format("\n The number %d was NOT found ", searchNumber);
		}		
	}
}
