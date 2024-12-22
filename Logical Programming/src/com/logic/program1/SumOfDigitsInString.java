package com.logic.program1;

public class SumOfDigitsInString
{
public static void main(String[] args) {
	String s1="Sush123";
	String s2=" ";
	
	int sum=0;
	
	for(int i=0;i<s1.length();i++)
	{
		char c=s1.charAt(i);
		if(Character.isDigit(c))
		{
			
		}
		else
		{
			s2=c+s1;
		}
	}
}	
}