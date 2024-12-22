package com.logic.program1;

import java.util.Scanner;

public class GreatestIn3Num 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st Number");
		int a = sc.nextInt();
		

		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter 2nd Number");
		int b = sc.nextInt();
		

		Scanner sc2 = new Scanner(System.in);
		System.out.println("Enter 3rd Number");
		int c = sc.nextInt();
		
		if(a>b && b>c)
		{
			System.out.println( a + " is largest");
		}
		else if(b>c && c>a)
		{
			System.out.println( b +" is largest");	
		}
		else
		{
			System.out.println( c +" is largest");
		}
		
		
	}

}
