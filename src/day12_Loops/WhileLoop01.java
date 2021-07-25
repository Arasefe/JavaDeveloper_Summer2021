package day12_Loops;

import java.util.Scanner;

public class WhileLoop01 {

	public static void main(String[] args) {
		
		/*
		 	 Type java code by using while loop, 
	         Write a program that prompts the user to input a number. 
	         It should then print the multiplication table of that number. 
	         
	         3x1=3  3x2=6  3x3=9  3x4=12 3x5=15  3x6=18  3x7=21  3x8=24  3x9=27  3x10=30 
		*/
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number...");
		int num = scanner.nextInt();
		
		int i = 1;		
		while(i<11) {			
			System.out.println(num + "x" + i + "=" + num*i);			
			i++;
		}
	}
}
