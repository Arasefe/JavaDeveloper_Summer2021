package day02_Scanner;

import java.util.Scanner;

public class Scanner5 {
    public static void main(String[] args) {
		/*
		 	Type a program which calculates the area and the perimeter
		 	of a rectangle whose length and width are entered by user.
			Hint 1: Area of a rectangle is width x length
			Hint 2: Perimeter of a rectangle is 2*(width + length)
		*/
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the length of the rectangle...");
        double length = scanner.nextDouble();

        System.out.println("Enter the width of the rectangle");
        double width = scanner.nextDouble();

        System.out.println("Area:" + width*length);
        System.out.println("Perimeter:" + 2*(width+length));
    }
}
