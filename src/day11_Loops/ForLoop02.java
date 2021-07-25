package day11_Loops;

import java.util.Scanner;

public class ForLoop02 {

	public static void main(String[] args) {
		
		/*
		 	Type code to find the multiplication of the numbers from 1 to 10
		*/
		
		int prod = 1;		
		for(int i=1; i<5; i++) {			
			prod = prod * i;		
		}		
		System.out.println(prod);
		
		/*
		 	Ask user to enter a number the calculate the factorial of it.
		 	5! = 5*4*3*2*1 
		 	
		 	Note: 17! is greater than the maximum value of integer. Because of that if you use int as data type
		 	      in factorial codes you can calculate 16! at most.
		 	      
		 	      Java created another class for huge whole numbers, it is BigDecimal Class but we will learn it later.
		*/
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter an integer to calculate its factorial...");
		int x = scanner.nextInt();
		
		int p = 1;
		
		if(x<0) {
			
			System.out.println("Do not use negative numbers for factorial...");
			
		}else {
		
			for(int i=x; i>0; i--) {
				p= p * i;
			}
			
			System.out.println(x + "!=" + p);
		}
	}

}
