package com.bridgelabz.coreprograms;

public class Factors {
	public static void main(String[] args) {
		int number = 200;
		if(number <=1 )
		{
			System.err.println("please enter positive integer");
			return;
		}
		for(int i=2; i*i<= number; i++)
		{
			while(number % i == 0) 
			{
				System.out.print(i+" ");
				number = number / i;
			}
		}
		
		if(number > 1) System.out.println(number);
	}

}
