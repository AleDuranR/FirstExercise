package com.firstexercise.app;

import java.util.Scanner;

public class Exercise25FibonacciSeriesOnlyVariables {
	public static void main(String[] args) {
		// Constant
		
		// Variables
		int userNum = 0;
		int fibonacci = 1;
		int count1 = 0;
		int count2 = 1;
		
		// Object declaration
		Scanner scan = new Scanner(System.in);
		
		// Input
		userNum = scan.nextInt();
		
		// Process
		// Do the process the number of times the user asked
		for(int i= 0; i < userNum; i++) {
			// Print fibonacci number
			System.out.print(" " + fibonacci);
			
			fibonacci = count1+count2;
			count1 = count2;
			count2 = fibonacci;
		}
		scan.close();
	}
}
