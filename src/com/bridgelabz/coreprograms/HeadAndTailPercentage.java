package com.bridgelabz.coreprograms;

public class HeadAndTailPercentage {

	public static void main(String[] args) {
		int numberOfFlips = 10;
		int headsCount = 0;
		for (int i=0; i< numberOfFlips; i++) 
		{
			if(numberOfFlips <= 0) 
			{
				System.err.println("Number of Flips must be a positive integer");
			}
			else 
			{
				if(Math.random() > 0.5)
				{
					headsCount++;
				}
			}
		} 
		 int headsPercentage = (headsCount*100)/numberOfFlips;
		 int tailsPercentage = 100-headsPercentage;
		 System.out.println("Heads Percentage : "+ headsPercentage);
		 System.out.println("Tails Percentage : "+ tailsPercentage);
	}

}
