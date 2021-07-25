package day16_StaticKeyword;

import java.util.Scanner;

public class StudentsRunner {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		do {
			System.out.println("Enter your firstname");
			String first = scanner.next();
			System.out.println("Enter your lastname");
			String last = scanner.next();
			String name = first + " " + last;
			System.out.println("Enter your grade");
			int grade = scanner.nextInt();
			System.out.println("Enter your registration year");
			int year = scanner.nextInt();
			
			Students std1 = new Students(name, grade, year);
			System.out.println("Student Name: " + std1.name);
			System.out.println("Student Grade: " + std1.grade);
			System.out.println("Student Registration Year: " + std1.registrationYear);
			System.out.println("Student id: " + Students.id);
			
			System.out.println("To quit press Q, to continue press A");
			String quit = scanner.next().toUpperCase();
			if(quit.equals("Q")) {
				break;
			}
			
		}while(true);
		
		System.out.println("See you later...");

		scanner.close();
	}

}
