package com.assignment_2;

public class PrintEvenOddNumber {

	public static void main(String[] args) {

		int i,num;
		for(num=1 ; num<101 ; num++)
		{
			i=num%2;
			if(i==0) System.out.println(num+" - even");
			else System.out.println(num+" - odd");
		}
		
	}

}
