package day04if_ifelse_ifelseif;

import java.util.Scanner;

public class IfElseIfStatement01 {

	public static void main(String[] args) {
		
		/*
		 Get a number from user, 
		 if the number is less than zero, print "Negative"
		 if the number is greater than zero, print "Positive"
		 if the number equals to zero, print "Neutr"
		*/
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter an integer...");
		int num = scanner.nextInt();
		
		if(num<0) {
			System.out.println(num + " is negative");
		}else if(num>0) {
			System.out.println(num + " is positive");
		}else {
			System.out.println(num + " is neutr");
		}
	}
}
