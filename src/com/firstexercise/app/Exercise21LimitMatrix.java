package com.firstexercise.app;

public class Exercise21LimitMatrix {
	public static void main(String[] args) {
		// Constant
		int MATRIX_SIZE = 10;
						
		// Variables
		int [][] matrixRandom = new int[MATRIX_SIZE][MATRIX_SIZE];
		int [][] matrixUpLimitResult = new int[MATRIX_SIZE][MATRIX_SIZE];
		int [][] matrixLowLimitResult = new int[MATRIX_SIZE][MATRIX_SIZE];
		// Create a random  matrix
		for(int i = 0; i < matrixRandom.length; i++) {
			for(int j = 0; j < matrixRandom[0].length; j++) {
				matrixRandom[i][j] = (int) Math.floor(Math.random()*9);
			}
		}
		// Limit the UPPER matrix using the values of 'x' and 'y' of the matrix
		for(int i = 0; i < matrixRandom.length; i++) {
			for(int j = 0; j < matrixRandom[0].length; j++) {
				if(j+i <= matrixRandom.length-1) {
					matrixUpLimitResult[i][j] = matrixRandom[i][j];
				}
				else {
					matrixUpLimitResult[i][j] = 0;
				}
			}
		}
		// Limit the LOWER matrix using the values of 'x' and 'y' of the matrix
		for(int i = 0; i < matrixRandom.length; i++) {
			for(int j = 0; j < matrixRandom[0].length; j++) {
				if(j+i+2 > matrixRandom.length) {
					matrixLowLimitResult[i][j] = matrixRandom[i][j];
				}
				else {
					matrixLowLimitResult[i][j] = 0;
				}
			}
		}
		// Output
		System.out.format("\nOriginal Matrix\n");
		MatrixPrint(matrixRandom);
		System.out.format("\nUpper Limit Matrix\n");
		MatrixPrint(matrixUpLimitResult);
		System.out.format("\nLower Limit Matrix\n");
		MatrixPrint(matrixLowLimitResult);
			
	}
	public static void MatrixPrint(int[][] array) {
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[0].length; j++) {
				System.out.format("%2d ", array[i][j]);
			}
			System.out.println();
		}
	}
}
