package day24_MultiThreadSyncEncapsulation;

public class School {

	public static void main(String[] args) {
		
		//1.Way: Default constructor
		Student student1 = new Student();
		System.out.println(student1.getName());//Mark Stone
		
		student1.setName("Ali Can");
		System.out.println(student1.getName());//Ali Can
		
		//2.Way: Use constructor with parameters
		Student student2 = new Student("Veli Han", 43, true);
		
	
		//3.Way: Create object by using default constructor, then update the values by using setters
		Student student3 = new Student();
		student3.setName("Mary Star");
		student3.setSuccessful(false);
	}
}
