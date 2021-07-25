package day12_Loops;

import java.util.Scanner;

public class WhileLoop03 {

	public static void main(String[] args) {
		
		/*
			 Type java code by using while loop, 
	         Write a program to count the factors of an integer which is entered by user.
	         Factors of 12 = 1, 2, 3, 4, 6, 12
	         Factors of 8  = 1, 2, 4, 8
		 */
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number...");
		int n = Math.abs(scanner.nextInt());
		
		int i = 1;
		int counter = 0;//flag

		while(i<=n) {
			if(n%i==0) {	
				counter++;
				System.out.print(i + " ");				
			}			
			i++;
		}
		System.out.println();
		System.out.println("The number of positive factors: " + counter);
	}

}
