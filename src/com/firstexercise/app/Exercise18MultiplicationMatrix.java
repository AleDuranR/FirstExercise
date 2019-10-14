package com.firstexercise.app;

public class Exercise18MultiplicationMatrix {
	public static void main(String[] args) {
		// Constant
		int MATRIX_SIZE = 10;
		
		// Variables
		int [][] matrixRandom1 = new int[MATRIX_SIZE][MATRIX_SIZE];
		int [][] matrixRandom2 = new int[MATRIX_SIZE][MATRIX_SIZE];
		int [][] matrixResult = new int[MATRIX_SIZE][MATRIX_SIZE];
		int sum = 0;
		
		// Process
		// Generate random matrixes
		for(int i = 0; i < matrixRandom1.length; i++) {
			for(int j = 0; j < matrixRandom1[0].length; j++) {
				matrixRandom1[i][j] = (int) Math.floor(Math.random()*9);
				matrixRandom2[i][j] = (int) Math.floor(Math.random()*9);
			}
		}
		// Multiplication of Matrix
		for(int i = 0; i < matrixRandom1.length; i++) {
			for(int j = 0; j < matrixRandom1[0].length; j++) {
				for(int k=0; k < matrixRandom1.length; k++) {
					sum = sum + (matrixRandom1[i][k]* matrixRandom2[k][j]);
				}
				matrixResult[i][j] = sum;
				sum = 0;
			}
		}
		// Output
		System.out.println("Fitst Matrix");
		MatrixPrint(matrixRandom1);
		System.out.println("Second Matrix");
		MatrixPrint(matrixRandom2);
		System.out.println("Multiplication of Matrix ");
		MatrixPrint(matrixResult);
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
