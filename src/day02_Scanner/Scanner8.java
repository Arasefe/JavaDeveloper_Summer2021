package day02_Scanner;

import java.util.Scanner;

public class Scanner8 {
    public static void main(String[] args) {
		/*
		 	Type a program which converts the hours to seconds.
		 	Hours value will be entered by user. (Use long)
			Hint 1: second = hour x 60 x 60
		*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter hours to convert seconds...");
        double hours = scanner.nextDouble();

        System.out.println(hours*60*60 + "sec");


    }

}
