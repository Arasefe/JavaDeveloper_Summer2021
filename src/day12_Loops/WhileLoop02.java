package day12_Loops;

import java.util.Scanner;

public class WhileLoop02 {

	public static void main(String[] args) {
		
		/*
			 Type java code by using while loop, 
	         Write a program that prompts the user to input an integer. 
	         It should then find sum of the digits of that number. 
	         	123 ==> 1+2+3 = 6
		*/
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number...");
		int n = Math.abs(scanner.nextInt());
		
		int sum = 0;

		while(n!=0) {
			sum = sum + n%10;
			n = n/10;	
		}
		
		System.out.println("The sum of the digits: " + sum);

	}

}
