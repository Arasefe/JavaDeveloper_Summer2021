package day12_Loops;

public class DoWhileLoop01 {

	public static void main(String[] args) {
		
		/*
		  Difference between "while loop" and "do-while loop"
		  Answer: In  "do-while loop" loop body is executed at least once
		          But in "while loop" loop body execution depends on the condition. If the condition is false
		          while loop body is not executed even once...
		*/
		
		int i = 1;
		
		while(i>1) {			
			System.out.println("While Loop!...");			
			i++;
		}
		
		
		do {			
			System.out.println("Do-While Loop!...");			
			i--;			
		}while(i>1);

	}

}
