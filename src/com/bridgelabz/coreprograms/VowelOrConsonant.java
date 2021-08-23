package com.bridgelabz.coreprograms;

public class VowelOrConsonant {

	public static void main(String[] args) {
		char alphabet = 'd';
		// if alphabet is lowercase then convert it into uppercase
		
		if(alphabet >= 'a' && alphabet <= 'z') 
		{
			alphabet -= ('a'-'A');
		}
		
		
		if(alphabet == 'A' || alphabet == 'E' || alphabet == 'I' || alphabet == 'O' || alphabet == 'U') 
		{
			System.out.println(" given alphabet is VOWEL");
			
		}
		else 
		{
			System.out.println("Given alphabet  is CONSONANT");
		}
	}

}
