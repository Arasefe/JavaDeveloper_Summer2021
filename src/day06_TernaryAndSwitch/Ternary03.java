package day06_TernaryAndSwitch;

import java.util.Scanner;

public class Ternary03 {

	public static void main(String[] args) {
		
		/*
		 	Ask user to enter a String. 
		 	If the String has 2 characters, output will be “It is valid for state abbreviations” 
		 	Otherwise, output will be “It is not valid for state abbreviations”
		*/
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a String...");
		String s = scanner.nextLine();
		
		                //Condition     ?     code1                                 :              code2
		String result = s.length()==2   ?   "It is valid for state abbreviations"   :   "It is not valid for state abbreviations";
		System.out.println(result);

	}

}
