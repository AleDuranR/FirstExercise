package com.firstexercise.app;

import java.util.Scanner;
public class Exercise23RotateMatrix {

	public static void main(String[] args) {
		/* =======  TABLE OF INDEX FUNCTION  =======
		 *  	 1				2			3
		 *  [0,0] [0,2] | [0,0] [2,2] |	[0,0] [2,0]
		 *  [0,0] [1,2] | [0,0] [2,1] |	[0,0] [1,0]
		 *  [0,0] [2,2] | [0,0] [2,0] |	[0,0] [0,0]
		 *  [0,0] [0,1] | [0,0] [1,2] |	[0,0] [2,1]
		 *  [0,0] [1,1] | [0,0] [1,1] |	[0,0] [1,1]
		 *  [0,0] [2,1] | [0,0] [1,0] |	[0,0] [0,1]
		 *  [0,0] [0,0] | [0,0] [0,2] |	[0,0] [2,2]
		 *  [0,0] [1,0] | [0,0] [0,1] |	[0,0] [1,2]
		 *  [0,0] [2,0] | [0,0] [0,0] |	[0,0] [0,2]
		 */
		// Constant
		int MATRIX_SIZE = 10;
		
		// Object Declaration
		Scanner scan = new Scanner (System.in);
		
		// Variables
		int opc = 0;
		int timesRotation = 0;
		int [][] matrixRandom = new int[MATRIX_SIZE][MATRIX_SIZE];
		int [][] matrixResult = new int[MATRIX_SIZE][MATRIX_SIZE];
		
		// Create a random  matrix
		for(int i = 0; i < matrixRandom.length; i++) {
			for(int j = 0; j < matrixRandom[0].length; j++) {
				matrixRandom[i][j] = (int) Math.floor(Math.random()*9);
			}
		}
		
		
		
		// Process
		do {
			// Input
			System.out.format("Array \n");
			MatrixPrint(matrixRandom);
			System.out.print("How many times will you like to rotate the matrix ");
			timesRotation = scan.nextInt();
			opc = timesRotation - (int) (Math.floor((timesRotation/4)*4));
			// Process
			switch(opc) {
				case 0:
					// Sequential Search
					System.out.format("\nMatrix rotated %d times \n",timesRotation);
					break;
				case 1:
					// Binary Search
					System.out.format("\nMatrix rotated %d times \n",timesRotation);
					MatrixRotateOne(matrixRandom,matrixResult);
					MatrixPrint(matrixResult);
					break;
				case 2:
					System.out.format("\nMatrix rotated %d times \n",timesRotation);
					MatrixRotateTwo(matrixRandom,matrixResult);
					MatrixPrint(matrixResult);
					break;
				case 3:
					System.out.format("\nMatrix rotated %d times \n",timesRotation);
					MatrixRotateThree(matrixRandom,matrixResult);
					MatrixPrint(matrixResult);
					break;
				default:
					System.out.format("Method to be used: \n - Sequential Search (1) \n - Binary Search (2) \n - Exit (3) \n");
					opc = scan.nextInt();		
			}
		} while(opc !=3);
		scan.close();		
	}
	public static void MatrixRotateOne(int[][] array,int[][] arrayRotate) {
		int iRot = 0;
		int jRot = array.length-1;
		for(int i = 0; i <= array.length-1; i++) {
			for(int j = 0; j <= array[0].length-1; j++) {
				arrayRotate[iRot][jRot] = array[i][j];
				iRot++;
			}
			jRot--;
			iRot = 0;
		}
	}
	
	public static void MatrixRotateTwo(int[][] array,int[][] arrayRotate) {
		int iRot = array.length-1;
		int jRot = array.length-1;
		for(int i = 0; i <= array.length-1; i++) {
			for(int j = 0; j <= array[0].length-1; j++) {
				arrayRotate[iRot][jRot] = array[i][j];
				jRot--;
			}
			iRot--;
			jRot = array.length-1;
		}
	}
	
	public static void MatrixRotateThree(int[][] array,int[][] arrayRotate) {
		int iRot = array.length-1;
		int jRot = 0;
		for(int i = 0; i <= array.length-1; i++) {
			for(int j = 0; j <= array[0].length-1; j++) {
				arrayRotate[iRot][jRot] = array[i][j];
				iRot--;
			}
			jRot++;
			iRot = array.length-1;
		}
	}
	
	public static void MatrixPrint(int[][] array) {
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[0].length; j++) {
				System.out.format("%2d", array[i][j]);
			}
			System.out.println();
		}
	}

}
