package com.bridgelabz.coreprograms;

public class HarmonicNumber {

	public static void main(String[] args) {
		int lengthOfSeries = 5;
		double nthHarmonicValue = 0.0;
		
		if(lengthOfSeries < 1) 
		{
			System.err.println("Length of Series must be a positive integer");
		}
		else 
		{
			for(double i=1.0; i<= lengthOfSeries ; i++) 
			{
				nthHarmonicValue += (1/i);
			}
		}
		System.out.println("The "+lengthOfSeries+"th Harmonic value is : "+nthHarmonicValue);
	}

}
