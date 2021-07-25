package day02_Scanner;

import java.util.Scanner;

public class Scanner4 {
    public static void main(String[] args) {
		/*
		 	Type a program which calculates the area and the perimeter of a square
            whose side length is entered by user.
            a ==> Area: a*a
            a ==> Perimeter: 4*a
		*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the side length of the square...");
        double side = scanner.nextDouble();

        System.out.println("Area: " + side*side);//Area: 25.0
        System.out.println("Perimeter: " + 4*side);//Perimeter: 20.0


    }
}
