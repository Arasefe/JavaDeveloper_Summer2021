package day11_Loops;

import java.util.Scanner;

public class ForLoop03 {

	public static void main(String[] args) {
		
		/*
		 	Nested loops
		*/
		for(int i=1; i<4; i++) {
			for(int j=5; j<7; j++) {
				System.out.println(i + " - " + j);
			}

		}
		
		/*
		 	Ask user to enter the number of rows and the number columns then
		 	draw rectangle by using *	
		 	Example: row = 3, column=4
		 	         * * * *
		 	         * * * *
		 	         * * * *
		 */
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of rows...");
		int row = scanner.nextInt();
		System.out.println("Enter the number of columns...");
		int col = scanner.nextInt();

		for(int i=1; i<row+1; i++) {
			for(int j=1; j<col+1; j++) {
				System.out.print("* ");	
			}
			System.out.println();		
		}

	}

}
