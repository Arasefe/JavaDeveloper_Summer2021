package day06_TernaryAndSwitch;

import java.util.Scanner;

public class NestedTernary02 {

	public static void main(String[] args) {
		
		/*
		 	Ask user to enter his/her age and gender(M ==> Male, F==>Female)
		 	If the age is greater than 65 and gender is male print "Retired" otherwise "Need to work"
		 	If the age is greater than 60 and gender is female print "Retired" otherwise "Need to work"
		*/
		
        Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your age...");
		int age = scanner.nextInt();
		System.out.println("Enter your gender...(M/F)");
		char gender = scanner.next().toUpperCase().charAt(0);
		
		String result = gender == 'M' ? (age>65 ? "Retired" : "Need to work"):(age>60 ? "Retired" : "Need to work");
		System.out.println(result);
	}
}
