package day14_MethodOverloadingConstructor;

public class Animal {
	
	String name;
	int age;
	String specy;
	
	static int counter = 0; 
	
	public Animal() {
		counter++;
	}
	
	public Animal(String name, int age, String specy) {
		this.name = name;
		this.age = age;
		this.specy = specy;
		counter++;
	}
	
	public Animal(int age, String specy) {
		this.age = age;
		this.specy = specy;
		counter++;
	}

}
