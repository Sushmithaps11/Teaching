package com.logic.program1;

import java.util.Scanner;

public class PetersonNumber
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num = sc.nextInt();
		
		int sum = 0;
		int originalnum = num;
		while(num>0)
		{
			int rem = num%10;
			int fact = 1;
			for(int i=1; i<=rem; i++)
			{
				fact = fact*i;
			}
			num = num/10;
			sum = sum + fact;
		}
		if(originalnum==sum)
		{
			System.out.println("Number is Peterson ");
		}
		else {
			System.out.println("Number is not Peterson ");
		}
	
	}

}
