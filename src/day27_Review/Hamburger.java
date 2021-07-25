package day27_Review;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Hamburger {
    /*
    1.A sandwich is two pieces of bread with something in between.
    Print the string that is between the first and last appearance of "bread" in the given string,
    or return string "nothing" if there are not two pieces of bread.
    EX: breadozkanbread --> ozkan, breadozkan --> nothing

    2.Print true if the string "java" and "python" appear the same number of times in the given string word.
    EX : javajavajavpythonpythonpyt --> true
     */
    public static void main(String[] args) {
        //isSandwich("breadarasbread");
        boolean result = isEqualFrequency("JavaPythonJavaPython");
        System.out.println(result);

        System.out.println(Arrays.deepToString(arrayGenerator(3,4)));

        int max=findMax((arrayGenerator(3,5)));
        System.out.println(max);

    }

    public static String isSandwich(String str) {
        int first = str.indexOf("bread");
        int second = str.lastIndexOf("bread");
        if (first == second)
            return "nothing";
        return str.substring(first + 5, second);
    }


    public static boolean isEqualFrequency(String str) {
        int countJava, countPython;
        countJava = countPython = 0;
        str = str.replace(" ", "").toLowerCase();
        for(int i = 0; i < str.length() - 5; i++){
            if(str.substring(i, i + 4).equals("java"))
                countJava++;
            if(str.substring(i, i + 6).equals("python"))
                countPython++;
        }
        if(str.endsWith("java"))
            countJava++;
        return countJava == countPython;

    }

    public static int[][] arrayGenerator(int outerSize, int innerSize){
        int[][]arr=new int[outerSize][innerSize];
        for (int i = 0; i < outerSize; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j]=new Random().nextInt(20);
            }
        }
        return arr;
    }

    // Find the biggest number from 2D Array
    public static int findMax(int[][]arr){
        int max=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j]>max){
                    max=arr[i][j];
                }
            }
        }
        return max;
    }


    public static int numberOfDigits(int num){
        int digit=0;
        while (num>0){
            num/=10;
            digit++;
        }

        return digit;
    }


    public static boolean isArmstrong(int num){
        String str=String.valueOf(num);
        int sum=0;
        for (int i = 0; i < str.length(); i++) {
            int each=Integer.parseInt(str.substring(i,i+1));
            sum+=Math.pow(each,numberOfDigits(num));
        }
        return sum==num;
    }


    public static ArrayList<Integer> listOfArmstrong(int num){
        ArrayList<Integer>listOfArmstrong=new ArrayList<>();
        for (int i = 0; i < num; i++) {
            if(isArmstrong(i)){
                listOfArmstrong.add(i);
            }
        }
        return listOfArmstrong;
    }


}
