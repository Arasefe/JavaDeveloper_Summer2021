package day02_Scanner;

import java.util.Scanner;

public class Scanner6 {
    public static void main(String[] args) {
		/*
		 	Type a program which calculates the volume of a rectangular prism
			whose length, width, and height are entered by user.
			Hint 1: Volume of a rectangular prism is width x length x height
		*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the width, length, and height...");
        double w = scanner.nextDouble();
        double l = scanner.nextDouble();
        double h = scanner.nextDouble();

        System.out.println("Volume: " + w*l*h);

    }

}
