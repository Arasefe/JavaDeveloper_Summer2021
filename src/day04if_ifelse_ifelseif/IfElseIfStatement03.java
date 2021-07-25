package day04if_ifelse_ifelseif;

import java.util.Scanner;

public class IfElseIfStatement03 {

	public static void main(String[] args) {
		/*
		 	A school has following rules for grading system:
			1. Below 50 - D   2. 50 to 59 - C     3. 60 to 79 - B.   4. From 80 to 100 - A 
			Ask user to enter marks and print the corresponding grade.
		*/
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your mark...");
		int m = scanner.nextInt();		
		
		if(m<0) {
			System.out.println("Please do not enter negative values");
		}else if(m<50) {
			System.out.println("D");
		}else if(m<60) {
			System.out.println("C");
		}else if(m<80) {
			System.out.println("B");
		}else if(m<101) {
			System.out.println("A");
		}else {
			System.out.println("Please enter 100 at most...");
		}
	}
}
