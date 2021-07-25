package day02_Scanner;

import java.util.Scanner;

public class Scanner3 {
    public static void main(String[] args) {

        //Type a program which calculates the cube of a number
        //which is entered by user. a ==> Cube: a*a*a

        Scanner scanner = new Scanner(System.in);
        System.out.println("Hey user, enter a number to calculate its cube...");
        double number = scanner.nextDouble();
        System.out.println(number*number*number);
    }
}
