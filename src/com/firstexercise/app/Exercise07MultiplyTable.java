package com.firstexercise.app;

import java.util.Scanner;
public class Exercise07MultiplyTable {
	public static void main(String[] args) {
		int inicio=0;
		int finales=0;
		int limite=0;
		int producto=0;
		System.out.print("Multiply table to begin ");
		Scanner scan=new Scanner(System.in);
		inicio=scan.nextInt();
		System.out.print("Multiply table to end ");
		finales=scan.nextInt();
		System.out.print("Which is the limit of the factor to multiply? ");
		limite=scan.nextInt();
				for(int i=0;i <= limite;i++) {
			for(int j=inicio;j <= finales;j++) {
				producto=j * i;
				System.out.format("%d x %d = %d  ",i,j,producto);
			}
			System.out.println();
		}
		scan.close();
	}
}
