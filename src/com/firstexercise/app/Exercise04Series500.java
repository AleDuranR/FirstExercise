package com.firstexercise.app;

public class Exercise04Series500 {
	public static void main(String[] args) {
		//TODO Imprimir 0-500 con incremento/decremento 5
		for(int num=1;num<=500;num+=5) {
			System.out.print(num+" ");
		}
		System.out.println();
		for(int num=500;num>=1;num-=5) {
			System.out.print(num+" ");
		}
	}
}
