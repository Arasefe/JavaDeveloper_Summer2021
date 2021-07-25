package day15_Constructor;

public class AnimalRunner {

	public static void main(String[] args) {
		
		Animal a01 = new Animal("Puppy");
		
		System.out.println(a01.age);//5
		System.out.println(a01.name);//Bobby
		System.out.println(a01.specy);//Puppy
		System.out.println(a01.gender);//M
		System.out.println(a01.isCarnivorous);//false
		
		System.out.println(Animal.counter);//2
		

	}

}
