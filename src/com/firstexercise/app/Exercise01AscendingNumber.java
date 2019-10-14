package com.firstexercise.app;

public class Exercise01AscendingNumber {
	public static void main(String[] args) {
		// TODO Mostrar numeros: 
		// 0-10 de 1 en 1 / 0-100 / 0-1000
		int num=0;
		while(num<10) {
			num++;
			System.out.print(num+" ");
		}
		System.out.println("");
		num=0;
		while(num<100) {
			num++;
			System.out.print(num+" ");
		}
		System.out.println();
		num=0;
		while(num<1000) {
			num++;
			System.out.print(num+" ");
		}
	}
}
