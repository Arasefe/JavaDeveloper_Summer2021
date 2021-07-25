package day24_MultiThreadSyncEncapsulation;

	/*
	 	1)In Java, there is parent-child relationship
	 	2)A parent can have infitely many child classes
	 	  A child can have just a single parent Java.
	 	  It means, Java does not support multiple inheritance.
	 	3)Inheritance means; child classes can use class members from 
	 	  parent class
	 	4)Inheritance is so beneficial in
	 	  a)Ending repetation
	 	  b)Maintenance
	 	  c)Reusability
	 	5)A child class may have grandparents as well
	*/

	/*
	 	1)Single Inheritance: Child can have just a single parent
	 	2)Hierachical Inheritance: A parent will have mutliple child classes
	 	3)Multi-level Inheritance: If a child has parent, grandparent, grand-grandparent,...
	 */

public class Animal {
	
	public void move() {
		System.out.println("Animals move...");
	}
	
	public void eat() {
		System.out.println("Animals eat...");
	}

}
