package com.firstexercise.app;

import java.util.Scanner;
public class Exercise06OneSeriesMultiplyTable {
	public static void main(String[] args) {
		int factor=0;
		int producto=0;
		Scanner scan=new Scanner(System.in);
		System.out.print("Input a number ");
		factor=scan.nextInt();
		scan.close();
		for(int num=0;num<10;num++) {
			producto=factor*num;
			System.out.format(" %d + %d = %d \n",factor,num,producto);
		}		
	}
}
