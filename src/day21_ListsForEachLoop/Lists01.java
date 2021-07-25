package day21_ListsForEachLoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lists01 {

	public static void main(String[] args) {
	
		Character c[] = new Character[4];
		c[0] = 'a';
		c[1] = 'b';
		c[2] = 'c';
		c[3] = 'd';
		System.out.println(Arrays.toString(c));
		
		List<Character> lc = new ArrayList<>();
		
		//How to convert an array to a list
		//1.Way: Use loops...
		for(int i=0; i<c.length; i++) {
			lc.add(c[i]);
		}
		System.out.println(lc);
		
		//2.Way:
		//We will use Arrays.asList() method to convert an array to a list.
		//But when you use Arrays.asList() method data types of array elements should be "non-primitive"
		//I mean instead of "int", use "Integer" etc.
		List<Character> l1c = Arrays.asList(c);
		System.out.println(l1c);
		
		String s[] = {"Ali", "Can", "Veli"};
		List<String> l2c = Arrays.asList(s);
		System.out.println(l2c);
		
		Integer irr[] = {2, 5, 3, 1};
		List<Integer> l3c = Arrays.asList(irr);
		System.out.println(l3c);
		
		/*
		 	When you run the following commented out codes you will get "UnsupportedOperationException" because
		 	the list is created from an array, and the list has some array features. The significant array feature is to be 
		 	fixed in length. 
		 	So if you create a list from an array, you cannot use any list method which changes the size.
		*/
//		l3c.add(7);
//		System.out.println(l3c);
		
//		l3c.remove(1);
//		System.out.println(l3c);
		
//		l3c.clear();
//		System.out.println(l3c);
		
//		System.out.println(l3c.contains(3));
		
		l3c.set(1, 15);
		System.out.println(l3c);
		
		
		//How to convert a List to an Array
		List<Integer> list = new ArrayList<>();
		list.add(12);
		list.add(15);
		list.add(11);
		list.add(8);
		
		System.out.println(list);//[12, 15, 11, 8]
		
		//In the code "new Integer[0]", data type depends on the data type of the list elements.
		//In the example, data type of the list elements is Integer because of that I used Integer 
		Integer arr[] = list.toArray(new Integer[0]);
		
		System.out.println(Arrays.toString(arr));//[12, 15, 11, 8]

	}

}
