package day24_MultiThreadSyncEncapsulation;

public class Student {
	
	/*
	 	Data Hiding Process is called "Encapsulation"
	 	
	 	1)To hide class members, use "private" access modifier for them.
	 	  If you do not want anybody to see object details, do not create "toString()"
	 	2)To read the value of hidden variables, we create "getters", and by using "getters" we can read the values 
	 	3)To update value of a variable for a specific student, use "setters"
	 	
	 	Note: To create an "immutable class"
	 		a)Make the variables private
	 		b)Do not create any setters
	 		
	    Note: getter() and setter() methods are called "Java Beans" in Java
	    
        Note:Getter method names start with "get" followed by "variable name"
             int number = 11; ==> Getter: getNumber() -   Setter: setNumber()
             But if the variable is "boolean", getter method names start with "is" followed by "variable name"
             boolean old = true; ==> Getter:isOld()  -  Setter: setOld() 
             
       Note: a)The return type of getter is same with the return type of the variable
             b)The return type of setter is "void" everytime.
             c)Getters do not use "parameters" but setters must use parameters to update the existing value
	*/
	
	private String name = "Mark Stone";
	private int age = 33;
	private boolean isSuccessful = false;
	
	public Student(String name, int age, boolean isSuccessful) {
		this.name = name;
		this.age = age;
		this.isSuccessful = isSuccessful;
	}

	public Student() {
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public boolean isSuccessful() {
		return isSuccessful;
	}

	public void setSuccessful(boolean isSuccessful) {
		this.isSuccessful = isSuccessful;
	}

}
