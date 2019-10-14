package com.firstexercise.app;

import java.util.Scanner;
public class Exercise12ZeroOddEven {
	public static void main(String[] args) {
		// Constant
		
		// Variable
		byte numUser = 0;
		char responseUser = 'Y';
		
		// Object declaration
		Scanner scan = new Scanner(System.in);
		
		while(responseUser == 'Y') {
		//Input
			System.out.print("Input a number ");
			numUser = scan.nextByte();
		// Process and Output
			if(numUser == 0) {
				System.out.format("The number %d is ZERO \n",numUser);
			}
			else if(numUser%2 == 0){
				System.out.format("The number %d is Even \n",numUser);
			}
			else if(numUser%2 != 0){
				System.out.format("The number %d is Odd \n",numUser);
			}
			System.out.println("Do you want to continue asking? Y/N");
			responseUser = scan.next().charAt(0);
		}
		System.out.println("EXIT...");
		// Terminator
		scan.close();
		
	}
}
