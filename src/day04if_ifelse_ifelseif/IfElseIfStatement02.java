package day04if_ifelse_ifelseif;

import java.util.Scanner;

public class IfElseIfStatement02 {

	public static void main(String[] args) {
		
		//Get the day name from user, then tell to the user if it is week day or weekend day 
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the name of the day ...");
		String day = scanner.next();
		
		if(day.equalsIgnoreCase("sunday") || day.equalsIgnoreCase("saturday")) {
			System.out.println(day + " is weekend day");
		}else if(day.equalsIgnoreCase("monday") || day.equalsIgnoreCase("tuesday") ||
				day.equalsIgnoreCase("wednesday") || day.equalsIgnoreCase("thursday") ||
				day.equalsIgnoreCase("friday")) {
			System.out.println(day + " is week day");
		}else {
			System.out.println("I told you to enter day name, what are you doing?...");
		}
	}
}
