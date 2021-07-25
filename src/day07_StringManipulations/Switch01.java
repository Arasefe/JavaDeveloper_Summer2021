package day07_StringManipulations;

import java.util.Scanner;

public class Switch01 {

	public static void main(String[] args) {
		/*
		 	Ask user to enter the name of the month
		 	For January, February, March output will be First Quarter
		 	For April, May, June output will be Second Quarter
		 	For July, August, September output will be Third Quarter
		 	For October, November, December output will be Fourth Quarter
	   */
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the name of the month...");
		String m = scanner.next().toLowerCase();
		
		switch(m) {
			
			case "january":
			case "february":
			case "march":
				System.out.println("First Quarter");
				break;
			case "april":
			case "may":
			case "june":
				System.out.println("Second Quarter");
				break;
			case "july":
			case "august":
			case "september":
				System.out.println("Third Quarter");
				break;
			case "october":
			case "november":
			case "december":
				System.out.println("Fourth Quarter");
				break;
				
		}

	}

}
