package com.bridgelabz.coreprograms;

public class Swap2Numbers {

	public static void main(String[] args) {
		int number1 = 7;
		int number2 = 4;
		
		System.out.println("Before swapping --> number1 : "+number1+" number2 : "+number2);
		
		// swap using temporary variable
		int temp = number1;
		number1 = number2;
		number2 = temp;
		
		System.out.println("After swapping --> number1 : "+number1+" number2 : "+number2);
		
		
		//swap without temporary variable
		
//		number1 = number1+number2;
//		number2 = number1 - number2;
//		number1 = number1- number2;
//		System.out.println("After 2nd swapping --> number1 : "+number1+" number2 : "+number2);

	}

}
