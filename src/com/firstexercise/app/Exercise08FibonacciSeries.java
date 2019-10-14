package com.firstexercise.app;

import java.util.Scanner;
public class Exercise08FibonacciSeries {
	public static void main(String[] args) {
		/*
		 * Serie de Fibonacci
		 * Entrada: 'limite'	Numero de Index de la serie de Fibonacci
		 * Salida: 	'lista'		Vector con la cantidad de numeros indicados respetadno la
		 * 						serie de Fibonacci 
		 * 
		 */
		int limite = 0;
		Scanner scan = new Scanner(System.in);
		System.out.print("Input a number ");
		limite = scan.nextInt();
		int[] lista = new int[limite];
		lista[1] = 0;
		lista[2] = 1;
		for(int index = 0;index<limite;index++) {
			if(index >= 3) {
				lista[index]=lista[index-1] + lista[index-2];
			}
			System.out.print(lista[index] + " ");
		}
		scan.close();
	}
}
