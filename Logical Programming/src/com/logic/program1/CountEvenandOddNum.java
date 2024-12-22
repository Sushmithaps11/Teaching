package com.logic.program1;

import java.util.Scanner;

public class CountEvenandOddNum 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num = sc.nextInt();
		
		int evencount = 0;
		int oddcount = 0;
		
		while(num>0)
		{
			 int rem = num%10;
			 
			if(rem%2==0)
			{
				evencount++;
			}
			else
			{
				oddcount++;
			}
			num = num/10;
		}
		System.out.println("Number of Even digits :" + evencount);
		System.out.println("Number of Odd digits :" + oddcount);
	}

}
