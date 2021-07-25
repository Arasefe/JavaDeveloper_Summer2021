package day18_MultiDArray;

import java.util.Arrays;

public class MultiDimensionalArrays01 {

	public static void main(String[] args) {

		int arr[][] = new int[3][2];
		
		System.out.println(Arrays.toString(arr));//[[I@626b2d4a, [I@5e91993f, [I@1c4af82c]
		//To print multi dimensional arrays use Arrays.deepToString()
		System.out.println(Arrays.deepToString(arr));//[[0, 0], [0, 0], [0, 0]]
		
		arr[0][0] = 3;
		arr[0][1] = 2;
		
		arr[1][0] = 11;
		arr[1][1] = -5;
		
		arr[2][0] = 1;
		arr[2][1] = 0;
		
		System.out.println(Arrays.deepToString(arr));//[[3, 2], [11, -5], [1, 0]]
		int brr[][] = { {2, 3}, {12, 13, 14, 16, 15}, {7}, {-2, -3, -4} };		
		System.out.println(Arrays.deepToString(brr));//[[2, 3], [12, 13, 14, 16, 15], [7], [-2, -3, -4]]
				
		/*
		 	{ {2, 3}, {12, 13, 14} }
		 	
		 	Type the code to find the sum of the elements
		*/
		int crr[][] = { {2}, {12, 13, 14, 10}, {5, 7} };
	
		int sum = 0; 

		for(int i=0; i< crr.length;            i++) {		
			for(int k=0; k<crr[i].length;      k++) {
				sum = sum + crr[i][k];
			}		
		}		
		System.out.println(sum);

	}

}
