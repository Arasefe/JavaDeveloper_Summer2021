package day13_Loops;

import java.util.Scanner;

public class DoWhile01 {

	public static void main(String[] args) {
		
		/*
			 Ask user to enter an integer
		     If the integer is even print on the console "You won!"
			 Otherwise ask user to enter another integer
		*/
		
		Scanner scanner = new Scanner(System.in);
		
		int n = 0;

		do {			
			System.out.println("Enter an integer");
			n = scanner.nextInt();	
		}while(n%2!=0);

		System.out.println("You won!...");
	}
}
