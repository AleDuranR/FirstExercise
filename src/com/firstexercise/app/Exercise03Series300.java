package com.firstexercise.app;

public class Exercise03Series300 {
	public static void main(String[] args) {
		//TODO Imprimir 0-300 con incremento/decremento 3
		for(int num=1;num<=300;num+=3) {
			System.out.print(num+" ");
		}
		System.out.println();
		for(int num=300;num>=1;num-=3) {
			System.out.print(num+" ");
		}
	}
}
