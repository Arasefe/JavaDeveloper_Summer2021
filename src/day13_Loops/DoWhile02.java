package day13_Loops;

import java.util.Scanner;

public class DoWhile02 {

	public static void main(String[] args) {
		/*
			 Ask user to enter his/her first name
			 If the initial is lower case print a message like "Make the initial upper case"
			 If the initial is upper case print a message like "You did it right"
		*/
		
		Scanner scanner = new Scanner(System.in);
		
		char initial = '?';
		
		do {
			
			System.out.println("Enter your first name...");
			
			initial = scanner.next().charAt(0);
			
			if(initial>='a' && initial<='z') {
				System.out.println("Make the initial upper case");
			}
					
		}while(initial>='a' && initial<='z');
		
		System.out.println("You did it right at the end...");

	}

}
