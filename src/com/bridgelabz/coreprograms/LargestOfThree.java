package com.bridgelabz.coreprograms;

public class LargestOfThree {

	public static void main(String[] args) {
		int number1 = 30;
		int number2 = 24;
		int number3 = 42;
		
		System.out.println("number1:"+ number1 +"  number2:"+ number2 +"  number3:"+ number3 );
		
		if(number1 > number2) 
		{
			if(number1 > number3) 
			{
				System.out.println("number1 is the largest");
			}
			else 
			{
				System.out.println("number3 is the largest");
			}
		}
		else
		{ 
			if(number2 > number3)
			{
				System.out.println("number2 is the largest");
			}
			else
			{
				System.out.println("number3 is the largest");
			}
		}

	}

}
