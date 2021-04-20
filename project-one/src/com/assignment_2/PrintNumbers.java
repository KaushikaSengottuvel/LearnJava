package com.assignment_2;

public class PrintNumbers {

	public static void main(String[] args) {

		int num = 1;
		for(int i= 0; i<101 ; i++)
		{
			if(num%3==0 && num%5==0)
			{
				System.out.println(num);
			}
			num++;
		}
		
	}

}
