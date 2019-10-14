package com.firstexercise.app;

public class Exercise20DotProduct {

	public static void main(String[] args) {
		// Constant
		int MATRIX_SIZE = 10;
						
		// Variables
		int [][] matrixRandom1 = new int[MATRIX_SIZE][MATRIX_SIZE];
		int [][] matrixRandom2 = new int[MATRIX_SIZE][MATRIX_SIZE];
		int [][] matrixResult = new int[MATRIX_SIZE][MATRIX_SIZE];
		// Generate random matrix
		for(int i = 0; i < matrixRandom1.length; i++) {
			for(int j = 0; j < matrixRandom1[0].length; j++) {
				matrixRandom1[i][j] = (int) Math.floor(Math.random()*9);
				matrixRandom2[i][j] = (int) Math.floor(Math.random()*9);
			}
		}
		// Dot Product
		for(int i = 0; i < matrixRandom1.length; i++) {
			for(int j = 0; j < matrixRandom1[0].length; j++) {
				matrixResult[i][j] = matrixRandom1[i][j]*matrixRandom2[i][j];
			}
		}
		// Output
		System.out.println("Fitst Matrix");
		MatrixPrint(matrixRandom1);
		System.out.println("Second Matrix");
		MatrixPrint(matrixRandom2);
		System.out.println("Dot Product of Matrix ");
		MatrixPrint(matrixResult);

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
