package com.firstexercise.app;

import java.util.Scanner;
public class Exercise19ScalarProduct {

	public static void main(String[] args) {
		// Constant
		int MATRIX_SIZE = 10;
				
		// Variables
		int [][] matrixRandom = new int[MATRIX_SIZE][MATRIX_SIZE];
		int [][] matrixResult = new int[MATRIX_SIZE][MATRIX_SIZE];
		int numScalar = 0;
		
		// Object declaration
		
		Scanner scan = new Scanner(System.in);
		// Process
		// Generate random matrixes
		for(int i = 0; i < matrixRandom.length; i++) {
			for(int j = 0; j < matrixRandom[0].length; j++) {
				matrixRandom[i][j] = (int) Math.floor(Math.random()*9);
			}
		}
		// Output
		System.out.format("Original matrix\n");
		MatrixPrint(matrixRandom);	
		System.out.format("\nBy which scale you want to multiply the matrix? \n ");
		numScalar = scan.nextInt();
		// Scalar multiplication
		for(int i = 0; i<matrixRandom.length; i++) {
			for(int j = 0; j<matrixRandom[0].length;j++) {
				matrixResult [i][j] = numScalar * matrixRandom[i][j];
			}
		}
		// Output
		System.out.format("\nOriginal matrix times %d \n", numScalar);
		MatrixPrint(matrixResult);
		scan.close();
	}
	public static void MatrixPrint(int[][] array) {
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[0].length; j++) {
				System.out.format("%3d ", array[i][j]);
			}
			System.out.println();
		}
	}
}
