package com.firstexercise.app;

import java.util.Scanner;
public class Exercise09NumberFactor {
	public static void main(String[] arg) {
		// Variables
		int numUser = 0;
		int numFactorial = 1;
		int index = 1;
		
		System.out.print("Input a number ");
		Scanner scan = new Scanner(System.in);
		numUser = scan.nextInt();
		while(numUser>=index) {
			numFactorial = numFactorial*index;
			index++;
		}
		System.out.format("The factorial %d ! is %d",numUser,numFactorial);
		scan.close();
	}
}
