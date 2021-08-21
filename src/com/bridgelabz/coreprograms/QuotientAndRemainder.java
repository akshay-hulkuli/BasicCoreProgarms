package com.bridgelabz.coreprograms;

public class QuotientAndRemainder {
	public static void main(String[] args) {
		int divident = 200;
		int divisor = 7;
		int remainder=0, quotient=0;
		remainder = divident % divisor;
		quotient = divident / divisor;
		System.out.println("Quotient : "+ quotient);
		System.out.println("Remainder : "+remainder);	
	}
}
