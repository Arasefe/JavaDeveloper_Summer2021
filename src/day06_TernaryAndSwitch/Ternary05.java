package day06_TernaryAndSwitch;

import java.util.Scanner;

public class Ternary05 {

	public static void main(String[] args) {
		/*
		 	Ask user to enter a number. 
		 	If the number is less than 10 and greater than or equal to 0, calculate its cube. 
		 	Otherwise, calculate its square.
					Cube of a = a*a*a           Square of a = a*a 
		*/
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number...");
		double a = scanner.nextDouble();
		
		String result = a>=0 && a<10 ? "Cube: " + Math.pow(a, 3) : "Square: " + Math.pow(a, 2);
		System.out.println(result);
	}
}
