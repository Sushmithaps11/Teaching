package com.logic.program1;

public class SwapTheNumber 

{
	//With using third party variable(temp)
	public static void Swap(int a,int b)
	{
		System.out.println("Before Swap -- " + a + " " +b);
		int temp = a;
		a=b;
		b=temp;
		System.out.println("After Swap -- "  + a + " " +b);
	}
	
	//Without using third party variable
	public static void Swap2(int a,int b)
	{
		System.out.println("Before Swap -- " + a + " " +b);
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("After Swap -- " + a + " " +b);
	}
	
	public static void Swap3(int a,int b)
	{
		//Using XOR(^) Bitwise operator
		System.out.println("Before Swap -- " + a + " " +b);
		a=a^b;
		b=a^b;
		a=a^b;
		System.out.println("After Swap -- " + a + " " +b);
	}
	
	
	public static void main(String[] args) 
	{
		System.out.println("Swapping by using third party variable");
		Swap(10,20);
		System.out.println("Swapping by Without using third party variable");
		Swap2(5,10);
		Swap2(20,-15);
		Swap2(-10,-20);
		System.out.println("Swapping by Without using Arthmetic Operator");
		Swap3(100,120);
		Swap(10,10);
		
	}
	
}

