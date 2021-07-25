package day02_Scanner;

import java.util.Scanner;

public class Scanner7 {
    public static void main(String[] args) {
		/*
		 	Type a program which converts the mile to kilometer.
		 	Mile value will be entered by user. (Use double)
			Hint 1: km = mile x 1.6
			Hint 2: To get double, use nextDouble()
	   */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the mile to convert km...");
        double mile = scanner.nextDouble();

        System.out.println(mile*1.6 + "km");
    }
}
