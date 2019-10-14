package com.firstexercise.app;

import java.util.Scanner;
public class Exercise05SeriesStartEnd {

	public static void main(String[] args) {
		// Variables
		int startNumber = 0;
		int endNumber = 0;
		int skipNumber = 0;
		
		// Object declaration
		Scanner scan = new Scanner(System.in);
		
		// Input
		System.out.print("Input start number: ");
		startNumber = scan.nextInt();
		System.out.print("Input end number: ");
		endNumber = scan.nextInt();
		System.out.print("Input skip number: ");
		skipNumber = scan.nextInt();
		
		// Output
		System.out.println("Ascending Series");
		for(int num = startNumber;num <= endNumber;num += skipNumber) {
			System.out.print(num+" ");
		}
		System.out.println();
		
		System.out.println("Decreasing Series");
		for(int num = endNumber;num >= startNumber;num -= skipNumber) {
			System.out.print(num+" ");
		}
		scan.close();
	}

}
