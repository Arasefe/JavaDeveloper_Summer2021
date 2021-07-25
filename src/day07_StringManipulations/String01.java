package day07_StringManipulations;

import java.util.Scanner;

public class String01 {

	public static void main(String[] args) {
		
		//1.Method: equals() ==> Compares the Strings with cases + Returns boolean
		//2.Method: equalsIgnoreCase() ==> Compares the Strings with ignoring cases + Returns boolean
		//3.Method: length() ==> Counts the number of characters in a String + Returns int
		String s1 = "";
		System.out.println(s1.length());//0 <== For empty String length() returns zero
		
		String s2 = " ";
		System.out.println(s2.length());//1 <== Space is a character like the other characters
		
//		String s3 = null;
//		System.out.println(s3.length());// NullPointerException <== Do not use length() for "null" Strings
		
		String s4 = "Learn Java earn money...";
		System.out.println(s4.length());//24
	    //4.Method: toUpperCase() ==> Converts all characters to uppercase + Returns String
		//5.Method: toLowerCase() ==> Converts all characters to lowercase + Returns String
		//6.Method: contains() ==> Checks if a specific character/s  exist in the String + Returns boolean
		String s5 = "java";
		System.out.println(s4.contains(s5));//false <== Because of the cases it returned false
		
		System.out.println(s4.contains(s2));//true
		
		System.out.println(s4.contains(s1));//true 
		
		//System.out.println(s4.contains(null));//It gives NullPointerException 

		//7.Method: charAt() ==> Use it to get a specific character from a String + Returns character
		String s6 = "Java is easy!";
		
		System.out.println(s6.charAt(0));//J <== Indexes start from zero, you get J
		
		//System.out.println(s6.charAt(13));//NullPointerException <== If you use index greater than the last index you will get error
		
		System.out.println(s6.charAt(12));//!
		
		/*
		 	Ask user to enter a String.
		 	Type code to return everytime the last character of the String
		*/
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a String to get the last character...");
		String s7 = scanner.nextLine();
		
		//The index of last character = The number of characters(length()) - 1
		//Note: For the last index, we use "length()-1" many times
		System.out.println(s7.charAt(s7.length()-1));
		
		//8.Method: indexOf() ==> It returns index of specific character/s + Returns int
		String s8 ="Java ahh Java!...";
		
		
		System.out.println(s8.indexOf("J"));//0 <== indexOf() method returns the index of first occurence of the given character
		System.out.println(s8.indexOf('J'));//0 <== In indexOf() method, both double and single quotes can be used
		
		System.out.println(s8.indexOf("x"));//-1 <== indexOf() method returns -1 for non-existing characters
		System.out.println(s8.indexOf('x'));//-1
		
		System.out.println(s8.indexOf(" "));//4
		System.out.println(s8.indexOf(' '));//4
		
		System.out.println(s8.indexOf(""));//0

		System.out.println(s8.indexOf("ahh"));//5 <== If you use multiple characters indexOf() method returns the index of first character
		
		System.out.println(s8.indexOf("ahha"));//-1 <== If you use multiple characters, Java checks if the whole String exist in the 
		                                       //       given String then it returns the index of the first character
		
		System.out.println(s8.indexOf("J", 1));//9
		System.out.println(s8.indexOf('a', 4));//5 <== It will skip first 4 characters then look for the first occurence of "a" and
		                                       //      will return the index of a
	}
}
