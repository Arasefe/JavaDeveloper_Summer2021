package day06_TernaryAndSwitch;

import java.util.Scanner;

public class Ternary04 {

	public static void main(String[] args) {
		/*
		 	Ask user to enter an integer. 
		 	If the number has 3 digits, output will be “This number has 3 digits.” 
		 	Otherwise, output will be “This number has no 3 digits.”
		*/
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter an integer...");
		int a = scanner.nextInt();
		int b = Math.abs(a);

		String result = b>99 && b<1000 ? a + " has 3 digits" : a + " has no 3 digits";
		System.out.println(result);
	}

}