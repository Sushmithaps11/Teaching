package com.logic.program1;

import java.util.Scanner;

//5! = 5*4*3**2*1
// or    1*2*3*4*5

public class FactorialOfNumber
{
	public static void main(String[] args) {
		
	
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your Number");
    
    int num =sc.nextInt();
    
    long Factorial = 1;
    
    for(int i=1;i<=num;i++)
    {
    	Factorial = Factorial*i;
    }
    
    System.out.println("Factorial of number is : "+ Factorial);
	} 
    

	
}
