package com.logic.program1;

import java.util.Scanner;

public class CheckNumIsPalindrome 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number");
		int num = sc.nextInt();
		
		int orginalnum = num;
		
		int rev = 0;
		
		while(num!=0)
		{
		 rev = rev*10 + num%10;
		 num = num/10;
		}
		
		if(orginalnum==rev)
		{
			System.out.println("Number is Palindrome");
		}
		else
		{
			System.out.println("Number is Not Palindrome");	
		}
	}

}
