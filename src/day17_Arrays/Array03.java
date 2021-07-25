package day17_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Array03 {
	
	/*
	 	1)Create a String array by getting the length and the elements from user
	 	2)Type program to find how many characters are used in array elements
	*/

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the length of the array...");		
		int length = scanner.nextInt();	
		String s[] = new String[length];

		System.out.println("Enter String array elements...");
		for(int i=0; i<length; i++) {		
			s[i] = scanner.next();
		}
		System.out.println(Arrays.toString(s));
		
		int sum = 0;
		for(int i=0; i<length; i++) {
			sum = sum + s[i].length();
		}

		System.out.println("The number of characters user entered: " + sum);
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
