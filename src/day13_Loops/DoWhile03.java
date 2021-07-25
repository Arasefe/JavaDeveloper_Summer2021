package day13_Loops;

import java.util.Scanner;

public class DoWhile03 {

	public static void main(String[] args) {
		
		/*
			 Ask user to enter password.
			 If the password has more than 6 characters print "Password is valid..."
			 Otherwise, print "Make the password longer than 6 characters" and ask user to enter a new password
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		String pwd = "";
		
		do {
			
			System.out.println("Enter your password...");
			
			pwd = scanner.nextLine();
			
			if(pwd.length()<=6) {
				
				System.out.println("Make the password has more than 6 characters!");
				
			}
			
			
		}while(pwd.length()<=6);
		
		System.out.println("Password is valid...");

	}

}
