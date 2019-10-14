package com.firstexercise.app;

import java.util.Scanner;
public class Exercise11PrimeNumber {
	public static void main(String[] args) {
		//Constants
		
		// Variable
		int numUser = 0;
		int index = 2;
		boolean flag = false;
		int count = 1;
				
		// Object declaration
		Scanner scan = new Scanner(System.in);
		
		// Input
		System.out.print("Input a number ");
		numUser = scan.nextInt();
		//Process index <= numUser 
		while(flag == false && index < numUser) {
			if(numUser % index == 0 ) {
				flag = true;
			}
			index++;
		}
		// Output
		if(flag == true) {
			System.out.format("The number %d is NOT a prime number. \n ",numUser);
		}
		else {
			System.out.format("The number %d is a prime number. \n",numUser);
		}
		
		System.out.print("Input another number ");
		numUser = scan.nextInt();
		
		flag = false;
		
		while(count < numUser) {
			index =2;
			flag = false;
			if(index < count && flag != true){
				if(count % index == 0) {
					flag = true;
				}
				index ++;
			}
			
			else if(flag == false) {
				System.out.print(count);	
				count ++;		
			}	
		}	
		scan.close();
	}
}
