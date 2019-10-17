package com.firstexercise.app;

import java.util.Scanner;
public class Exercise27PascalTriangle {

	public static void main(String[] args) {
		// A[i][j] = A[i-1][j-1]+ A[i-1][j]
		// Constant declaration
		
		// 	Variables declaration
		int rows = 0;
		// Object construction
		Scanner scan = new Scanner(System.in);
		
		System.out.println("How many rows do you want?");
		rows = scan.nextInt();
		// Array
		int [][] myPascalTriangle = new int[rows][rows];
		
		for(int i = 0; i < rows; i++) {
			myPascalTriangle[i][0] = 1;
			if(i > 0) {
				for(int j = 1; j < rows; j++) {
					myPascalTriangle[i][j] = myPascalTriangle[i-1][j-1] + myPascalTriangle[i-1][j];
				}
			}
		}
		
		PrintArray(myPascalTriangle);
	}
	
	public static void PrintArray(int[][] array) {
		for(int i = 0; i < array.length ; i++) {
			for (int j = 0; j < array.length; j++) {
				if(array[i][j] != 0){
					System.out.format("%6d", array[i][j]);
				}
			}
			System.out.println();
		}
	}

}
