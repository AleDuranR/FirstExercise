package com.firstexercise.app;

import java.util.Scanner;
import java.lang.Math;
public class Exercise10GeneralFormula {
	public static void main(String[] args) {
		// Constant
		// caracteres especiales de JAVA
				String s = "\\u00B2"; // U N I C O D E
				// 'parseInt(Value,radix)' Convierte un argumento tipo cadena y devuelve un entero de la base especificada
				// Value el string que convertira en un entero
				// radix la base en la que se convertira
			    char NUMBER_2 = (char) Integer.parseInt( s.substring(2), 16 );
			    
		// Variable
		double a = 0;
		double b = 0;
		double c = 0;
		double resultado1 = 0;
		double resultado2 = 0;
		
		// Object declaration
		Scanner scan = new Scanner(System.in);
			
		// Input
		System.out.format("Knowing that ax%c + bx + c = 0, the value of 'a' is: ",NUMBER_2);
		a = scan.nextDouble();
		System.out.format("Knowing that ax%c + bx + c = 0, the value of 'b' is: ",NUMBER_2);
		b = scan.nextDouble();
		System.out.format("Knowing that ax%c+ bx + c = 0, the value of 'c' is: ",NUMBER_2);
		c = scan.nextDouble();
				
		// Process
		resultado1 = (-b+Math.sqrt((b*b)-(4*a*c)))/(2*a);
		resultado2 = (-b-Math.sqrt((b*b)-(4*a*c)))/(2*a);
		
		// Output
		System.out.format("The value of 'x' of the ecuation %d x%c + %d x + %d = 0 is: %.2f and %.2f ", (int)a, NUMBER_2, (int)b, (int)c,resultado1, resultado2);
		
		// Terminator
		scan.close();
		
	}
}
