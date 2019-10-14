package com.firstexercise.app;

public class Exercise17Transpose {
	public static void main(String[] args) {
		// Constant
		int MATRIX_SIZE = 10;
		
		// Variables
		int [][] matrixRandom = new int [MATRIX_SIZE][MATRIX_SIZE];
		int [][] matrixTranspose = new int[MATRIX_SIZE][MATRIX_SIZE];
		// Create random matrix
		for(int i = 0; i < MATRIX_SIZE; i++) {
			for(int j = 0; j < MATRIX_SIZE; j++) {
				matrixRandom[i][j] = (int) Math.floor( Math.random() * 9);
			}
		}
		
		// Copy values from matrixRandom to matrixTranspose
		for(int i = 0; i < matrixRandom.length; i++) {
			System.arraycopy(matrixRandom[i],0,matrixTranspose[i],0,matrixRandom.length);
		}
		
		// Transpose matrix 
		// 'TransposeMatrix(a,b)' where a = input the array to transpose
		// 								b = output array already transpose
		TransposeMatrix(matrixRandom,matrixTranspose);
		
		// Print matrixes
		System.out.println("Original Matrix");
		PrintMatrix(matrixRandom);
		System.out.println("Original Matrix");
		PrintMatrix(matrixTranspose);
	}
	
	// Method Print Matrix
	public static void PrintMatrix(int[][] array) {
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[0].length;j++) {
				System.out.print(array[i][j]+ " ");
			}
			System.out.println();
		}
	}
	// Method Transpose Matrix
	public static void TransposeMatrix(int [][] inArray, int[][] outArray) {
		for(int i = 0; i < inArray.length; i++) {
			for(int j = 0; j < inArray[0].length;j++) {
				outArray[i][j] = inArray[j][i];
			}
		}
	}
}
