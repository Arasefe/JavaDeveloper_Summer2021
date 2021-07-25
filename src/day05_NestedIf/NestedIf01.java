package day05_NestedIf;

import java.util.Scanner;

public class NestedIf01 {

	public static void main(String[] args) {
		/*
		 	Ask user to enter his/her age and gender(M ==> Male, F==>Female)
		 	If the age is negative, and gender is different from 'M' and 'F' give error message
		 	If the age is greater than 65 and gender is male print "Retired" otherwise "Need to work"
		 	If the age is greater than 60 and gender is female print "Retired" otherwise "Need to work"
		 */
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter your age...");
		int age = scanner.nextInt();
		
		System.out.println("Enter your gender...(M/F)");
		
		char gender = scanner.next().toUpperCase().charAt(0);

		if(age<0) {
			
			System.out.println("Make age>0, male='M', female='F'");
			
		}else if(!(gender=='M' || gender=='F')) {
			
			System.out.println("Make age>0, male='M', female='F'");
			
		}else if(gender=='M') {
			
			if(age>65) {
				System.out.println("Retired");
			}else {
				System.out.println("Need to work");
			}
				
		}else if(gender=='F'){
			
			if(age>60) {
				System.out.println("Retired");
			}else {
				System.out.println("Need to work");
			}
			
		}

	}

}
