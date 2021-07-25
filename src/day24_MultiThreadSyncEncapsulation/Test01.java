package day24_MultiThreadSyncEncapsulation;

public class Test01 {

	public static void main(String[] args) {
		
		String str1 = "Java";
		String str2 = "Java";
		String str3 = new String("Java");
		StringBuilder strbld1 = new StringBuilder("Java");
		
		if(str1 == str2) {
			System.out.println("str1 and str2 equal to eachother with == ");
		}
		
		if(str1 == str3) {
			System.out.println("1) str1 and str3 equal to eachother with == ");
		}
		
		if(str1.equals(str3)) {
			System.out.println("2) str1 and str3 equal to eachother with .equals() ");
		}
		
		//If you compare data in different data types with "==", Java gives you Compile Time Error
//		if(str1 == strbld1) {
//			System.out.println("1) str1 and strbld1 equal to eachother with == ");
//		}
		
		//If you compare data in different data types with "equals()", Java returns false
		if(str1.equals(strbld1)) {
		System.out.println("2) str1 and strbld1 equal to eachother with .equals() ");
		}

	}

}
