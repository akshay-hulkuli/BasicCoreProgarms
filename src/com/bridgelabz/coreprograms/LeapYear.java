package com.bridgelabz.coreprograms;

public class LeapYear {

	public static void main(String[] args) {
		int year = 1996;
		if(Integer.toString(year).length() != 4) 
		{
			System.err.println("Please ensure that year is a 4 digit number");
		}
		else 
		{
			if((year%4 == 0 && year%100 != 0) || year % 400 == 0)
			{
				System.out.println(year +" : This is a leap year");
			}
			else
			{
				System.out.println(year+" : This is not a leap year");
			}
		}

	}

}
